import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Q10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String inputline;
        char tmp;
        int[] res = new int[4];
        while((inputline=br.readLine()) != null){
            for(int i = 0; i < inputline.length(); i++){
                tmp = inputline.charAt(i);
                if(tmp >= 48 && tmp <= 57) { res[2]++; }   
                else if(tmp >= 65 && tmp <=90) { res[1]++; } 
                else if(tmp >= 97 && tmp <=122) { res[0]++; }
                else { res[3]++; }
            }
            for (int i = 0; i < 4; i++) {
                bw.write(res[i] + " ");
                res[i]=0;
            }
            bw.write("\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}