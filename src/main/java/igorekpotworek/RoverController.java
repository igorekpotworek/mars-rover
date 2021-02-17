package igorekpotworek;

import igorekpotworek.model.Heading;
import igorekpotworek.model.Rover;
import io.vavr.collection.CharSeq;

public class RoverController {

  private Rover rover;

  public RoverController(int x, int y, Heading heading) {
    rover = Rover.rover(x, y, heading);
  }

  public String move(String command) {
    rover = CharSeq.of(command).map(CommandFactory::create).foldLeft(rover, (r, c) -> c.apply(r));
    return rover.toString();
  }
}
