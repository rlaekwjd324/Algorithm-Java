import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] num = new int[3];
        num[0] = Integer.parseInt(stringTokenizer.nextToken());
        num[1] = Integer.parseInt(stringTokenizer.nextToken());
        num[2] = Integer.parseInt(stringTokenizer.nextToken());
        String abc = bufferedReader.readLine();
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.sort(num);
        for (int i = 0; i < abc.length(); i++) {
            switch (abc.charAt(i)) {
                case 'A':
                    stringBuilder.append(num[0]);
                    break;
                case 'B':
                    stringBuilder.append(num[1]);
                    break;
                case 'C':
                    stringBuilder.append(num[2]);
                    break;
            }
            stringBuilder.append(" ");
        }
        System.out.print(stringBuilder);
    }
}
