import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int e = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        if (a >= 3 && e <= 4) {
            stringBuilder.append("TroyMartian").append("\n");
        }
        if (a <= 6 && e >= 2) {
            stringBuilder.append("VladSaturnian").append("\n");
        }
        if (a <= 2 && e <= 3) {
            stringBuilder.append("GraemeMercurian").append("\n");
        }
        System.out.print(stringBuilder);
    }
}
