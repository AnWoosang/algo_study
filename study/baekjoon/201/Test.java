import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String str = "12345";
        int[] digits = Stream.of(str.split("")).mapToInt(Integer::parseInt).toArray();
        System.out.println( Arrays.toString(digits) );
    }
}
