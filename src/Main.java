import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        char[] strings = bufferedReader.readLine().toCharArray();
        for (int i = 0; i < strings.length; i++) {
            char string = strings[i];
            if (string >= 65 && string <= 90) {
                string += 13;
                if (string > 90) {
                    string -= 26;
                }
            }
            if (string >= 97 && string <= 122) {
                string += 13;
                if (string > 122) {
                    string -= 26;
                }
            }
            stringBuilder.append(string);
        }
        System.out.print(stringBuilder);
    }
}
