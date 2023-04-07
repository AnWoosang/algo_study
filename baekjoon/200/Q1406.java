import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1406 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        StringBuffer sb = new StringBuffer();
        sb.append(br.readLine());
        int cursor = sb.length();
        int size = sb.length();

        int n = Integer.parseInt(br.readLine().strip());

        String input_str;
        for (int i = 0; i < n; i++){
            input_str = br.readLine();

            if (input_str.contains("P")){
                sb.insert(cursor++, input_str.charAt(2));
                size++;
            }
            else if (input_str.equals("L")){
                if (cursor == 0) continue;
                cursor--;
            }
            else if (input_str.equals("D")){
                if (cursor == size) continue;
                cursor++;
            }
            else{
                if(cursor == 0) continue;
                sb.delete(cursor-1, cursor--);
                size--;
            }
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
        
        
    }
}
