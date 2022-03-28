import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        double d = Double.parseDouble(stringTokenizer.nextToken());
        double h = Double.parseDouble(stringTokenizer.nextToken());
        double w = Double.parseDouble(stringTokenizer.nextToken());
        double num = Math.sqrt(d * d / (h * h + w * w));
        System.out.println((int) (h * num) + " " + (int) (w * num));
    }
}
