import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd");
        String timeStamp = date.format(new Date());
        System.out.println(timeStamp.split("\\.")[0]);
        System.out.println(timeStamp.split("\\.")[1]);
        System.out.println(timeStamp.split("\\.")[2]);
    }
}
