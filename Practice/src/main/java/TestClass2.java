import java.io.*;
import java.util.*;


public class TestClass2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        int[] A = new int[N];
        String[] inp = br.readLine().split(" ");
        for(int i=0;i<N;i++)
        {
            A[i] = Integer.parseInt(inp[i]);
        }
        int out_ = solve(N, A);
        System.out.println(out_);

         wr.close();
         br.close();
    }
    static int solve(int N,int[] A){
        // Your code goes here
    }
}