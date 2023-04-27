import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Q10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] counts = new int[26];
        int current;
        while((current = br.read()) != '\n'){
            counts[current - 97]++;
        }
        for (int i : counts){
            bw.write(i+" ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
        br.close();
    }
}