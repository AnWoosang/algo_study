import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Q1918 {
public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuffer sb = new StringBuffer();
        Stack<Character> optSt = new Stack<>();
        char[] input = br.readLine().toCharArray();
        int size = input.length;

        boolean bracket = false;
        int cnt = 0;
        char ch;
        char prev='\0';

        while(true){
            if(cnt >= size){
                break; 
            }
            ch = input[cnt];

            if(ch == '+' || ch =='-'){
                if(!optSt.empty()){
                    if(optSt.peek() == '+' || optSt.peek() == '-'){
                        sb.deleteCharAt(sb.length()-1);
                        sb.append(optSt.pop());
                        sb.append(prev);
                        cnt++;
                    }
                }
                optSt.push(ch);
            }
            else if (ch == '*' || ch == '/'){
                optSt.push(ch);
            }
            else if (ch == '('){

            }
            else if (ch == ')'){

            }
            else {
                sb.append(ch);
                cnt++;
                prev = ch;
                if (!optSt.empty()){
                    sb.append(optSt.pop());
                    cnt++;  
                }
            }

        }
        bw.write(sb.toString()+"\n");
        bw.flush();
        br.close();
        bw.close();
    }
}