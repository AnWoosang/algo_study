import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Q10828{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> st = new Stack<>();
        String temp;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++){
            temp = br.readLine();

            if(temp.contains("push")){
                st.push(Integer.parseInt(temp.split(" ")[1]));
            }
            else if(temp.contains("pop")){
                if (st.empty()){
                    bw.write("-1\n");
                }
                else{
                    bw.write(Integer.toString(st.pop())+"\n");
                }
            }
            else if (temp.contains("size")){
                bw.write(Integer.toString(st.size())+"\n");
            }
            else if (temp.contains("empty")){
                if(st.empty()){
                    bw.write("1\n");
                }
                else{
                    bw.write("0\n");
                }
            }
            else if (temp.contains("top")){
                if(st.empty()){
                    bw.write("-1\n");
                }
                else{
                    bw.write(Integer.toString(st.peek())+"\n");
                }
            }
            else{
                bw.write("Wrong Input...\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}