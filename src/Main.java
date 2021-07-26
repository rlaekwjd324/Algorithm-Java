import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        while (stringTokenizer.hasMoreTokens()) {
            int A = Integer.parseInt(stringTokenizer.nextToken());
            int B = Integer.parseInt(stringTokenizer.nextToken());
            stringBuilder.append(A + B).append("\n");
            String brLine = bufferedReader.readLine();
            if (brLine == null || brLine.equals("") || brLine.length() == 0) {
                break;
            }
            stringTokenizer = new StringTokenizer(brLine);
        }
        System.out.print(stringBuilder);
    }
}
