import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        int sum = 0;
        for (int i = 0; i < str.split(",").length; i++) {
            sum += Integer.parseInt(str.split(",")[i]);
        }
        System.out.print(sum);
    }
}
