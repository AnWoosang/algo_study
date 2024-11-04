import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Q1158 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);
        ArrayList<Integer> arr = new ArrayList<>();
        int stand = k-1;
        int[] output = new int[n];

        for (int i = 1; i <= n; i++) {
            arr.add(i);
        }
        int size = arr.size();
        
        for(int i = 0; i < n; i ++){
            if (stand >= size){
                stand %= size;
            }
            output[i] = arr.get(stand);
            arr.remove(stand);
            size--;
            stand+=k-1;
        }

        bw.write("<");
        for (int i = 0; i < n-1; i++) {
            bw.write(output[i]+", ");
        }
        bw.write(output[n-1]+">\n");
        
        bw.flush();
        bw.close();
        br.close();
    }
}
