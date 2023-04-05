import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Test {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        try{
            for (int i = 0 ; i < n ; i++){
                // sb.append(br.readLine());
                // System.out.println(sb.toString());
                // sb.delete(0, sb.length());
                System.out.println(br.readLine());
            }
    
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
