import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //    1->1
    //    2->4->8->6->2
    //    3->9->7->1->3
    //    4->6->4
    //    5->5
    //    6->6
    //    7->9->3->1->7
    //    8->4->2->6->8
    //    9->1->9
    //    0->0
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < T; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            b = b % 4;
            if (b == 0) {
                b = 4;
            }
            a = a % 10;
            int powNum = (int) Math.pow(a, b);
            if (powNum % 10 == 0) {
                stringBuilder.append("10").append("\n");
            } else {
                stringBuilder.append((powNum % 10)).append("\n");
            }
        }
        System.out.print(stringBuilder);
    }
}
