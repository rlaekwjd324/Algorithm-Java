import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine();
        char prev = string.charAt(0);
        int height = 10;
        for (int i = 1; i < string.length(); i++) {
            if (prev == string.charAt(i)) {
                height += 5;
            } else {
                height += 10;
            }
            prev = string.charAt(i);
        }
        System.out.print(height);
    }
}
