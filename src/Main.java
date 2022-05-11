import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int count = 2015;
            boolean[] array = new boolean[26];
            String str = bufferedReader.readLine();
            for (int j = 0; j < str.length(); j++) {
                if (!array[str.charAt(j) - 65]) {
                    array[str.charAt(j) - 65] = true;
                    count -= str.charAt(j);
                }
            }
            stringBuilder.append(count).append("\n");
        }
        System.out.print(stringBuilder);
    }
}
