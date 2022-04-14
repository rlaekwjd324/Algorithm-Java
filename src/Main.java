import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String num = bufferedReader.readLine();
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < num.length() / 2; i++) {
            leftSum = leftSum + (num.charAt(i) - '0');
            rightSum = rightSum + (num.charAt(num.length() - i - 1) - '0');
        }
        if (leftSum == rightSum) {
            System.out.print("LUCKY");
            return;
        }
        System.out.print("READY");
    }
}
