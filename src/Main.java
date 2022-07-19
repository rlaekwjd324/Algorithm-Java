import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        ArrayList<String> array = new ArrayList<>();
        for (int i = 123; i < 1000; i++) {
            String str = String.valueOf(i);
            if (str.charAt(1) == '0'
                    || str.charAt(2) == '0'
                    || str.charAt(0) == str.charAt(1)
                    || str.charAt(1) == str.charAt(2)
                    || str.charAt(2) == str.charAt(0)) {
                continue;
            }
            array.add(str);
        }
        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String str = stringTokenizer.nextToken();
            int strike = Integer.parseInt(stringTokenizer.nextToken());
            int ball = Integer.parseInt(stringTokenizer.nextToken());
            for (int j = array.size() - 1; j >= 0; j--) {
                String num = array.get(j);
                int tempBallCount = 0;
                int tempStrikeCount = 0;
                if (str.charAt(0) == num.charAt(1)) {
                    tempBallCount++;
                } else if (str.charAt(0) == num.charAt(2)) {
                    tempBallCount++;
                }
                if (str.charAt(1) == num.charAt(2)) {
                    tempBallCount++;
                } else if (str.charAt(1) == num.charAt(0)) {
                    tempBallCount++;
                }
                if (str.charAt(2) == num.charAt(0)) {
                    tempBallCount++;
                } else if (str.charAt(2) == num.charAt(1)) {
                    tempBallCount++;
                }
                if (str.charAt(0) == num.charAt(0)) {
                    tempStrikeCount++;
                }
                if (str.charAt(1) == num.charAt(1)) {
                    tempStrikeCount++;
                }
                if (str.charAt(2) == num.charAt(2)) {
                    tempStrikeCount++;
                }
                if (tempBallCount != ball || tempStrikeCount != strike) {
                    array.remove(j);
                }
            }
        }
        System.out.print(array.size());
    }
}
