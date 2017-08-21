/*
F - Xenia and Ringroad 
Xenia lives in a city that has n houses built along the main ringroad. 
The ringroad houses are numbered 1 through n in the clockwise order. 
The ringroad traffic is one way and also is clockwise.

Xenia has recently moved into the ringroad house number 1. As a result, she's got m things to do. 
In order to complete the i-th task, she needs to be in the house number ai and complete all tasks with numbers less than i. 
Initially, Xenia is in the house number 1, find the minimum time she needs to complete all her tasks if moving from a house 
to a neighboring one along the ringroad takes one unit of time.

Input
The first line contains two integers n and m (2<=n<=105,1 <= m <=105). The second line contains m integers a1,?a2,?...,?am (1???ai???n). 
Note that Xenia can have multiple consecutive tasks in one house.

Output
Print a single integer � the time Xenia needs to complete all tasks.

Please, do not use the %lld specifier to read or write 64-bit integers in ?++. It is preferred to use the cin, cout streams or the %I64d specifier.

Example
Input
4 3
3 2 3
Output
6
Input
4 3
2 3 3
Output
2
*/
import java.util.Scanner;

public class F_Xenia_and_Ringroad {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        int m = in.nextInt();
        int a[] = new int[m];
        long ans;
        for (int i = 0; i < m; i++) {
            a[i]=in.nextInt();
        }
        ans = a[0] - 1;
        for(int i=1;i<m;i++){
           
            if(a[i]>=a[i-1]) 
                ans+=(a[i]-a[i-1]);
            else 
                ans += (n-a[i-1])+(a[i]-1)+1;
        }
        System.out.println(ans);
    
       
    }
}