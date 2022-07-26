import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String name = stringTokenizer.nextToken();
            int score = Integer.parseInt(stringTokenizer.nextToken());
            stringBuilder.append(name).append(" ");
            if (score >= 97) {
                stringBuilder.append("A+");
            } else if (score >= 90) {
                stringBuilder.append("A");
            } else if (score >= 87) {
                stringBuilder.append("B+");
            } else if (score >= 80) {
                stringBuilder.append("B");
            } else if (score >= 77) {
                stringBuilder.append("C+");
            } else if (score >= 70) {
                stringBuilder.append("C");
            } else if (score >= 67) {
                stringBuilder.append("D+");
            } else if (score >= 60) {
                stringBuilder.append("D");
            } else {
                stringBuilder.append("F");
            }
            stringBuilder.append("\n");
        }
        System.out.print(stringBuilder);
    }
}
