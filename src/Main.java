import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        String str = bufferedReader.readLine();
        while (str != null && str.length() != 0) {
            StringTokenizer stringTokenizer = new StringTokenizer(str);
            double h = Double.parseDouble(stringTokenizer.nextToken());
            double p = Double.parseDouble(stringTokenizer.nextToken());
            stringBuilder.append(String.format("%.2f", (h / p))).append("\n");
            str = bufferedReader.readLine();
        }
        System.out.print(stringBuilder);
    }
}
