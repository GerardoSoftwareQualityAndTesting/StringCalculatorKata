package mx.tec.kata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

  StringCalculator calculator = new StringCalculator();

  @Test
  void testGivenCalculatorWhenAddEmptyStringThen0() {
    int expectedResult = 0;
    String inputNumbers = "";

    int actualResult = calculator.add(inputNumbers);
    assertEquals(expectedResult, actualResult);
  }

  @Test
  void testGivenCalculatorWhenAdd1Then1() {
    int expectedResult = 1;
    String inputNumbers = "1";

    int actualResult = calculator.add(inputNumbers);
    assertEquals(expectedResult, actualResult);
  }

  @Test
  void testGivenCalculatorWhenAdd1Comma2Then3() {
    int expectedResult = 3;
    String inputNumbers = "1,2";

    int actualResult = calculator.add(inputNumbers);
    assertEquals(expectedResult, actualResult);
  }

  @Test
  void testGivenCalculatorWhenAdd1_3_5_7_9Then25() {
    int expectedResult = 25;
    String inputNumbers = "1,3,5,7,9";

    int actualResult = calculator.add(inputNumbers);
    assertEquals(expectedResult, actualResult);
  }

  @Test
  void testGivenCalculatorWhenAdd1NewLine2CommaThen3() {
    int expectedResult = 3;
    String inputNumbers = "1\n2";

    int actualResult = calculator.add(inputNumbers);
    assertEquals(expectedResult, actualResult);
  }
  
  @Test
  void testGivenCalculatorWhenDelimiterPercent1Percent2Then3() {
    int expectedResult = 3;
    String inputNumbers = "//%\n1%2";

    int actualResult = calculator.add(inputNumbers);
    assertEquals(expectedResult, actualResult);
  }
}
