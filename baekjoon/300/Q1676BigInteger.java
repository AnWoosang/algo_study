import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Q1676BigInteger{


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        
        BigInteger facto = new BigInteger("1");
        BigInteger res = new BigInteger("0");

        for(int i = 1; i <= n; i++){
            facto = facto.multiply(BigInteger.valueOf(i));
        }

        while(true){
            if(facto.remainder(BigInteger.valueOf(10))!=BigInteger.valueOf(0)){
                break;
            }
            else{
                res = res.add(BigInteger.valueOf(1));
                facto = facto.divide(BigInteger.valueOf(10));
            }
        }
        bw.write(res + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}