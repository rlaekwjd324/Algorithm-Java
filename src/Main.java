import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        String inputString = bufferedReader.readLine();
        while (!inputString.equals("END")) {
            String tempString = "";
            for (int i = 0; i < inputString.length(); i++) {
                tempString = inputString.charAt(i) + tempString;
            }
            stringBuilder.append(tempString).append("\n");
            inputString = bufferedReader.readLine();
        }
        System.out.print(stringBuilder);
    }
}