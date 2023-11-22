/**********************************************************************************************************
 
Staircase 
==========

This is a staircase of size n=4.

:

   #
  ##
 ###
####

Its base and height are both equal to n.

It is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size n.

***********************************************************************************************************/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        int j;
        int s=n;
        for (int i=1;i<=n;i++)
        {   
            for(j=1;j<s;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("#");
            }
            s--;
            System.out.println();
        
        }
    }
}

public class StairCase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
