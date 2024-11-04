import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;


public class Q1929 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] temp = br.readLine().split(" ");
        int a = Integer.parseInt(temp[0]);
        int b = Integer.parseInt(temp[1]);
        
        boolean[] isPrime = new boolean[1000001];
        Arrays.fill(isPrime, true);
        boolean done = false;

        isPrime[0] = false;
        isPrime[1] = false;
        int nextPrime = 2;
        int i;

        while (!done){
            i = 2;
            while ((i <= 1000000/nextPrime)){
                isPrime[nextPrime*i] = false;
                i++;
            }
            while (!isPrime[++nextPrime]){
                if(nextPrime+2 > 1000000){
                    done = true;
                    break;
                }
            }
            // System.out.println(nextPrime);
        }

        for(i = a; i <= b; i++){
            if(isPrime[i]){
                bw.write(i+"\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}