import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
        long A = Long.parseLong(stk.nextToken());
		long B = Long.parseLong(stk.nextToken());
		System.out.println((A+B)*(A-B));
    }
}
