package pl.boringstuff;

public class PitExampleCalculator {

  public double calculate(final int a, final int b, final OperationType operationType) {
    switch (operationType) {
      case ADD:
        return add(a, b);
      case DIVIDE:
        return divide(a, b);
      case RANDOM:
        return random(a, b);
    }
    throw new IllegalStateException("impossible");
  }

  private double random(final int a, final int b) {
    if (a > 10) {
      return 1;
    }
    return a * b;
  }

  private double add(final int a, final int b) {
    return a + b;
  }

  private int divide(final int a, final int b) {
    if (b == 0) {
      throw new IllegalArgumentException("Bad idea!");
    } else {
      return a / b;
    }
  }

  enum OperationType {
    ADD, DIVIDE, RANDOM;
  }
}
