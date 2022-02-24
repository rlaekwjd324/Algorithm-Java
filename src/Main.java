import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        ArrayList<Integer> students = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int position = 0;
            if (students.size() > a) {
                position = students.size() - a;
            }
            students.add(position, i + 1);
        }
        for (int i = 0; i < count; i++) {
            System.out.print(students.get(i) + " ");
        }
    }

}
