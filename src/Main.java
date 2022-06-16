import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String H = bufferedReader.readLine();
        String N = bufferedReader.readLine();
        int index = H.indexOf(N);
        int count = 0;
        while (index != -1) {
            count++;
            index = H.indexOf(N, index + 1);
        }
        System.out.print(count);
    }
}
