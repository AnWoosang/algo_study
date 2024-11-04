import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10824 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        String s1 = input[0]+input[1];
        String s2 = input[2]+input[3];
        
        long num1 = Long.valueOf(s1);
        long num2 = Long.valueOf(s2);
        long res = num1+num2;
        bw.write(res+"\n");

        bw.flush();
        br.close();
        bw.close();
    }
}