import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String str = bufferedReader.readLine();
        int sum = 0;
        int bonus = 0;
        for (int i = 1; i <= n; i++) {
            if (str.charAt(i - 1) == 'O') {
                sum += i;
                sum += bonus;
                bonus++;
            } else {
                bonus = 0;
            }
        }
        System.out.print(sum);
    }
}
