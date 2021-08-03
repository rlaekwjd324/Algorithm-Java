import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String departHour = bufferedReader.readLine();
        int hour = Integer.parseInt(departHour.substring(0, 2));
        int minute = Integer.parseInt(departHour.substring(3));
        int time = 120;
        if ((hour+2 > 7 && hour < 10)) {
            time-=(hour);
        } else if (hour+2 > 15 && hour < 17) {

        } else {
            hour += 2;
        }
        String hourString = String.valueOf(hour);
        String minString = String.valueOf(minute);
        if (hour / 10 == 0) {
            hourString = "0" + hourString;
        }
        if (minute / 10 == 0) {
            minString = "0" + minString;
        }
        System.out.print(hourString + ":" + minString);
    }
}
