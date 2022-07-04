import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String str = bufferedReader.readLine();
            int sum = 0;
            for (int j = 0; j < 16; j++) {
                int c = str.charAt(j) - '0';
                if (j % 2 == 0) {
                    c *= 2;
                    if (c >= 10) {
                        c = c / 10 + c % 10;
                    }
                }
                sum += c;
            }
            stringBuilder.append(sum % 10 == 0 ? "T" : "F").append("\n");
        }
        System.out.print(stringBuilder);
    }
}
