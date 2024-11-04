import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Q2609 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] inputs = br.readLine().split(" ");

        BigInteger num1 = new BigInteger(inputs[0]);
        BigInteger num2 = new BigInteger(inputs[1]);
        BigInteger g = num1.gcd(num2);
        BigInteger l = num1.multiply(num2).divide(g);
        bw.write(g+"\n"+l+"\n");
        bw.flush();
        br.close();
        bw.close();
    }
}