import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            String string = bufferedReader.readLine();
            if (string.equals("-1")) {
                break;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(string);
            ArrayList<Integer> arrayList = new ArrayList<>();
            while (stringTokenizer.hasMoreTokens()) {
                int a = Integer.parseInt(stringTokenizer.nextToken());
                if (a == 0) {
                    break;
                }
                arrayList.add(a);
            }
            Collections.sort(arrayList);
            int count = 0;
            for (int i = 0; i < arrayList.size(); i++) {
                for (int j = i + 1; j < arrayList.size(); j++) {
                    if (arrayList.get(j) / arrayList.get(i) == 2 && arrayList.get(j) % arrayList.get(i) == 0) {
                        count++;
                    }
                }
            }
            stringBuilder.append(count).append("\n");
        }
        System.out.print(stringBuilder);
    }
}
