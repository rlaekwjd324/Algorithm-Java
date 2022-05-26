import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(bufferedReader.readLine());
        if (n1 != 8 && n1 != 9) {
            System.out.print("answer");
            return;
        }
        int n2 = Integer.parseInt(bufferedReader.readLine());
        int n3 = Integer.parseInt(bufferedReader.readLine());
        if (n2 != n3) {
            System.out.print("answer");
            return;
        }
        int n4 = Integer.parseInt(bufferedReader.readLine());
        if (n4 != 8 && n4 != 9) {
            System.out.print("answer");
            return;
        }
        System.out.print("ignore");
    }
}
