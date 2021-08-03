import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(bufferedReader.readLine());
        int B = Integer.parseInt(bufferedReader.readLine());
        int C = Integer.parseInt(bufferedReader.readLine());
        int D = Integer.parseInt(bufferedReader.readLine());
        int E = Integer.parseInt(bufferedReader.readLine());
        if(A<0){
            System.out.print((-A)*C+D+B*E);
        }else if(A==0){
            System.out.print(D+B*E);
        }else {
            System.out.print((B-A)*E);
        }
    }
}
