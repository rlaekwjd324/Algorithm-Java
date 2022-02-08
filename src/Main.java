import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int roundNumber = Integer.parseInt(bufferedReader.readLine());
        int changYeongSum = 100;
        int sangDuckSum = 100;
        for (int i = 0; i < roundNumber; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int firstNumber = Integer.parseInt(stringTokenizer.nextToken());
            int secondNumber = Integer.parseInt(stringTokenizer.nextToken());
            if (firstNumber > secondNumber) {
                sangDuckSum -= firstNumber;
            } else if (firstNumber < secondNumber) {
                changYeongSum -= secondNumber;
            }
        }
        System.out.println(changYeongSum);
        System.out.println(sangDuckSum);
    }
}