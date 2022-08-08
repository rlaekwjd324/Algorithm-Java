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
            String str = stringTokenizer.nextToken();
            switch (str) {
                case "kg":
                    stringBuilder.append(String.format("%.4f", num * 2.2046)).append(" lb");
                    break;
                case "lb":
                    stringBuilder.append(String.format("%.4f", num * 0.4536)).append(" kg");
                    break;
                case "l":
                    stringBuilder.append(String.format("%.4f", num * 0.2642)).append(" g");
                    break;
                case "g":
                    stringBuilder.append(String.format("%.4f", num * 3.7854)).append(" l");
                    break;
            }
            stringBuilder.append("\n");
        }
        System.out.print(stringBuilder);
    }
}
