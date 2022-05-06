import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] array = new int[n];
        int[] sortedArray = new int[n];
        StringTokenizer stk = new StringTokenizer(bf.readLine());
        for (int i=0;i<n;i++) {
            array[i] = Integer.parseInt(stk.nextToken());
            sortedArray[i] = array[i];
        }
        Arrays.sort(sortedArray);
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if(array[i] != sortedArray[i]) {
                answer++;
            }
        }
        System.out.print(answer);
    }
}
