import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String str1 = stringTokenizer.nextToken();
            String str2 = stringTokenizer.nextToken();

            int second = Integer.parseInt(str2.split(":")[2]) - Integer.parseInt(str1.split(":")[2]);
            int minute = Integer.parseInt(str2.split(":")[1]) - Integer.parseInt(str1.split(":")[1]);
            int hour = Integer.parseInt(str2.split(":")[0]) - Integer.parseInt(str1.split(":")[0]);
            if (second < 0) {
                second += 60;
                minute--;
            }
            if (minute < 0) {
                minute += 60;
                hour--;
            }
//            int answer = 0;
            if (hour < 0) {
                hour += 24;
//                answer--;
            }
            int count = (second+1 + minute * 60 + hour * 60 * 60);
            int answer = (count / 3);
//            if (
//                    ((str1.split(":")[2].charAt(1) - '0' + str1.split(":")[2].charAt(0) - '0' + str1.split(":")[1].charAt(1) - '0' + str1.split(":")[1].charAt(0) - '0' + str1.split(":")[0].charAt(1) - '0' + str1.split(":")[0].charAt(0) - '0') % 3 == 0 ||
//                            (str2.split(":")[2].charAt(1) - '0' + str2.split(":")[2].charAt(0) - '0' + str2.split(":")[1].charAt(1) - '0' + str2.split(":")[1].charAt(0) - '0' + str2.split(":")[0].charAt(1) - '0' + str2.split(":")[0].charAt(0) - '0') % 3 == 0)) {
//                answer++;
//            }
            stringBuilder.append(answer).append("\n");
        }
        System.out.print(stringBuilder);
    }
}
//00:00:00 23:59:59
//23:59:59 23:59:58
//23:59:59 00:00:00