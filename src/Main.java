import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (Integer.parseInt(stringTokenizer.nextToken()) == t) {
                count++;
            }
        }
        System.out.println(count);
    }
}
