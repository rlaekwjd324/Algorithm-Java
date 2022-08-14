import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        if (str.contains("D2") || str.contains("d2")) {
            System.out.print("D2");
            return;
        }
        System.out.print("unrated");
    }
}
