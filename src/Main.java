import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        if (a == 60 && b == 60 && c == 60) {
            System.out.println("Equilateral");
            return;
        }
        if (a + b + c == 180) {
            if (a != b && b != c && c != a) {
                System.out.println("Scalene");
                return;
            }
            System.out.println("Isosceles");
            return;
        }
        System.out.println("Error");
    }
}
