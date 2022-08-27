import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        String a = stringTokenizer.nextToken();
        String b = stringTokenizer.nextToken();
        a = "0".repeat(Math.max(a.length(), b.length()) - a.length()) + a;
        b = "0".repeat(Math.max(a.length(), b.length()) - b.length()) + b;
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            answer.append((a.charAt(i) - '0') + (b.charAt(i) - '0'));
        }
        System.out.print(answer);
    }
}
