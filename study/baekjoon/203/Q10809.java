import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Q10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int current;
        int[] result = new int[26];
        int count = 0;

        for (int i = 0; i < 26; i++){
            result[i] = -1;
        }

        while((current = br.read()) != '\n'){
            if(result[current-97] == -1){
                result[current-97]=count;
            }
            count++;
        }

        for(int i : result){
            bw.write(i+" ");
        }
        bw.write("\n");
        bw.flush();
        br.close();
        bw.close();
    }
}