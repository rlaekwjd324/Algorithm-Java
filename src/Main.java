import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        String dna = bufferedReader.readLine();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("AA", "A");
        hashMap.put("AG", "C");
        hashMap.put("AC", "A");
        hashMap.put("AT", "G");
        hashMap.put("GA", "C");
        hashMap.put("GG", "G");
        hashMap.put("GC", "T");
        hashMap.put("GT", "A");
        hashMap.put("CA", "A");
        hashMap.put("CG", "T");
        hashMap.put("CC", "C");
        hashMap.put("CT", "G");
        hashMap.put("TA", "G");
        hashMap.put("TG", "A");
        hashMap.put("TC", "G");
        hashMap.put("TT", "T");
        if (N == 1) {
            System.out.println(dna);
            return;
        }
        String tempDna = String.valueOf(dna.charAt(N - 2)) + dna.charAt(N - 1);
        for (int i = 0; i < N - 2; i++) {
            tempDna = dna.charAt(N - i - 3) + hashMap.get(tempDna);
        }
        System.out.println(hashMap.get(tempDna));
    }
}
