import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
	    int[] array = new int[3];
		array[0] = Integer.parseInt(stk.nextToken());
		array[1] = Integer.parseInt(stk.nextToken());
		array[2] = Integer.parseInt(stk.nextToken());
		Arrays.sort(array);
		System.out.println(array[1]);
	}
}
