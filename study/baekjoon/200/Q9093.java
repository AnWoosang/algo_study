import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q9093 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        char temp;
        StringBuffer sb = new StringBuffer();
        boolean done;
        
        for(int i = 0; i < n; i++){
            done = false;
            while(!done){
                temp = (char)(br.read());
                if(temp == '\n' || temp == ' '){
                    sb.reverse();
                    bw.write(sb.toString().strip()+" ");
                    sb.delete(0, sb.length());
                    if(temp == '\n'){
                        bw.write('\n');
                        done = true;
                    }
                }
                sb.append(temp);
            }
        }
        
        bw.flush();
        br.close();
        bw.close();
    }    
}
