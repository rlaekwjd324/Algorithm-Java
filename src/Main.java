import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        HashMap<Integer, Integer> hashMap = new HashMap();
        int max = 1;
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(bufferedReader.readLine());
            sum += num;
            if (hashMap.containsKey(num)) {
                hashMap.replace(num, hashMap.get(num) + 1);
                max = Math.max(max, hashMap.get(num));
            } else {
                hashMap.put(num, 1);
            }
        }
        int answer = 0;
        for (int key : hashMap.keySet()) {
            int value = hashMap.get(key);
            if (value == max) {
                answer = key;
            }
        }
        System.out.println(sum / 10);
        System.out.println(answer);
    }
}
