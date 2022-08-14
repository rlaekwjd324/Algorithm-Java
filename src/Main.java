import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
            sum += array[i];
        }
        Arrays.sort(array);
        System.out.println(sum / 5);
        System.out.println(array[2]);
    }
}
