import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        StringBuilder stringBuilder = new StringBuilder();
        char[] array = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        while (!line.equals("#")) {
            int count = 0;
            for (int i = 0; i < line.length(); i++) {
                for (char c : array) {
                    if (c == line.charAt(i)) {
                        count++;
                        break;
                    }
                }
            }
            stringBuilder.append(count).append("\n");
            line = bufferedReader.readLine();
        }
        System.out.print(stringBuilder);
    }
}
