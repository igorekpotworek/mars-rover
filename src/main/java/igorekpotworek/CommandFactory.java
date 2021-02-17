package igorekpotworek;

import igorekpotworek.model.Rover;
import io.vavr.collection.HashMap;
import io.vavr.collection.Map;

import static java.lang.String.format;

class CommandFactory {
  private static final Map<Character, RoverCommand> COMMANDS =
      HashMap.<Character, RoverCommand>of('F', Rover::moveForward)
          .put('B', Rover::moveBackwards)
          .put('L', Rover::rotateLeft)
          .put('R', Rover::rotateRight);

  static RoverCommand create(char command) {
    return COMMANDS
        .get(command)
        .getOrElseThrow(
            () -> new IllegalArgumentException(format("Unrecognized command: %s", command)));
  }
}
