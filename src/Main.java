import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine())*3;
        n += Integer.parseInt(bufferedReader.readLine())*2;
        n += Integer.parseInt(bufferedReader.readLine())*1;
        int m = Integer.parseInt(bufferedReader.readLine())*3;
        m += Integer.parseInt(bufferedReader.readLine())*2;
        m += Integer.parseInt(bufferedReader.readLine())*1;
        if(n>m ){
            System.out.print("A");
        }else if(n<m) {
            System.out.print("B");
        }else {
            System.out.print("T");
        }
    }
}
