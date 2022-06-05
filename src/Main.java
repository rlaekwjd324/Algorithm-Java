import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        int n1 = Integer.parseInt(stringTokenizer.nextToken());
        int n2 = Integer.parseInt(stringTokenizer.nextToken());
        int n3 = Integer.parseInt(stringTokenizer.nextToken());
        int n4 = Integer.parseInt(stringTokenizer.nextToken());
        while (n1 != 0 || n2 != 0 || n3 != 0 || n4 != 0) {
            stringBuilder.append(n3 - n2).append(" ").append(n4 - n1).append("\n");
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            n1 = Integer.parseInt(stringTokenizer.nextToken());
            n2 = Integer.parseInt(stringTokenizer.nextToken());
            n3 = Integer.parseInt(stringTokenizer.nextToken());
            n4 = Integer.parseInt(stringTokenizer.nextToken());
        }
        System.out.print(stringBuilder);
    }
}
