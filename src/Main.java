import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String letter = bufferedReader.readLine();
        String remove = "CAMBRIDGE";
        for (int i = 0; i < remove.length(); i++) {
            letter = letter.replaceAll(String.valueOf(remove.charAt(i)), "");
        }
        System.out.println(letter);
    }
}
