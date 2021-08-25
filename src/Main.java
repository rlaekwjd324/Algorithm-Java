import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        if(a.equals("0")){
            System.out.print("YONSEI");
        }else{
            System.out.print("Leading the Way to the Future");
        }
    }
}
