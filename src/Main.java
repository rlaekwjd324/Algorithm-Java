import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(bufferedReader.readLine());
            int sum = 0;
            for (int j = 0; j < n; j++) {
                StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                sum += isWinnerPlayer1(stringTokenizer.nextToken(), stringTokenizer.nextToken());
            }
            if (sum > 0) {
                stringBuilder.append("Player 1").append("\n");
            } else if (sum == 0) {
                stringBuilder.append("TIE").append("\n");
            } else {
                stringBuilder.append("Player 2").append("\n");
            }
        }
        System.out.print(stringBuilder);
    }

    public static int isWinnerPlayer1(String player1, String player2) {
        switch (player1) {
            case "R":
                if (player2.equals("R")) {
                    return 0;
                }
                if (player2.equals("S")) {
                    return 1;
                }
                if (player2.equals("P")) {
                    return -1;
                }
            case "S":
                if (player2.equals("S")) {
                    return 0;
                }
                if (player2.equals("P")) {
                    return 1;
                }
                if (player2.equals("R")) {
                    return -1;
                }
                break;
            case "P":
                if (player2.equals("P")) {
                    return 0;
                }
                if (player2.equals("R")) {
                    return 1;
                }
                if (player2.equals("S")) {
                    return -1;
                }
                break;
        }
        return 0;
    }
}
