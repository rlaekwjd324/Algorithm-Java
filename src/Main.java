import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        String name = stringTokenizer.nextToken();
        int age = Integer.parseInt(stringTokenizer.nextToken());
        int weight = Integer.parseInt(stringTokenizer.nextToken());
        while (!name.equals("#") || age != 0 || weight != 0) {
            if (age > 17 || weight >= 80) {
                stringBuilder.append(name).append(" Senior").append("\n");
            } else {
                stringBuilder.append(name).append(" Junior").append("\n");
            }
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            name = stringTokenizer.nextToken();
            age = Integer.parseInt(stringTokenizer.nextToken());
            weight = Integer.parseInt(stringTokenizer.nextToken());
        }
        System.out.print(stringBuilder);
    }
}
