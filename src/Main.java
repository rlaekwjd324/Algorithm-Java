import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        String[] array = new String[50];
        for (int i = 0; i < 50; i++) {
            array[i] = stringTokenizer.nextToken();
        }
        String str = bufferedReader.readLine();
        int index = Arrays.asList(array).indexOf(str);
        if (index < 5) {
            System.out.print("A+");
            return;
        }
        if (index < 15) {
            System.out.print("A0");
            return;
        }
        if (index < 30) {
            System.out.print("B+");
            return;
        }
        if (index < 35) {
            System.out.print("B0");
            return;
        }
        if (index < 45) {
            System.out.print("C+");
            return;
        }
        if (index < 48) {
            System.out.print("C0");
            return;
        }
        System.out.print("F");
    }
}
