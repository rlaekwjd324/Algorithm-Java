import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        String[] array = str.split("-");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            String[] tempArray = array[i].split("\\+");
            int tempSum = 0;
            for (String s : tempArray) {
                tempSum += Integer.parseInt(s);
            }
            if (i == 0) {
                sum += tempSum;
            } else {
                sum -= tempSum;
            }
        }
        System.out.println(sum);
    }
}
