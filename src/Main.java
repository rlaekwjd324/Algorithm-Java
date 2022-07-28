import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int S = Integer.parseInt(bufferedReader.readLine());
        String[] letters = {"A", "E", "I", "O", "U", "a", "e", "i", "o", "u"};
        for (int i = 0; i < S; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int letterCount = 0;
            int etcCount = 0;
            while (stringTokenizer.hasMoreTokens()) {
                char[] array = stringTokenizer.nextToken().toCharArray();
                for (char c : array) {
                    if (Arrays.asList(letters).contains(String.valueOf(c))) {
                        letterCount++;
                    } else {
                        etcCount++;
                    }
                }
            }
            stringBuilder.append(etcCount).append(" ").append(letterCount).append("\n");
        }
        System.out.print(stringBuilder);
    }
}
