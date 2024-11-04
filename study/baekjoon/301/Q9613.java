import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q9613{

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] line;
        int[] nums;

        // 항상 결과 값이 int의 범위를 초과할 수 있음을 고려해야한다. 
        // int변수에 결과값을 저장하는 경우 오버플로우로 인해 틀린 것으로 채점된다.
        long res;

        for (int i = 0; i < n; i++) {
            res = 0;
            line = br.readLine().split(" ");
            nums = new int[Integer.parseInt(line[0])];
            for (int j = 0; j < nums.length; j++) {
                nums[j] = Integer.parseInt(line[j+1]);
            }
            for (int j = 0; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(nums[j] < nums[k]){
                        res += gcd(nums[k], nums[j]);
                    }
                    else {
                        res += gcd(nums[j], nums[k]);
                    }
                }
            }
            bw.write(res+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}