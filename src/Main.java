import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] wheels = new String[4];
        String[] newWheels = new String[4];
        for (int i = 0; i < 4; i++) {
            wheels[i] = bufferedReader.readLine();
            newWheels[i] = wheels[i];
        }
        int K = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer;
        for (int i = 0; i < K; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int wheelNumber = Integer.parseInt(stringTokenizer.nextToken());
            int rotateDirection = Integer.parseInt(stringTokenizer.nextToken());
            newWheels[wheelNumber - 1] = rotateWheel(rotateDirection, newWheels[wheelNumber - 1]);
            switch (wheelNumber) {
                case 1:
                    if (isWheelCorrect(wheels[0], wheels[1])) {
                        newWheels[1] = rotateWheel(rotateDirection * (-1), newWheels[1]);
                        if (isWheelCorrect(wheels[1], wheels[2])) {
                            newWheels[2] = rotateWheel(rotateDirection, newWheels[2]);
                            if (isWheelCorrect(wheels[2], wheels[3])) {
                                newWheels[3] = rotateWheel(rotateDirection * (-1), newWheels[3]);
                            }
                        }
                    }
                    break;
                case 2:
                    if (isWheelCorrect(wheels[0], wheels[1])) {
                        newWheels[0] = rotateWheel(rotateDirection * (-1), newWheels[0]);
                    }
                    if (isWheelCorrect(wheels[1], wheels[2])) {
                        newWheels[2] = rotateWheel(rotateDirection * (-1), newWheels[2]);
                        if (isWheelCorrect(wheels[2], wheels[3])) {
                            newWheels[3] = rotateWheel(rotateDirection, newWheels[3]);
                        }
                    }
                    break;
                case 3:
                    if (isWheelCorrect(wheels[1], wheels[2])) {
                        newWheels[1] = rotateWheel(rotateDirection * (-1), newWheels[1]);
                        if (isWheelCorrect(wheels[0], wheels[1])) {
                            newWheels[0] = rotateWheel(rotateDirection, newWheels[0]);
                        }
                    }
                    if (isWheelCorrect(wheels[2], wheels[3])) {
                        newWheels[3] = rotateWheel(rotateDirection * (-1), newWheels[3]);
                    }
                    break;
                case 4:
                    if (isWheelCorrect(wheels[2], wheels[3])) {
                        newWheels[2] = rotateWheel(rotateDirection * (-1), newWheels[2]);
                        if (isWheelCorrect(wheels[1], wheels[2])) {
                            newWheels[1] = rotateWheel(rotateDirection, newWheels[1]);
                            if (isWheelCorrect(wheels[0], wheels[1])) {
                                newWheels[0] = rotateWheel(rotateDirection * (-1), newWheels[0]);
                            }
                        }
                    }
                    break;
            }
            for (int j = 0; j < 4; j++) {
                wheels[j] = newWheels[j];
            }
        }
        int score = 0;
        for (int i = 0; i < 4; i++) {
            score += wheelScore(newWheels[i], i);
        }
        System.out.print(score);
    }

    private static String rotateWheel(int direction, String wheel) {
        if (direction == -1) {
            return wheel.substring(1) + wheel.charAt(0);
        } else {
            return wheel.charAt(7) + wheel.substring(0, wheel.length() - 1);
        }
    }

    private static boolean isWheelCorrect(String left, String right) {
        return left.charAt(2) != right.charAt(6);
    }

    private static int wheelScore(String wheel, int index) {
        if (wheel.charAt(0) == '1') {
            return (int) Math.pow(2, index);
        }
        return 0;
    }
}