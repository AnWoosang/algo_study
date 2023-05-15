import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q6588{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n;
        boolean[] primeNums = new boolean[1000001];
        Arrays.fill(primeNums, true);
        primeNums[0] = primeNums[1] = false;
        for (int i = 2; i*i <= 1000000; i++) {
            for (int j = i*i; j <= 1000000; j+=i){
                primeNums[j]=false;
            }
        }

        while ((n = Integer.parseInt(br.readLine())) != 0){
            for (int i = 3; i < n; i++) {
                if (primeNums[i] && primeNums[n-i]){
                    bw.write(n + " = " + i + " + " + (n-i)+ "\n");
                    break;
                }
            }            
        }

        bw.flush();
        bw.close();
        br.close();
    }
}