package igorekpotworek.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Heading implements Rotatable {
  NORTH(Vector.vector(0, 1)) {
    @Override
    public Heading rotateRight() {
      return EAST;
    }

    @Override
    public Heading rotateLeft() {
      return WEST;
    }
  },

  EAST(Vector.vector(1, 0)) {
    @Override
    public Heading rotateRight() {
      return SOUTH;
    }

    @Override
    public Heading rotateLeft() {
      return NORTH;
    }
  },
  SOUTH(Vector.vector(0, -1)) {
    @Override
    public Heading rotateRight() {
      return WEST;
    }

    @Override
    public Heading rotateLeft() {
      return EAST;
    }
  },
  WEST(Vector.vector(-1, 0)) {
    @Override
    public Heading rotateRight() {
      return NORTH;
    }

    @Override
    public Heading rotateLeft() {
      return SOUTH;
    }
  };

  @Getter private final Vector vector;
}
