import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(bufferedReader.readLine());
        int N = Integer.parseInt(bufferedReader.readLine());
        int endTime = 0;
        for (int i = 0; i < N; i++) {
            K = K % 8;
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int T = Integer.parseInt(stringTokenizer.nextToken());
            String Z = stringTokenizer.nextToken();
            endTime += T;
            if (endTime >= 210) {
                if(K==0){
                    System.out.print(8);
                    return;
                }
                System.out.print(K);
                return;
            }
            if (Z.equals("T")) {
                K++;
            }
        }
        System.out.print(K+1);
    }
}
