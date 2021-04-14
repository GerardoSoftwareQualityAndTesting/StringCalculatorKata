package mx.tec.kata;

public class StringCalculator {

  public int add(String numbers) {
    if (!numbers.isBlank()) {
      String[] splitNumbers = numbers.split("\\n|,");
      int sum = 0;
      for (String numString : splitNumbers) {
        sum += Integer.parseInt(numString);
      }
      return sum;
    } else return 0;
  }
}
