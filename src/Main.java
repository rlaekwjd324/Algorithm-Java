import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < T; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            double num = Double.parseDouble(stringTokenizer.nextToken());

            while (stringTokenizer.hasMoreTokens()) {
                String a = stringTokenizer.nextToken();
                switch (a) {
                    case "@":
                        num = num * 3;
                        break;
                    case "%":
                        num = num + 5;
                        break;
                    case "#":
                        num = num - 7;
                        break;
                }
            }

            stringBuilder.append(String.format("%.2f", num)).append("\n");
        }
        System.out.print(stringBuilder);
    }
}
