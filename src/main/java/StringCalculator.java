public class StringCalculator {
    public int add(String input) throws Exception {

        String[] numbers = input.split(",|\n");

        if (isEmpty(input)) {
            return 0;
        }
        if (input.length() == 1) {

            return Integer.parseInt(input);

        } else {
            return getSum(numbers);
        }
    }

    public int getSum(String[] numbers) throws Exception {

        for (String current : numbers) {
            if (Integer.parseInt(current) < 0) {
                throw new Exception("Numbers cannot be negative, throw an exception");
            }
        }

        int sum = 0;
        for (int num = 0; num < numbers.length; num++) {
            sum += Integer.parseInt(numbers[num]);
        }

        return sum;

    }

    //Helper methods
    private boolean isEmpty(String input) {
        return input.isEmpty();
    }
}
