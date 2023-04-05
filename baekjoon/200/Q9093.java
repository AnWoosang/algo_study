import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q9093 {

    public static String reverse(String s){
        StringBuffer sb = new StringBuffer();
        for (int i = s.length() - 1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String[] temp;
        
        for(int i = 0; i < n; i++){
            temp = br.readLine().split(" ");
            for(String s: temp){
                bw.write(reverse(s)+" ");
            }
            bw.write("\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }    
}
