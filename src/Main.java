import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        String[] array = new String[N];
        for (int i = 0; i < N; i++) {
            array[i] = bufferedReader.readLine();
        }
        int K = Integer.parseInt(bufferedReader.readLine());
        switch (K) {
            case 1:
                for (int i = 0; i < N; i++) {
                    stringBuilder.append(array[i]).append("\n");
                }
                break;
            case 2:
                for (int i = 0; i < N; i++) {
                    StringBuilder sb = new StringBuilder(array[i]);
                    stringBuilder.append(sb.reverse()).append("\n");
                }
                break;
            case 3:
                for (int i = 0; i < N; i++) {
                    stringBuilder.append(array[N - i - 1]).append("\n");
                }
                break;
        }
        System.out.print(stringBuilder);
    }
}
