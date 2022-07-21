import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int x = reverseNumber(stringTokenizer.nextToken());
        int y = reverseNumber(stringTokenizer.nextToken());
        System.out.print(reverseNumber(String.valueOf(x + y)));
    }

    public static int reverseNumber(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        return Integer.parseInt(stringBuilder.reverse().toString());
    }
}
