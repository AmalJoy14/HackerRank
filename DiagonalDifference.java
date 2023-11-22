/**********************************************************************************************************
 
Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix arr is shown below:

1 2 3
4 5 6
9 8 9  

The left-to-right diagonal =1+5+9=15.
The right to left diagonal = 3+5+9=17.
Their absolute difference is |15-17|=2. 

***********************************************************************************************************/

import java.util.Scanner;
public class DiagonalDifference{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][] arr=new int [n][n];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum1=0,sum2=0;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (i==j){
                    sum1+=arr[i][j];
                }
                if (n-1==i+j){
                    sum2+=arr[i][j];
                }
            }
        }   
        int diff=sum1-sum2;
        if (diff<0){
            diff=diff+(-2*diff);
            System.out.println(diff);
        }
        else{
            System.out.println(diff);
        }
        sc.close();
    }
}

