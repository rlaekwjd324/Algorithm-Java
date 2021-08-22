import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static Person[] people;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());
        people = new Person[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int w = Integer.parseInt(stringTokenizer.nextToken());
            int h = Integer.parseInt(stringTokenizer.nextToken());
            people[i] = new Person(w, h);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            stringBuilder.append(getRank(i)).append("\n");
        }
        System.out.print(stringBuilder);
    }

    private static class Person {
        int w, h;

        Person(int w, int h) {
            this.w = w;
            this.h = h;
        }
    }

    private static int getRank(int idx) {
        int rank = 0;
        Person person = people[idx];
        for (int i = 0; i < N; i++) {
            if (idx != i) {
                if (people[i].w > person.w && people[i].h > person.h) {
                    rank++;
                }
            }
        }
        return rank + 1;
    }
}
