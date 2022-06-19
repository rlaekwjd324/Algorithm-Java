import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        for (int i = 0; i < 6; i++) {
            if (bufferedReader.readLine().equals("W")) {
                count++;
            }
        }
        if (count == 0) {
            System.out.print("-1");
            return;
        }
        if (count <= 2) {
            System.out.print("3");
            return;
        }
        if (count <= 4) {
            System.out.print("2");
            return;
        }
        System.out.print("1");
    }
}
