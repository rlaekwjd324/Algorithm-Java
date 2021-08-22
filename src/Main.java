import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    static int[] array;
    static StringBuilder stringBuilder;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        array = new int[9];
        for (int i = 0; i < 9; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }
        stringBuilder = new StringBuilder();
        back(0, 0, 0, new boolean[9]);
        System.out.print(stringBuilder);
    }

    private static void back(int idx, int count, int sum, boolean[] check) {
        if (sum > 100) {
            return;
        }
        if (count == 7) {
            if (sum == 100) {
                stringBuilder = new StringBuilder();
                ArrayList<Integer> sevenPeople = new ArrayList<>();
                for (int i = 0; i < 9; i++) {
                    if (check[i]) {
                        sevenPeople.add(array[i]);
                    }
                }
                Collections.sort(sevenPeople);
                for (int i = 0; i < 7; i++) {
                    stringBuilder.append(sevenPeople.get(i)).append("\n");
                }
            }
            return;
        }
        if (idx >= 9) {
            return;
        }
        check[idx] = true;
        back(idx + 1, count + 1, sum + array[idx], check);
        check[idx] = false;
        back(idx + 1, count, sum, check);
    }
}
