/*
I - Anton and Digits 
Recently Anton found a box with digits in his room. There are k2 digits 2, k3 digits 3, k5 digits 5 and k6 digits 6.

Anton's favorite integers are 32 and 256. He decided to compose this integers from digits he has. 
He wants to make the sum of these integers as large as possible. Help him solve this task!

Each digit can be used no more than once, i.e. the composed integers should contain no more than k2 digits 2, k3 digits 3 and so on.
 Of course, unused digits are not counted in the sum.

Input
The only line of the input contains four integers k2, k3, k5 and k6 � the number of digits 2, 3, 5 and 6 respectively (0???k2,?k3,?k5,?k6???5?106).

Output
Print one integer � maximum possible sum of Anton's favorite integers that can be composed using digits from the box.

Example
Input
5 1 3 4
Output
800
Input
1 1 1 1
Output
256
Note
In the first sample, there are five digits 2, one digit 3, three digits 5 and four digits 6. 
Anton can compose three integers 256 and one integer 32 to achieve the value 256?+?256?+?256?+?32?=?800. 
Note, that there is one unused integer 2 and one unused integer 6. They are not counted in the answer.

In the second sample, the optimal answer is to create on integer 256, thus the answer is 256.
*/

import java.util.Scanner;

public class I_Anton_and_Digits  {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n[] = new int[4], x;
        
        for (int i = 0; i < 4; i++) {
           n[i] = in.nextInt();
        }
        x = Integer.min(n[2],n[3]);
        x = Integer.min(n[0], x);
        System.out.println(x*256+Integer.min(n[1], n[0]-x)*32);
        
    }
}
