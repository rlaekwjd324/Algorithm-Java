import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] array = new int[5];
        for (int i = 0; i < n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());
            if(x == 0 || y == 0){
                array[0]++;
                continue;
            }
            if(x>0&&y>0){
                array[1]++;
                continue;
            }
            if(x>0 && y<0){
                array[4]++;
                continue;
            }
            if(x<0 && y>0){
                array[2]++;
                continue;
            }
            if(x<0 && y<0){
                array[3]++;
            }
        }
        System.out.println("Q1: "+array[1]);
        System.out.println("Q2: "+array[2]);
        System.out.println("Q3: "+array[3]);
        System.out.println("Q4: "+array[4]);
        System.out.println("AXIS: "+array[0]);
    }
}
