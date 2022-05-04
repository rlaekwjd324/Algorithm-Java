import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String nowTime = bufferedReader.readLine();
        String startTime = bufferedReader.readLine();
        int[] nowTimeArray = {Integer.parseInt(nowTime.split(":")[0]), Integer.parseInt(nowTime.split(":")[1]), Integer.parseInt(nowTime.split(":")[2])};
        int[] startTimeArray = {Integer.parseInt(startTime.split(":")[0]), Integer.parseInt(startTime.split(":")[1]), Integer.parseInt(startTime.split(":")[2])};
        startTimeArray[2] = startTimeArray[2] - nowTimeArray[2];
        if (startTimeArray[2] < 0) {
            startTimeArray[2] += 60;
            startTimeArray[1]--;
            if (startTimeArray[1] == 0) {
                startTimeArray[1] += 60;
                startTimeArray[0]--;
                if (startTimeArray[0] == 0) {
                    startTimeArray[0] += 24;
                }
            }
        }
        startTimeArray[1] = startTimeArray[1] - nowTimeArray[1];
        if (startTimeArray[1] < 0) {
            startTimeArray[1] += 60;
            startTimeArray[0]--;
            if (startTimeArray[0] == 0) {
                startTimeArray[0] += 24;
            }
        }
        startTimeArray[0] = startTimeArray[0] - nowTimeArray[0];
        if (startTimeArray[0] < 0) {
            startTimeArray[0] += 24;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(startTimeArray[0] < 10 ? "0" + startTimeArray[0] : startTimeArray[0]).append(":").append(startTimeArray[1] < 10 ? "0" + startTimeArray[1] : startTimeArray[1]).append(":").append(startTimeArray[2] < 10 ? "0" + startTimeArray[2] : startTimeArray[2]);
        System.out.print(stringBuilder);
    }
}
