import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String first = bufferedReader.readLine();
        String second = bufferedReader.readLine();
        int[] firstArray = new int[26];
        int[] secondArray = new int[26];
        for (int i = 0; i < first.length(); i++) {
            firstArray[first.charAt(i) - 97]++;
        }
        for (int i = 0; i < second.length(); i++) {
            secondArray[second.charAt(i) - 97]++;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            count += Math.abs(firstArray[i] - secondArray[i]);
        }
        System.out.println(count);
    }
}
