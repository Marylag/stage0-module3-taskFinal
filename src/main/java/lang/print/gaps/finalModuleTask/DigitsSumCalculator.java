package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        DigitsSumCalculator calculator = new DigitsSumCalculator();

        calculator.calculateSum(1111);
        calculator.calculateSum(4567);
    }
}
