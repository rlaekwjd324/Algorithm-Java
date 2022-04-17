import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        int joiCount = 0;
        int ioiCount = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String word = str.substring(i, i + 3);
            if (word.equals("JOI")) {
                joiCount++;
            }
            if (word.equals("IOI")) {
                ioiCount++;
            }
        }
        System.out.println(joiCount);
        System.out.println(ioiCount);
    }
}
