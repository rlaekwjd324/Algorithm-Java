import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sLength = Integer.parseInt(bufferedReader.readLine());
        String s = bufferedReader.readLine();
        int count2 = 0;
        int countE = 0;
        for (int i = 0; i < sLength; i++) {
            if (s.charAt(i) == '2') {
                count2++;
            } else {
                countE++;
            }
        }
        if (count2 == countE) {
            System.out.print("yee");
            return;
        }
        if (count2 > countE) {
            System.out.print("2");
            return;
        }
        System.out.print("e");
    }
}
