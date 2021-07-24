import java.io.IOException;

public class Solution {
    public String solution(int[] numbers, String hand) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        int prevLeftNumber = 10;
        int prevRightNumber = 12;
        for (int number : numbers) {
            if (number == 0) {
                number = 11;
            }
            int leftDiv = 0;
            int rightDiv = 0;
            switch (number % 3) {
                case 1:
                    stringBuilder.append("L");
                    prevLeftNumber = number;
                    continue;
                case 2:
                    leftDiv = Math.abs(prevLeftNumber - number) / 3 + Math.abs(prevLeftNumber - number) % 3;
                    rightDiv = Math.abs(prevRightNumber - number) / 3 + Math.abs(prevRightNumber - number) % 3;
                    if (leftDiv > rightDiv) {
                        stringBuilder.append("R");
                        prevRightNumber = number;
                        continue;
                    }
                    if(leftDiv==rightDiv&& hand.equals("right")){
                        stringBuilder.append("R");
                        prevRightNumber = number;
                        continue;
                    }
                    stringBuilder.append("L");
                    prevLeftNumber = number;
                    continue;
                case 0:
                    stringBuilder.append("R");
                    prevRightNumber = number;
                    continue;
            }
        }
        return stringBuilder.toString();
    }
}