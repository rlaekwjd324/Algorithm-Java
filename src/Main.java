import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String number = bufferedReader.readLine();
        StringBuilder answerNumber = new StringBuilder();
        String[] array = {"000", "001", "010", "011", "100", "101", "110", "111"};
        for (int i = 0; i < number.length(); i++) {
            int num = number.charAt(i) - '0';
            answerNumber.append(array[num]);
        }
        if(answerNumber.charAt(0)=='0'){
            answerNumber.deleteCharAt(0);
        }
        if(answerNumber.charAt(0)=='0'){
            answerNumber.deleteCharAt(0);
        }
        System.out.print(answerNumber);
    }
}
