import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        int L = Integer.parseInt(stringTokenizer.nextToken());
        int P = Integer.parseInt(stringTokenizer.nextToken());
        int LP = L * P;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < 5; i++) {
            stringBuilder.append(Integer.parseInt(stringTokenizer.nextToken()) - LP).append(" ");
        }
        System.out.print(stringBuilder);
    }
}
