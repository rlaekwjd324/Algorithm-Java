import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int[] array, cupArray;
    static ArrayList<Integer> arrayList = new ArrayList<>();
    static ArrayList<String> arrayString = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        array = new int[3];
        array[0] = Integer.parseInt(stringTokenizer.nextToken());
        array[1] = Integer.parseInt(stringTokenizer.nextToken());
        array[2] = Integer.parseInt(stringTokenizer.nextToken());
        cupArray = new int[3];
        cupArray[2] = array[2];
        dfs("0 0 " + cupArray[2]);
        StringBuilder stringBuilder = new StringBuilder();
        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            stringBuilder.append(arrayList.get(i)).append(" ");
        }
        System.out.print(stringBuilder);
    }

    private static void dfs(String value) {
        if (arrayString.contains(value)) {
            return;
        }
        if (!arrayList.contains(cupArray[2]) && cupArray[0] == 0) {
            arrayList.add(cupArray[2]);
        }
        arrayString.add(value);
        for (int idx = 0; idx < 3; idx++) {
            if (cupArray[idx] == 0) {
                continue;
            }
            for (int i = 0; i < 3; i++) {
                if (idx != i) {
                    int tempIdx = cupArray[idx];
                    int tempI = cupArray[i];
                    if (array[i] - cupArray[i] < cupArray[idx]) {
                        cupArray[idx] = cupArray[idx] - (array[i] - cupArray[i]);
                        cupArray[i] = array[i];
                    } else {
                        cupArray[i] = cupArray[i] + cupArray[idx];
                        cupArray[idx] = 0;
                    }
                    if (cupArray[idx] <= array[idx] && cupArray[i] <= array[i]) {
                        dfs(cupArray[0] + " " + cupArray[1] + " " + cupArray[2]);
                    }
                    cupArray[idx] = tempIdx;
                    cupArray[i] = tempI;
                }
            }

        }
    }
}
