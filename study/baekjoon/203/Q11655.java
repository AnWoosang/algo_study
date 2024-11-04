import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11655 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] input = br.readLine().toCharArray();
        StringBuffer sb = new StringBuffer();

        for(char c : input){
            if (c >= 'a' && c <= 'z'){
                if (c-13 < 97 || c-13 > 122){
                    bw.write(c+13);
                }
                else{
                    bw.write(c-13);
                }
            }
            else if(c >= 'A' && c <= 'Z'){
                if (c-13 < 'A' || c-13 > 'Z'){
                    bw.write(c+13);
                }
                else{
                    bw.write(c-13);
                }
            }
            else{
                bw.write(c);
            }
        }
        bw.write("\n");
        bw.flush();
        br.close();
        bw.close();
    }
}