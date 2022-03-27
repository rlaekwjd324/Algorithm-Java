import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arrayList.add(i);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (arrayList.size() > 0) {
            stringBuilder.append(arrayList.get(0) + 1).append(" ");
            arrayList.remove(0);
            if (arrayList.size() > 0) {
                int a = arrayList.get(0);
                arrayList.remove(0);
                arrayList.add(a);
            }
        }
        System.out.print(stringBuilder);
    }
}
