import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String str = bufferedReader.readLine().trim();
            boolean[] isExist = new boolean[26];
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c >= 97 && c <= 122) {
                    isExist[c - 97] = true;
                } else if (c >= 65 && c <= 90) {
                    isExist[c - 65] = true;
                }
            }
            String s = "";
            for (int j = 0; j < isExist.length; j++) {
                if (!isExist[j]) {
                    s += (char) (j + 97);
                }
            }
            if (s.length() == 0) {
                stringBuilder.append("pangram").append("\n");
            } else {
                stringBuilder.append("missing ").append(s).append("\n");
            }
        }
        System.out.print(stringBuilder);
    }
}
