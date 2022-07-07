import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int pay = Integer.parseInt(bufferedReader.readLine());
        int num = Integer.parseInt(bufferedReader.readLine());
        int sum = 0;
        for (int i = 0; i < num; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int tempPay = Integer.parseInt(stringTokenizer.nextToken());
            int tempNum = Integer.parseInt(stringTokenizer.nextToken());
            sum += tempPay * tempNum;
        }
        if (sum == pay) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
