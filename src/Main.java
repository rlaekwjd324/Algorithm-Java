import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int C = Integer.parseInt(stringTokenizer.nextToken());
        int S = Integer.parseInt(stringTokenizer.nextToken());
        int[] array = new int[N + 1];
        int position = 1;
        array[1] = 1;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < C; i++) {
            int X = Integer.parseInt(stringTokenizer.nextToken());
            position = position + X;
            if (position < 1) {
                position += N;
            }
            if (position > N) {
                position -= N;
            }
            array[position]++;
        }
        System.out.print(array[S]);
    }
}
