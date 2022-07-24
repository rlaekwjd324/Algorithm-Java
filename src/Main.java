import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        String[] array = new String[N];
        for (int i = 0; i < N; i++) {
            array[i] = bufferedReader.readLine();
        }
        StringBuilder answer = new StringBuilder();
        int equalCount = 0;
        for (int i = 0; i < M; i++) {
            HashMap<String, Integer> hashMap = new HashMap<>();
            hashMap.put("A", 0);
            hashMap.put("C", 0);
            hashMap.put("G", 0);
            hashMap.put("T", 0);
            for (int j = 0; j < N; j++) {
                String key = String.valueOf(array[j].charAt(i));
                hashMap.replace(key, hashMap.get(key) + 1);
            }
            int max = 0;
            String c = "";
            Set<String> set = hashMap.keySet();

            for (String o : set) {
                if (max < hashMap.get(o)) {
                    max = hashMap.get(o);
                    c = o;
                } else if (c.length() != 0 && max == hashMap.get(o)) {
                    if (c.charAt(0) > o.charAt(0)) {
                        c = o;
                    }
                }
            }
            equalCount += max;
            answer.append(c);
        }
        System.out.println(answer);
        System.out.println(M * N - equalCount);
    }
}
