import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[] strings = bufferedReader.readLine().toCharArray();
        if (equalStringReverse(strings)) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }
    }

    private static boolean equalStringReverse(char[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
