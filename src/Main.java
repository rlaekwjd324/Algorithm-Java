import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int A = Integer.parseInt(stringTokenizer.nextToken());
        int B = Integer.parseInt(stringTokenizer.nextToken());
        int C = Integer.parseInt(stringTokenizer.nextToken());
        int D = Integer.parseInt(stringTokenizer.nextToken());
        StringBuilder stringBuilder = new StringBuilder();
        while (A != 0 || B != 0 || C != 0 || D != 0) {
            int count = 0;
            while (A != B || B != C || C != D) {
                int tempA = A;
                int tempB = B;
                int tempC = C;
                int tempD = D;
                count++;
                A = Math.abs(tempA - tempB);
                B = Math.abs(tempB - tempC);
                C = Math.abs(tempC - tempD);
                D = Math.abs(tempA - tempD);
            }
            stringBuilder.append(count).append("\n");
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            A = Integer.parseInt(stringTokenizer.nextToken());
            B = Integer.parseInt(stringTokenizer.nextToken());
            C = Integer.parseInt(stringTokenizer.nextToken());
            D = Integer.parseInt(stringTokenizer.nextToken());
        }
        System.out.print(stringBuilder);
    }
}
