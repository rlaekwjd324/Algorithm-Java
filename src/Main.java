import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] sortedString = new String[21];
        for (int i = 1; i <= 20; i++) {
            sortedString[i] = String.valueOf(i);
        }
        for (int i = 0; i < 10; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int before = Integer.parseInt(stringTokenizer.nextToken());
            int after = Integer.parseInt(stringTokenizer.nextToken());
            sortedString = sortArray(before, after, sortedString);
        }
        for (int i = 1; i <= 20; i++) {
            System.out.print(sortedString[i] + " ");
        }
    }

    private static String[] sortArray(int before, int after, String[] array) {
        for (int i = 0; i <= (after - before) / 2; i++) {
            String temp = array[after - i];
            array[after - i] = array[before + i];
            array[before + i] = temp;
        }
        return array;
    }
}
