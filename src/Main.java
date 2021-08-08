import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int time = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        time = Integer.parseInt(bufferedReader.readLine());
        int A = countABC(300);
        int B = countABC(60);
        int C = countABC(10);
        if (time == 0) {
            System.out.print(A + " " + B + " " + C);
            return;
        }
        System.out.print(-1);
    }

    private static int countABC(int ABC) {
        int count = 0;
        while (true) {
            if (time >= ABC) {
                count++;
                time -= ABC;
            } else {
                break;
            }
        }
        return count;
    }
}
