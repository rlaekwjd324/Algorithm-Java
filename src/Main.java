import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (String.valueOf(i).length() == 1) {
                count++;
                continue;
            }
            if (isEqualDiv(String.valueOf(i))) {
                count++;
                continue;
            }
        }
        System.out.print(count);
    }

    private static boolean isEqualDiv(String n) {
        int[] divs = new int[n.length() - 1];
        for (int j = 0; j < n.length() - 1; j++) {
            divs[j] = (n.charAt(j) - '0') - (n.charAt(j + 1) - '0');
        }
        for (int i = 0; i < n.length() - 2; i++) {
            if (divs[i] != divs[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
