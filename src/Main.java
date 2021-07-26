import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(bufferedReader.readLine());
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < K; i++) {
            int number = Integer.parseInt(bufferedReader.readLine());
            if (number == 0 && !stack.empty()) {
                stack.pop();
                continue;
            }
            stack.push(number);
        }
        for (int number : stack) {
            sum += number;
        }
        System.out.print(sum);
    }
}
