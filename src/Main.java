import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        StringBuilder str = new StringBuilder();
        while (T >= 9) {
            int d = T % 9;
            T = T / 9;
            str.insert(0, d);
        }
        System.out.print(T + str.toString());
    }
}
