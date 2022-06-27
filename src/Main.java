import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String jawhanAh = bufferedReader.readLine();
        String doctorAh = bufferedReader.readLine();
        System.out.print(jawhanAh.length() >= doctorAh.length() ? "go" : "no");
    }
}
