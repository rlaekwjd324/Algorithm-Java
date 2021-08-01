import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[][] rectangle = new int[4][2];
        for (int i = 0; i < 3; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            rectangle[i][0] = Integer.parseInt(stringTokenizer.nextToken());
            rectangle[i][1] = Integer.parseInt(stringTokenizer.nextToken());
        }
        for (int i = 0; i < 2; i++) {
            if (rectangle[0][i] == rectangle[1][i]){
                rectangle[3][i] = rectangle[2][i];
            }else if(rectangle[1][i] == rectangle[2][i]){
                rectangle[3][i] = rectangle[0][i];
            }else {
                rectangle[3][i] = rectangle[1][i];
            }
        }
        System.out.print(rectangle[3][0]+" "+rectangle[3][1]);
    }
}
