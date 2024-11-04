import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q17413{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringBuffer lst = new StringBuffer();
        StringBuffer rst = new StringBuffer();
        boolean hasTag = false;

        for(char c : input.toCharArray()){
            if(c == '<'){
                hasTag = true;
                if (rst.length() != 0){
                    lst.append(rst.reverse().toString());
                    rst.delete(0, rst.length());
                }
                lst.append(c);
            }
            else if(c == '>'){
                hasTag = false;
                lst.append(c);
            }
            else if(c == ' '){
                lst.append(rst.reverse().toString() + " ");
                rst.delete(0, rst.length());
            }
            else{
                if (hasTag){
                    lst.append(c);
                }
                else{
                    rst.append(c);
                }
            }
        }
        bw.write(lst.toString() + rst.reverse().toString() + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}