/*
B - New Year and Days 
Today is Wednesday, the third day of the week. What's more interesting is that tomorrow is the last day of the year 2015.

Limak is a little polar bear. He enjoyed this year a lot. Now, he is so eager to the coming year 2016.

Limak wants to prove how responsible a bear he is. He is going to regularly save candies for the entire year 2016!
 He considers various saving plans. He can save one candy either on some fixed day of the week or on some fixed day of the month.

Limak chose one particular plan. He isn't sure how many candies he will save in the 2016 with his plan. Please, calculate it and tell him.

Input
The only line of the input is in one of the following two formats:

"x of week" where x (1???x???7) denotes the day of the week. The 1-st day is Monday and the 7-th one is Sunday.
"x of month" where x (1???x???31) denotes the day of the month.
Output
Print one integer � the number of candies Limak will save in the year 2016.

Example
Input
4 of week
Output
52
Input
30 of month
Output
11
Note
Polar bears use the Gregorian calendar. It is the most common calendar and you likely use it too. 
You can read about it on Wikipedia if you want to � https://en.wikipedia.org/wiki/Gregorian_calendar. The week starts with Monday.

In the first sample Limak wants to save one candy on each Thursday (the 4-th day of the week). There are 52 Thursdays in the 2016. 
Thus, he will save 52 candies in total.

In the second sample Limak wants to save one candy on the 30-th day of each month. There is the 30-th day in exactly 11 months in the 2016 
� all months but February. It means that Limak will save 11 candies in total.
*/
import java.util.*;
import java.io.*;

public class B_New_Year_and_Days  {

    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        int ans;
        int x = in.nextInt();
        String s=in.nextLine();
        in.close();
        if (s.contains("week")) {
            if (x==5 || x==6) {
                ans=53;
            }else  ans =52;
           
        }else {
            if (x==30){
                ans=11;
            }else if (x==31) {
                ans=7;
            }else {
                ans =12;
            }
        }
      
         System.out.println(ans);

    }

}