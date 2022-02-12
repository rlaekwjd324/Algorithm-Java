import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int firstNumber = Integer.parseInt(stringTokenizer.nextToken());
        int secondNumber = Integer.parseInt(stringTokenizer.nextToken());
        StringBuilder stringBuilder = new StringBuilder();
        while (firstNumber != 0 || secondNumber != 0) {
            if (firstNumber > secondNumber) {
                stringBuilder.append("Yes");
            } else {
                stringBuilder.append("No");
            }
            stringBuilder.append("\n");
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            firstNumber = Integer.parseInt(stringTokenizer.nextToken());
            secondNumber = Integer.parseInt(stringTokenizer.nextToken());
        }
        System.out.print(stringBuilder);
    }
}
