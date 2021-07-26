import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] word = bufferedReader.readLine().split("-");
        for (String wordFirstAlphabet : word) {
            System.out.print(wordFirstAlphabet.charAt(0));
        }
    }
}
