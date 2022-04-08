import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int A[] = new int[3];
        int C[] = new int[3];

        StringTokenizer stk = new StringTokenizer(bufferedReader.readLine());
        A[0] = Integer.parseInt(stk.nextToken());
        A[1] = Integer.parseInt(stk.nextToken());
        A[2] = Integer.parseInt(stk.nextToken());
        stk = new StringTokenizer(bufferedReader.readLine());
        C[0] = Integer.parseInt(stk.nextToken());
        C[1] = Integer.parseInt(stk.nextToken());
        C[2] = Integer.parseInt(stk.nextToken());
        
        System.out.print((C[0]-A[2])+" "+(C[1]/A[1])+" "+(C[2]-A[0]));
    }
}
