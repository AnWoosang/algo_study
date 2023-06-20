import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1373{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuffer sb = new StringBuffer();
        StringBuffer tmp = new StringBuffer();
        StringBuffer res = new StringBuffer();
        int size;
        sb.append(br.readLine()); 
        sb.reverse();
        size = sb.length();

        for (int i = 0; i < size; i++) {
            tmp.append(sb.charAt(i));
            if (i % 3 == 2 || i == size - 1){
                res.append(Integer.toOctalString(Integer.parseInt(tmp.reverse().toString(), 2)));
                tmp.delete(0, tmp.length());
            }
        }

        bw.write(res.reverse().toString()+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}