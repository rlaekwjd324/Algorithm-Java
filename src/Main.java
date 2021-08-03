import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        Integer[] cups = {1, 0, 0, 2};
        for (int i = 0; i < input.length(); i++) {
            int temp;
            switch (input.charAt(i)) {
                case 'A':
                    temp = cups[0];
                    cups[0] = cups[1];
                    cups[1] = temp;
                    break;
                case 'B':
                    temp = cups[0];
                    cups[0] = cups[2];
                    cups[2] = temp;
                    break;
                case 'C':
                    temp = cups[0];
                    cups[0] = cups[3];
                    cups[3] = temp;
                    break;
                case 'D':
                    temp = cups[1];
                    cups[1] = cups[2];
                    cups[2] = temp;
                    break;
                case 'E':
                    temp = cups[1];
                    cups[1] = cups[3];
                    cups[3] = temp;
                    break;
                case 'F':
                    temp = cups[2];
                    cups[2] = cups[3];
                    cups[3] = temp;
                    break;
            }
        }
        System.out.println(Arrays.asList(cups).indexOf(1)+1);
        System.out.print(Arrays.asList(cups).indexOf(2)+1);
    }
}
