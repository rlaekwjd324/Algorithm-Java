import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String front = bufferedReader.readLine();
        String back = bufferedReader.readLine();
        String str = "";
        for (int i = 0; i < front.length(); i++) {
            str += front.charAt(i);
            str += back.charAt(i);
        }
        while (str.length() > 2) {
            String temp = "";
            for (int i = 0; i < str.length() - 1; i++) {
                temp = temp + ((str.charAt(i) - '0') + (str.charAt(i + 1) - '0')) % 10;
            }
            str = temp;
        }
        System.out.print(str);
    }
}
