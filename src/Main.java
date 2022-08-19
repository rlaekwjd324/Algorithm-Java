import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[4];
        for (int i = 0; i < 4; i++) {
            num[i] = Integer.parseInt(bufferedReader.readLine());
        }
        if (num[0] == num[1] && num[1] == num[2] && num[2] == num[3]) {
            System.out.println("Constant Depth");
            return;
        }
        if (num[0] >= num[1] && num[1] >= num[2] && num[2] >= num[3]) {
            System.out.println("Fish Rising");
            return;
        }
        if (num[0] <= num[1] && num[1] <= num[2] && num[2] <= num[3]) {
            System.out.println("Fish Diving");
            return;
        }
        System.out.println("No Fish.");
    }
}
