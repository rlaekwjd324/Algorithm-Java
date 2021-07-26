import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int maxNum = Integer.parseInt(bufferedReader.readLine());
        int maxNumCount = 1;
        for (int i = 2; i <= 9; i++) {
            int N = Integer.parseInt(bufferedReader.readLine());
            if(maxNum<N){
                maxNum = N;
                maxNumCount = i;
            }
        }
        System.out.print(maxNum+"\n"+maxNumCount);
    }
}
