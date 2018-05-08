import java.io.*;
import java.util.*;
import java.util.logging.Logger;

public class FizzBuzzCalculator {

    public static void main(String[] args) throws IOException {
        writeFizzBuzzResultsToFile();
        wordCountAndPrintToFile();
    }

    public String convert(int toConvertToFizzBuzz) {

        if (String.valueOf(toConvertToFizzBuzz).contains("3")) {
            return "Lucky";
        } else if (toConvertToFizzBuzz % 15 == 0) {
            return "FizzBuzz";
        } else if (toConvertToFizzBuzz % 5 == 0) {
            return "Buzz";
        } else if (toConvertToFizzBuzz % 3 == 0) {
            return "Fizz";
        }

        return String.valueOf(toConvertToFizzBuzz);
    }

    /*
     * Write the result of the FizzBuzz conversion to a file
     * TO DO: read from console instead of writing to a file and reading from there to generate the report
     */

    public static void writeFizzBuzzResultsToFile() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("put.txt"));
        for (int i = 1; i <= 20; i++) {
            writer.write(new FizzBuzzCalculator().convert(i) + "\n");

        }
        writer.close();
    }

    /*
     * Counts the occurrences of each output
     * Produce a report at the end of the program showing how many times the following were output
     * fizz: number of occurrences buzz: number of occurrences etc
     */

    public static void wordCountAndPrintToFile() throws IOException {

        Map<String, Integer> countByWords = new HashMap<String, Integer>();
        Scanner s = new Scanner(new File("put.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        while (s.hasNext()) {
            String next = s.next();
            Integer count = countByWords.get(next);
            if (count == null) {
                count = new Integer(0);
            }
            countByWords.put(next, count + 1);
        }
        s.close();
        writer.write(countByWords + "\n");
        writer.close();

    }
}
