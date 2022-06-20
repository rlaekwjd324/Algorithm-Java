import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String mbti = bufferedReader.readLine();
        StringBuilder stringBuilder = new StringBuilder();
        char[] array = {'E', 'I', 'S', 'N', 'F', 'T', 'P', 'J'};
        for (int i = 0; i < mbti.length(); i++) {
            stringBuilder.append(mbti.charAt(i) == array[2 * i] ? array[2 * i + 1] : array[2 * i]);
        }
        System.out.print(stringBuilder);
    }
}
