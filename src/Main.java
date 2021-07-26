import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int inputYear = Integer.parseInt(bufferedReader.readLine());
        if ((inputYear % 4 == 0 && inputYear % 100 != 0) || inputYear % 400 == 0) {
            System.out.print(1);
            return;
        }
        System.out.print(0);
    }
}
