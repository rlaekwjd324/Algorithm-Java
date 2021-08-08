import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputNumber = bufferedReader.readLine();
        int answerNumber =0;
        for (int i = 0; i < inputNumber.length(); i++) {
            answerNumber += (int)Math.pow(16, inputNumber.length()-i-1)*(changeAlphabetToNumber(inputNumber.charAt(i)));
        }
        System.out.print(answerNumber);
    }
    private static int changeAlphabetToNumber(char num){
        switch (num){
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
            default:
                return num-'0';
        }
    }
}
