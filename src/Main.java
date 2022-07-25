import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int S1 = Integer.parseInt(stringTokenizer.nextToken());
        int S2 = Integer.parseInt(stringTokenizer.nextToken());
        for (int i = 0; i < S1; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            if (!stringTokenizer.nextToken().equals(stringTokenizer.nextToken())) {
                System.out.print("Wrong Answer");
                return;
            }
        }
        for (int i = 0; i < S2; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            if (!stringTokenizer.nextToken().equals(stringTokenizer.nextToken())) {
                System.out.print("Why Wrong!!!");
                return;
            }
        }
        System.out.print("Accepted");
    }
}
