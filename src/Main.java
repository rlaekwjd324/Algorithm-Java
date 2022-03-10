import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        String inputNumber = bufferedReader.readLine();
        while (!inputNumber.equals("0")) {
            int sum = 1;
            for (int i = 0; i < inputNumber.length(); i++) {
                char chr = inputNumber.charAt(i);
                if (chr == '1') {
                    sum += 2;
                } else if (chr == '0') {
                    sum += 4;
                } else {
                    sum += 3;
                }
                sum++;
            }
            stringBuilder.append(sum).append("\n");
            inputNumber = bufferedReader.readLine();
        }
        System.out.print(stringBuilder);
    }
}
