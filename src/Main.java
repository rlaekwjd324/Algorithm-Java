import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int s = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());
        int h = Integer.parseInt(stringTokenizer.nextToken());
        if (s + k + h >= 100) {
            System.out.print("OK");
            return;
        }
        if (s > k) {
            if (k < h) {
                System.out.print("Korea");
                return;
            }
            System.out.print("Hanyang");
            return;
        }
        if (s > h) {
            System.out.print("Hanyang");
            return;
        }
        System.out.print("Soongsil");
    }

}
