import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] pickedArray;
    static boolean[] check = new boolean[10];
    static char[] array;
    static String max = "";
    static String min = "";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());
        array = new char[N];
        pickedArray = new int[N + 1];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = stringTokenizer.nextToken().charAt(0);
        }
        back(0);
        System.out.println(max);
        System.out.print(min);
    }

    private static void back(int count) {
        if (count == N + 1) {
            boolean isTrue = true;
            for (int i = 0; i < N; i++) {
                switch (array[i]) {
                    case '<':
                        if (pickedArray[i] >= pickedArray[i + 1]) {
                            isTrue = false;
                        }
                        break;
                    case '>':
                        if (pickedArray[i] <= pickedArray[i + 1]) {
                            isTrue = false;
                        }
                        break;
                }
            }
            if (isTrue) {
                String string = "";
                for (int i = 0; i < N + 1; i++) {
                    string += pickedArray[i];
                }
                if (max.equals("")) {
                    max = string;
                    min = string;
                } else {
                    for (int i = 0; i < N + 1; i++) {
                        if (pickedArray[i] > max.charAt(i) - '0') {
                            max = string;
                            break;
                        }
                        if (pickedArray[i] < max.charAt(i) - '0') {
                            break;
                        }
                    }
                    for (int i = 0; i < N + 1; i++) {
                        if (pickedArray[i] > max.charAt(i) - '0') {
                            break;
                        }
                        if (pickedArray[i] < max.charAt(i) - '0') {
                            min = string;
                            break;
                        }
                    }
                }
            }
            return;
        }
        for (int i = 0; i < 10; i++) {
            if (!check[i]) {
                check[i] = true;
                pickedArray[count] = i;
                back(count + 1);
                check[i] = false;
            }
        }
    }
}
