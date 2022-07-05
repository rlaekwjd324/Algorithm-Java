import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = bufferedReader.readLine();
        }
        for (int i = 0; i < n; i++) {
            String str = bufferedReader.readLine();
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < m; j++) {
                String c = Character.toString(array[i].charAt(j));
                temp.append(c).append(c);
            }
            if (!temp.toString().equals(str)) {
                System.out.print("Not Eyfa");
                return;
            }
        }
        System.out.print("Eyfa");
    }
}
