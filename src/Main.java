import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        ArrayList<Person> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            Person person = new Person(stringTokenizer.nextToken(), Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()));
            arrayList.add(person);
        }
        arrayList.sort((o1, o2) -> {
            if (o1.year > o2.year) {
                return 1;
            } else if (o1.year == o2.year) {
                if (o1.month > o2.month) {
                    return 1;
                } else if (o1.month == o2.month) {
                    if (o1.day > o2.day) {
                        return 1;
                    }
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
            return 0;
        });
        System.out.println(arrayList.get(arrayList.size() - 1).name);
        System.out.println(arrayList.get(0).name);
    }

    public static class Person {
        String name;
        int day;
        int month;
        int year;

        public Person(String name, int day, int month, int year) {
            this.name = name;
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }
}
