import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        int c = Integer.parseInt(stringTokenizer.nextToken());
        int[] array = {a, b, c, a * b, b * c, c * a, a * b * c};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max % 2 == 0 && array[i] % 2 == 1) {
                max = array[i];
            } else if (max % 2 == 0 || array[i] % 2 == 1) {
                max = Math.max(max, array[i]);
            }
        }
        System.out.print(max);
    }
}
