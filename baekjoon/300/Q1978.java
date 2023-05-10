import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Q1978 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");
        int[] inputs = new int[n];
        int res = n;

        for (int i = 0; i < n; i++) {
            inputs[i] = Integer.parseInt(temp[i]);
        }

        for (int i : inputs) {
            if (i < 2 || i > 1000){
                res--;
                continue;
            }
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i%j == 0){
                    res--;
                    break;
                }
            }
        }
        bw.write(res+"\n");
        
        bw.flush();
        br.close();
        bw.close();
    }
}