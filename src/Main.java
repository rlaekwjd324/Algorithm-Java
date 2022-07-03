import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String[] array = bufferedReader.readLine().split(" ");
            String str = array[0] + " " + array[1];
            for (int j = 2; j < array.length; j++) {
                stringBuilder.append(array[j]).append(" ");
            }
            stringBuilder.append(str).append("\n");
        }
        System.out.print(stringBuilder);
    }
}
