import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("long ".repeat(Math.max(0, n / 4)));
        stringBuilder.append("int");
        System.out.print(stringBuilder);
    }
}
