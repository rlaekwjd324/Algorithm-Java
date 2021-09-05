import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        int[] array = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < 6; i++) {
            array[i] = array[i] - Integer.parseInt(stringTokenizer.nextToken());
            stringBuilder.append(array[i]).append(" ");
        }
        System.out.print(stringBuilder);
    }
}
