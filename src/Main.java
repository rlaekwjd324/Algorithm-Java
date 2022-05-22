import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String strA = bufferedReader.readLine();
        String strB = bufferedReader.readLine();
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            int minus = Integer.parseInt(strB.split(" ")[i])-Integer.parseInt(strA.split(" ")[i]);
            if(minus > 0) {
                sum += minus;
            }
        }
        System.out.print(sum);
    }
}
