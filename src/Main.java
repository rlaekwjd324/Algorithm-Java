import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int max = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int first = Integer.parseInt(stringTokenizer.nextToken());
            int second = Integer.parseInt(stringTokenizer.nextToken());
            int third = Integer.parseInt(stringTokenizer.nextToken());
            int score = 0;
            if (first == second && second == third) {
                score = 10000 + first * 1000;
            } else if (first == second || second == third || third == first) {
                if (first == second) {
                    score = 1000 + first * 100;
                } else {
                    score = 1000 + third * 100;
                }
            } else {
                int tempMax = Math.max(first, second);
                tempMax = Math.max(tempMax, third);
                score = 100 * tempMax;
            }
            max = Math.max(max, score);
        }
        System.out.print(max);
    }
}
