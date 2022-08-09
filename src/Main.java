import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1995, "ITMO");
        hashMap.put(1996, "SPbSU");
        hashMap.put(1997, "SPbSU");
        hashMap.put(1998, "ITMO");
        hashMap.put(1999, "ITMO");
        hashMap.put(2000, "SPbSU");
        hashMap.put(2001, "ITMO");
        hashMap.put(2002, "ITMO");
        hashMap.put(2003, "ITMO");
        hashMap.put(2004, "ITMO");
        hashMap.put(2005, "ITMO");
        hashMap.put(2006, "PetrSU, ITMO");
        hashMap.put(2007, "SPbSU");
        hashMap.put(2008, "SPbSU");
        hashMap.put(2009, "ITMO");
        hashMap.put(2010, "ITMO");
        hashMap.put(2011, "ITMO");
        hashMap.put(2012, "ITMO");
        hashMap.put(2013, "SPbSU");
        hashMap.put(2014, "ITMO");
        hashMap.put(2015, "ITMO");
        hashMap.put(2016, "ITMO");
        hashMap.put(2017, "ITMO");
        hashMap.put(2018, "SPbSU");
        hashMap.put(2019, "ITMO");
        System.out.print(hashMap.get(Integer.parseInt(bufferedReader.readLine())));
    }
}
