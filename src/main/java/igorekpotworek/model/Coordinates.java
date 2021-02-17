package igorekpotworek.model;

import lombok.Value;

@Value(staticConstructor="coordinates")
public class Coordinates {
  int x;
  int y;

  public Coordinates move(Vector vector) {
    return new Coordinates(x + vector.x(), y + vector.y());
  }
}
