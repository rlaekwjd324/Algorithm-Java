import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        int answer = 0;
        if (str.charAt(0) == '0') {
//            16진수
            if (str.charAt(1) == 'x') {
                for (int i = str.length() - 1; i >= 2; i--) {
                    char c = str.charAt(i);
                    int num = 0;
                    if (c >= 97) {
                        num = c - 87;
                    } else {
                        num = c - '0';
                    }
                    answer += (num) * Math.pow(16, str.length() - i - 1);
                }
            }
//            8진수
            else {
                for (int i = str.length() - 1; i >= 1; i--) {
                    answer += (str.charAt(i) - '0') * Math.pow(8, str.length() - i - 1);
                }
            }
        }
//        10진수
        else {
            answer = Integer.parseInt(str);
        }
        System.out.print(answer);
    }
}
