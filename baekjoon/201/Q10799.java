import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Q10799 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] line = br.readLine().toCharArray();
        int size = line.length;
        StringBuffer sb = new StringBuffer();
        Stack<Character> st = new Stack<>();
        int tot = 0;
        int tmp = -1;
        int res = 0;
        char prev = '\0';
        for(char c : line){
            if(c == '('){
                sb.append(c); 
                tmp++;
            }
            else{
                if (sb.charAt(tmp) == '('){
                    sb.deleteCharAt(tmp--);
                    sb.append('1');
                    tmp++;
                }
                else{
                    sb.append(c);
                    tmp++;
                }
            }
        }
        
        line = sb.toString().toCharArray();
        tmp = 0;

        for(char ch : line){
            if (st.empty() && ch == '1'){
                continue;
            }
            else{
                if(ch == '('){
                    st.push(ch);
                    tot++;
                }
                else if(ch == '1'){
                    res+=tot;
                }
                else{
                    st.pop();
                    res+=1;
                    tot--;
                }
            }
            prev = ch;
        }
        bw.write(Integer.toString(res)+"\n");
        

        bw.flush();
        br.close();
        bw.close();
    }
}
