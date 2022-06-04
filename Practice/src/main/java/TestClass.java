import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        int[] A = new int [N];
        String[] inp = br.readLine().split(" ");
        for(int i=0;i<N;i++) 
        {
            A[i] = Integer.parseInt(inp[i]);
        }
        int Q = Integer.parseInt(br.readLine().trim());
        for(int i=0;i<Q;i++) {
            String[] inp1 = br.readLine().split(" ");
            int L = Integer.parseInt(inp1[0]);
            int R = Integer.parseInt(inp1[1]);
            int out_ = solve(N, A, L ,R);
            System.out.println(out_);
        }
	    wr.close();
        br.close();
    }
    static int solve(int N, int[] A, int L, int R) {
        int[] copiedArray = Arrays.copyOfRange(A,L-1,R);
        Arrays.sort(copiedArray);
        int medial = (int)Math.ceil(copiedArray.length/2.0);
        return copiedArray[medial-1];
    }
}