import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        double A = Double.parseDouble(stringTokenizer.nextToken());
        double B = Double.parseDouble(stringTokenizer.nextToken());
        System.out.print((int) Math.ceil(A * (B - 0.99)));
    }
}
