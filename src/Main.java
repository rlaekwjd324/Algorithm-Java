import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(bufferedReader.readLine());
            if (Math.pow(num, 2) % (Math.pow(10, String.valueOf(num).length())) == num) {
                stringBuilder.append("YES").append("\n");
            } else {
                stringBuilder.append("NO").append("\n");
            }
        }
        System.out.print(stringBuilder);
    }
}
