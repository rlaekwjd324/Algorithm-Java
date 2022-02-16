import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int max = 0;
        int peopleCount = 0;
        for (int i = 0; i < 10; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int outputPeople = Integer.parseInt(stringTokenizer.nextToken());
            int inputPeople = Integer.parseInt(stringTokenizer.nextToken());
            peopleCount = peopleCount + inputPeople - outputPeople;
            max = Math.max(max, peopleCount);
        }
        System.out.println(max);
    }
}
