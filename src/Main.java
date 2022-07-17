import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        StringBuilder answer = new StringBuilder();
        String[] array = line.split("<");
        if (array[0].length() != 0) {
            answer.append(reverseString(array[0]));
        }
        for (int i = 1; i < array.length; i++) {
            String[] temp = array[i].split(">");
            String tag = temp[0];
            answer.append("<").append(tag).append(">");
            if (temp.length > 1) {
                answer.append(reverseString(temp[1]));
            }
        }
        System.out.print(answer);
    }

    public static String reverseString(String str) {
        StringBuilder stringBuilder;
        StringBuilder answer = new StringBuilder();
        String[] strArray = str.split(" ");
        for (String temp : strArray) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(temp);
            stringBuilder.reverse();
            answer.append(stringBuilder).append(" ");
        }
        answer.deleteCharAt(answer.length() - 1);
        return answer.toString();
    }
}
