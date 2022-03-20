import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        StringBuilder sb = new StringBuilder();
        while (!num.equals("0")) {
            while (num.length() > 1) {
                int sum = 0;
                for (int i = 0; i < num.length(); i++) {
                    sum += (num.charAt(i) - '0');
                }
                num = String.valueOf(sum);
            }
            sb.append(num).append("\n");
            num = br.readLine();
        }
        System.out.print(sb);
    }
}

