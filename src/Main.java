import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            str.append(i);
        }
        System.out.print(str.indexOf(String.valueOf(N)) + 1);
    }
}
