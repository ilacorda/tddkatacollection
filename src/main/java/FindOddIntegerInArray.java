public class FindOddIntegerInArray {


    public static int findIt(int[] ints) {
        int oddCount = 0;
        for (int i = 0; i < ints.length; i++) {
            int number = ints[i];
            if (isOdd(number) && number != 1 && number > 0) {
                oddCount++;

            }

        }
        return oddCount;
    }

    private static boolean isOdd(int i) {
        return i % 2 != 0;
    }

}
