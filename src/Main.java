import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int x = Integer.parseInt(stringTokenizer.nextToken());
        int y = Integer.parseInt(stringTokenizer.nextToken());
        int w = Integer.parseInt(stringTokenizer.nextToken());
        int h = Integer.parseInt(stringTokenizer.nextToken());
        int min = Math.min(Math.abs(x - w), Math.abs(y - h));
        int min2 = Math.min(x, y);
        System.out.println(Math.min(min, min2));
    }
}
