import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("-", 0);
        hashMap.put("\\", 1);
        hashMap.put("(", 2);
        hashMap.put("@", 3);
        hashMap.put("?", 4);
        hashMap.put(">", 5);
        hashMap.put("&", 6);
        hashMap.put("%", 7);
        hashMap.put("/", -1);
        String lineString = bufferedReader.readLine();
        StringBuilder answer = new StringBuilder();
        while (!lineString.equals("#")) {
            int sum = 0;
            for (int i = 0; i < lineString.length(); i++) {
                String str = String.valueOf(lineString.charAt(i));
                double num = Math.pow(8, lineString.length() - i - 1) * hashMap.get(str);
                sum += num;
            }
            answer.append(sum).append("\n");
            lineString = bufferedReader.readLine();
        }
        System.out.println(answer);
    }
}
