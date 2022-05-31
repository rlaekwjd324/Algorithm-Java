import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int n = Integer.parseInt(bufferedReader.readLine());
        int count = 1;
        while (n != 0) {
            int n1 = n * 3;
            int n2;
            String str = "";
            if (n1 % 2 == 0) {
                n2 = n1 / 2;
                str = "even";
            } else {
                n2 = (n1 + 1) / 2;
                str = "odd";
            }
            int n3 = 3 * n2;
            int n4 = n3 / 9;
            stringBuilder.append(count).append(". ").append(str).append(" ").append(n4).append("\n");
            count++;
            n = Integer.parseInt(bufferedReader.readLine());
        }
        System.out.print(stringBuilder);
    }
}
