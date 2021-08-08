import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        String inputNumber = bufferedReader.readLine();
        while (!inputNumber.equals("0")) {
            for (int i = 0; i <= inputNumber.length() / 2; i++) {
                if (inputNumber.charAt(i) != inputNumber.charAt(inputNumber.length() - i - 1)) {
                    stringBuilder.append("no").append("\n");
                    break;
                }
                if (i == inputNumber.length() / 2) {
                    stringBuilder.append("yes").append("\n");
                }
            }
            inputNumber = bufferedReader.readLine();
        }
        System.out.print(stringBuilder);
    }
}
