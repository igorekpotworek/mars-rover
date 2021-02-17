package igorekpotworek.model;

import lombok.Value;

@Value(staticConstructor = "vector")
public class Vector {
  int x;
  int y;

  public Vector multiply(int multiplier) {
    return vector(multiplier * x, multiplier * y);
  }
}
