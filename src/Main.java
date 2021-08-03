import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] mstk = new int[4];
        for (int i = 0; i < 4; i++) {
            switch (stringTokenizer.nextToken()){
                case "R":
                    mstk[i] = 0;
                    break;
                case "P":
                    mstk[i] = 1;
                    break;
                case "S":
                    mstk[i] = 2;
                    break;
            }
        }

        if(mstk[0]==mstk[1]){
            if(mstk[2]==((mstk[0]+1)%3) || mstk[3]==((mstk[0]+1)%3)){
                System.out.print("TK");
                return;
            }
        }
        if(mstk[2]==mstk[3]){
            if(mstk[0]==((mstk[2]+1)%3) || mstk[1]==((mstk[2]+1)%3)){
                System.out.print("MS");
                return;
            }
        }
        System.out.print("?");
    }
}
