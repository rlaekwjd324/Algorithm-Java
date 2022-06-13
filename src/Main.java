import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(bufferedReader.readLine());
        int n2 = Integer.parseInt(bufferedReader.readLine());
        if (n2 - n1 < 1) {
            System.out.print("Congratulations, you are within the speed limit!");
            return;
        } else if (n2 - n1 < 21) {
            System.out.print("You are speeding and your fine is $100.");
            return;
        } else if (n2 - n1 < 31) {
            System.out.print("You are speeding and your fine is $270.");
            return;
        } else {
            System.out.print("You are speeding and your fine is $500.");
        }
    }
}
