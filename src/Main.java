import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int L = Integer.parseInt(stringTokenizer.nextToken());
        int[] array = new int[N+1];
        int count = 0;
        array[1]++;
        int catchingNum = 1;
        while (true) {
            if (array[catchingNum] % 2 == 0) {
                catchingNum = catchingNum - L;
                if (catchingNum <= 0)
                    catchingNum += N;
            } else {
                catchingNum = catchingNum + L;
                if (catchingNum > N)
                    catchingNum -= N;
            }
            array[catchingNum]++;
            count++;
            if (array[catchingNum] == M) {
                System.out.print(count);
                return;
            }
        }
    }
}
