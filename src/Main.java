import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        String a = stringTokenizer.nextToken();
        String b = stringTokenizer.nextToken();
        String c = stringTokenizer.nextToken();
        String d = stringTokenizer.nextToken();
        String firstString, secondString;
        if ((a + b).length() < (c + d).length()) {
            firstString = a + b;
            secondString = c + d;
        } else {
            firstString = c + d;
            secondString = a + b;
        }
        String newString = "";
        int upperNumber = 0;
        for (int i = 0; i < firstString.length(); i++) {
            int sum = (firstString.charAt(firstString.length() - i - 1) - '0') + (secondString.charAt(secondString.length() - i - 1) - '0') + upperNumber;
            upperNumber = sum / 10;
            newString = (sum % 10) + newString;
        }
        if (firstString.length() < secondString.length()) {
            for (int i = 0; i < secondString.length() - firstString.length(); i++) {
                int sum = (secondString.charAt(secondString.length() - firstString.length() - i - 1) - '0') + upperNumber;
                upperNumber = sum / 10;
                newString = (sum % 10) + newString;
            }
        }
        if (upperNumber != 0) {
            newString = upperNumber + newString;
        }
        System.out.println(newString);
    }
}