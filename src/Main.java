import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        StringBuilder stringBuilder = new StringBuilder();
        while (!str.equals("***")) {
            StringBuilder tempStringBuilder = new StringBuilder();
            tempStringBuilder.append(str);
            stringBuilder.append(tempStringBuilder.reverse()).append("\n");
            str = bufferedReader.readLine();
        }
        System.out.print(stringBuilder);
    }
}
