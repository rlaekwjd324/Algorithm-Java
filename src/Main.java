import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static String a, b;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        a = stringTokenizer.nextToken();
        b = stringTokenizer.nextToken();
        int min = 1000000000;
        for (int i = 0; i <= b.length() - a.length(); i++) {
            int count = 0;
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) != b.charAt(i + j)) {
                    count++;
                }
            }
            min = Math.min(min, count);
        }
        System.out.print(min);
    }
}
