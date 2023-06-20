import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1676{


    public static int[] divider(int n){
        int[] res = {0, 0};
        while(true){
            if(n%2!=0) break;
            else{
                res[0]+=1;
                n/=2;
            }
        }

        while(true){
            if(n%5!=0) break;
            else{
                res[1]+=1;
                n/=5;
            }
        }

        return res;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int twoRes = 0;
        int fiveRes = 0;
        int res;

        int[] twoFive = new int[2];

        for(int i = 1; i <= n; i++){
            twoFive = divider(i);
            twoRes+=twoFive[0];
            fiveRes+=twoFive[1];
        }

        if(twoRes > fiveRes){
            res = fiveRes;
        }
        else{
            res = twoRes;
        }

        bw.write(res+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}