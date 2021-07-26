import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        String A = stringTokenizer.nextToken();
        String B = stringTokenizer.nextToken();
        if (A.length() > B.length()) {
            String temp = A;
            A = B;
            B = temp;
        }
        int[] sumArray;
        int upNumber = 0;
        sumArray = new int[B.length()];
        for (int i = 1; i <= B.length(); i++) {
            char bValue = B.charAt(B.length() - i);
            if (i <= A.length()) {
                int sum = A.charAt(A.length() - i) - '0' + bValue - '0';
                sum = sum + upNumber;
                upNumber = sum / 10;
                sum = sum % 10;
                sumArray[B.length() - i] = sum;
            } else {
                int sum = upNumber + (bValue - '0');
                upNumber = sum / 10;
                sum = sum % 10;
                sumArray[B.length() - i] = sum;
            }
        }
        if (upNumber > 0) {
            System.out.print(upNumber);
        }
        for (int j : sumArray) {
            System.out.print(j);
        }
    }
}
