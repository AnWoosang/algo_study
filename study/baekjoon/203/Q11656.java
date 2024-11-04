import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q11656 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int size = input.length();
        String[] result = new String[size];

        for (int i = 0; i < size; i++) {
            result[i] = input.substring(i, size);
        }

        Arrays.sort(result);

        for(String s : result){
            bw.write(s + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}