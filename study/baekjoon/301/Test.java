import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Test{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] a = {1, 2, 4, 3};
        Arrays.sort(a);
        
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}