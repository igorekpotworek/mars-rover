package igorekpotworek.model;

import lombok.Value;

import static java.lang.String.format;

@Value
public class Rover {
  Coordinates coordinates;
  Heading heading;

  public static Rover rover(int x, int y, Heading heading) {
    return new Rover(Coordinates.coordinates(x, y), heading);
  }

  public Rover moveForward() {
    return new Rover(coordinates.move(heading.vector()), heading);
  }

  public Rover moveBackwards() {
    return new Rover(coordinates.move(heading.vector().multiply(-1)), heading);
  }

  public Rover rotateLeft() {
    return new Rover(coordinates, heading.rotateLeft());
  }

  public Rover rotateRight() {
    return new Rover(coordinates, heading.rotateRight());
  }

  @Override
  public String toString() {
    return format("(%s, %s) %s", coordinates.x(), coordinates.y(), heading);
  }
}
