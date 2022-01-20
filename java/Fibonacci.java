import java.util.*;
import java.io.*;

public class Fibonacci{

    static void fibonacciNum(int n){
        int[] num = new int[n];
        num[0] = 0;
        num[1] = 1;
        for(int i=2; i<n; i++){
            num[i] = num[i-2] + num[i-1];
        }
        
        for (int i : num) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        fibonacciNum(n);
        //System.out.println(fibonacciNum(n));
    }


    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}