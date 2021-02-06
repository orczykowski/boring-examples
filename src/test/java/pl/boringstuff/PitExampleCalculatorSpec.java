package pl.boringstuff;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import static pl.boringstuff.PitExampleCalculator.OperationType.ADD;
import static pl.boringstuff.PitExampleCalculator.OperationType.DIVIDE;
import static pl.boringstuff.PitExampleCalculator.OperationType.RANDOM;

class PitExampleCalculatorSpec {

  PitExampleCalculator calculator = new PitExampleCalculator();

  @Test
  void shouldAddTwoValues() {
    final var result = calculator.calculate(1, 2, ADD);
    assertEquals(3, result);
  }

  @Test
  void shouldDivideTwoValues() {
    final var result = calculator.calculate(2, 2, DIVIDE);
    assertEquals(1, result);
  }

  @Test
  void shouldThrowExceptionWhenTryDivideByZero() {
    assertThrows(IllegalArgumentException.class, () -> calculator.calculate(2, 0, DIVIDE));
  }

  @Test
  void shouldReturnOneWhenCalculateRandomOperationWithFirstArgumentBiggerThenTen() {
    final var result = calculator.calculate(222, 2, RANDOM);
    assertEquals(1, result);
  }

  @Test
  void shouldMultiplyArgsWhenCalculationTypeIsRandom() {
    final var result = calculator.calculate(2, 2, RANDOM);
    assertEquals(4, result);
  }
}