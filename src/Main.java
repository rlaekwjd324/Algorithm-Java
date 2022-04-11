import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int testcaseCount = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < testcaseCount; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            char[] firstArray = stringTokenizer.nextToken().toCharArray();
            char[] secondArray = stringTokenizer.nextToken().toCharArray();
            stringBuilder.append("Distances:");
            for (int j = 0; j < firstArray.length; j++) {
                if (firstArray[j] > secondArray[j]) {
                    stringBuilder.append(" ").append((int) secondArray[j] + 26 - (int) firstArray[j]);
                } else {
                    stringBuilder.append(" ").append((int) secondArray[j] - (int) firstArray[j]);
                }
            }
            stringBuilder.append("\n");
        }
        System.out.print(stringBuilder);
    }
}
