import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        int A = Integer.parseInt(stringTokenizer.nextToken());
        int B = Integer.parseInt(stringTokenizer.nextToken());
        while (A != 0 || B != 0) {
            if (A > B) {
                if (A % B == 0) {
                    stringBuilder.append("multiple").append("\n");
                } else {
                    stringBuilder.append("neither").append("\n");
                }
            } else {
                if (B % A == 0) {
                    stringBuilder.append("factor").append("\n");
                } else {
                    stringBuilder.append("neither").append("\n");
                }
            }
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            A = Integer.parseInt(stringTokenizer.nextToken());
            B = Integer.parseInt(stringTokenizer.nextToken());
        }
        System.out.print(stringBuilder);
    }
}
