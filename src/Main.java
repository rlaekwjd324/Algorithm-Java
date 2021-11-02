import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            arrayList.add(i);
        }
        int nowIdx = 0;
        while (!arrayList.isEmpty()) {
            nowIdx += K;
            nowIdx = (nowIdx % arrayList.size()) - 1;
            if (nowIdx == -1) {
                nowIdx = arrayList.size() - 1;
            }
            stringBuilder.append(arrayList.get(nowIdx)).append(", ");
            arrayList.remove(nowIdx);
        }
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        stringBuilder.append(">");
        System.out.print(stringBuilder);
    }
}
