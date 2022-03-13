import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            String tempString = bufferedReader.readLine();
            if (tempString.equals("P=NP")) {
                System.out.println("skipped");
                continue;
            }
            System.out.println(Integer.parseInt(tempString.split("\\+")[0]) + Integer.parseInt(tempString.split("\\+")[1]));
        }
    }
}
