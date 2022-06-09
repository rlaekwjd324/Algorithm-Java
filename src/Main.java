import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        StringBuilder stringBuilder = new StringBuilder();
        while (n != 0) {
            int preNumber = 0;
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(stringTokenizer.nextToken());
                if (preNumber != num) {
                    preNumber = num;
                    stringBuilder.append(preNumber).append(" ");
                }
            }
            stringBuilder.append("$").append("\n");
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            n = Integer.parseInt(stringTokenizer.nextToken());
        }
        System.out.print(stringBuilder);
    }
}
