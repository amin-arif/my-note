import java.lang.*;
import java.util.*;

public class FibonacciSeries {
    
    private static int[] fibArr;
    private static int key = 1;

    private static void addNumber(int limit) {
        int res = fibArr[key] + fibArr[key-1];

        if (res < limit)
        {
            key++;
            fibArr[key] = res;

            addNumber(limit);
        }
        
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int limit = 0;

        try {
            limit = Integer.parseInt(input.nextLine());
        } catch (Exception e) {
            e.printStackTrace();
        }

        input.close();

        fibArr = new int[limit];
        fibArr[0] = 0;
        fibArr[1] = 1;

        addNumber(limit);

        System.out.println(fibArr.length);

        for (int i=0; i<key+1; i++) {
            System.out.print(fibArr[i] + " ");
        }
    }
}

