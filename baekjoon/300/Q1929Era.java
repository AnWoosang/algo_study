import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q1929Era {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = 1000000;

        boolean isPrime[] = new boolean[1000001];
        Arrays.fill(isPrime, true);

        String[] temp = br.readLine().split(" ");
        int a = Integer.parseInt(temp[0]);
        int b = Integer.parseInt(temp[1]);

        // 소수는 false
        // 1은 소수가 아니므로 제외
        isPrime[0] = isPrime[1] = false;
        
        // 에러토스 테네스의 채
        for(int i=2; i*i<=N; i++){
        	// isPrime[i]가 소수라면
            if(isPrime[i]){
            	// isPrime[j] 소수가 아닌 표시
            	for(int j=i*i; j<=N; j+=i) isPrime[j]=false;                
            }        
        }    
        
        for (int i = a; i <= b; i++) {
            if(isPrime[i]) bw.write(i + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}