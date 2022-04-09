import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());
        
        if(M == 1 || M == 2) {
            System.out.print("NEWBIE!");
            return;
        }
        if(N >= M) {
            System.out.print("OLDBIE!");
            return;
        }
        System.out.print("TLE!");
    }
}
