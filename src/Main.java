import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[] stringToArray = bufferedReader.readLine().toCharArray();
        int[] alphabetCountArray = new int[26];
        for (char character : stringToArray) {
            for (int i = 97; i <= 122; i++) {
                if (character == i) {
                    alphabetCountArray[i - 97]++;
                    break;
                }
            }
        }
        for (int n : alphabetCountArray) {
            System.out.print(n + " ");
        }
    }
}
