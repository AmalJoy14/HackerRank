/**********************************************************************************************************
 
You are in charge of the cake for a child's birthday.
You have decided the cake will have one candle for each year of their total age.
They will only be able to blow out the tallest of the candles.
Count how many candles are tallest.

Example
candles = [4,4,1,3]

The maximum height candles are 4 units high. There are 2 of them, so return 2.

***********************************************************************************************************/

import java.util.Scanner;

public class BirthdayCake {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int candlesCount =sc.nextInt();

        int [] candles = new int[candlesCount];

        for (int i = 0; i < candlesCount; i++) {
            candles[i]=sc.nextInt();
        }
        
        System.out.println(birthdayCakeCandles(candles,candlesCount));
        sc.close();
    }
    
    public static int birthdayCakeCandles(int [] candles,int candlesCount) {
        int largest=0,count=0;
        
        for (int i=0;i<candlesCount;i++){
            if (candles[i]>largest){
                count=1;
                largest=candles[i];
            }
            else if (candles[i]==largest){
                count++;
            }       
        }
        return count;
    }
}