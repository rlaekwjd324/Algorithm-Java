import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        if (N % 2 == 0) {
            System.out.print(((N + 2) / 2) * ((N + 2) / 2));
            return;
        }
        System.out.print(((N + 2) / 2) * ((N + 2) / 2 + 1));
    }
}
// 1 -> 2 = 1*2
// 2 -> 4 = 2*2
// 3 -> 6 = 2*3
// 4 -> 9 = 3*3
// 5 -> 12 = 3*4
// 6 -> 16 = 4*4