import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            String str = bufferedReader.readLine();
            if (str.equals("anj")) {
                System.out.print("뭐야;");
                return;
            }
        }
        System.out.print("뭐야?");
    }
}
