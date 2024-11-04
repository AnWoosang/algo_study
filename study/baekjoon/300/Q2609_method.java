import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2609_method {

    public static long gcd(long a, long b){
        if (b == 0) return a;
        return gcd(b, a%b);
    }

    public static long lcm(long a, long b){
        long res = a*b / gcd(a, b);
        return res;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] inputs = br.readLine().split(" ");
        long num1 = Long.parseLong(inputs[0]);
        long num2 = Long.parseLong(inputs[1]);

        bw.write(gcd(num1, num2) + "\n" + lcm(num1, num2) + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}