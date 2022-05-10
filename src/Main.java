import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int[] array = new int[10];
            String num = bufferedReader.readLine();
            for (int j = 0; j < num.length(); j++) {
                array[num.charAt(j) - '0']++;
            }
            int count = 0;
            for (int j = 0; j < 10; j++) {
                if (array[j] != 0) {
                    count++;
                }
            }
            stringBuilder.append(count).append("\n");
        }
        System.out.print(stringBuilder);
    }
}
