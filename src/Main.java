import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String N = bufferedReader.readLine();
        int F = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < 100; i++) {
            String backNum = String.valueOf(i).length() == 1 ? "0" + i : String.valueOf(i);
            long num = Long.parseLong(N.substring(0, N.length() - 2) + backNum);
            if (num % F == 0) {
                System.out.println(backNum);
                return;
            }
        }
    }
}
