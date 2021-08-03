import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String word = bufferedReader.readLine();
            if (word.length() % 2 == 1) {
                word = word + word;
            }
            String[] repeat = {"", ""};
            for (int j = 0; j < word.length(); j++) {
                repeat[j % 2] += String.valueOf(word.charAt(j));
            }
            stringBuilder.append(repeat[0]).append("\n").append(repeat[1]).append("\n");
        }
        System.out.print(stringBuilder);
    }
}
