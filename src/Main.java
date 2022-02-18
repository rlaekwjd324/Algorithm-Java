import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int A[] = new int[10];
        int B[] = new int[10];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int j = 0; j < 10; j++) {
            A[j] = Integer.parseInt(stringTokenizer.nextToken());
        }
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int j = 0; j < 10; j++) {
            B[j] = Integer.parseInt(stringTokenizer.nextToken());
        }
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (A[i] > B[i]) {
                count++;
            } else if (A[i] < B[i]) {
                count--;
            }
        }
        if (count > 0) {
            System.out.println("A");
            return;
        }
        if (count < 0) {
            System.out.println("B");
            return;
        }
        System.out.println("D");
    }
}