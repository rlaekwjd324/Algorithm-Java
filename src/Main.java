import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int widthComputer = Integer.parseInt(stringTokenizer.nextToken());
        int heightComputer = Integer.parseInt(stringTokenizer.nextToken());
        int widthSticker = Integer.parseInt(stringTokenizer.nextToken());
        int heightSticker = Integer.parseInt(stringTokenizer.nextToken());
        if (widthComputer >= widthSticker + 2 && heightComputer >= heightSticker + 2) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}
