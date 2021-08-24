import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());
        int[] array = new int[K];
        for (int i = 0; i < K; i++) {
            array[i] = reverseNumber((i + 1) * N);
        }
        Arrays.sort(array);
        System.out.print(array[K - 1]);
    }

    private static int reverseNumber(int num) {
        String number = String.valueOf(num);
        String[] numbers = new String[number.length()];
        if (number.length() == 1) {
            numbers[0] = number;
        }
        for (int i = 0; i <= number.length() / 2; i++) {
            numbers[i] = String.valueOf(number.charAt(number.length() - i - 1));
            numbers[number.length() - i - 1] = String.valueOf(number.charAt(i));
        }
        StringBuilder temp = new StringBuilder();
        for (String s : numbers) {
            temp.append(s);
        }
        return Integer.parseInt(temp.toString());
    }
}
