/*
C - Free Ice Cream
After their adventure with the magic mirror Kay and Gerda have returned home and sometimes give free ice cream to kids in the summer.

At the start of the day they have x ice cream packs. Since the ice cream is free, people start standing in the queue before Kay and Gerda's house even in the night. Each person in the queue wants either to take several ice cream packs for himself and his friends or to give several ice cream packs to Kay and Gerda (carriers that bring ice cream have to stand in the same queue).

If a carrier with d ice cream packs comes to the house, then Kay and Gerda take all his packs. If a child who wants to take d ice cream packs comes to the house, then Kay and Gerda will give him d packs if they have enough ice cream, otherwise the child will get no ice cream at all and will leave in distress.

Kay wants to find the amount of ice cream they will have after all people will leave from the queue, and Gerda wants to find the number of distressed kids.

Input
The first line contains two space-separated integers n and x (1???n???1000, 0???x???109).

Each of the next n lines contains a character '+' or '-', and an integer di, separated by a space (1???di???109). 
Record "+ di" in i-th line means that a carrier with di ice cream packs occupies i-th place from the start of the queue, 
and record "- di" means that a child who wants to take di packs stands in i-th place.

Output
Print two space-separated integers � number of ice cream packs left after all operations, and number of kids that left the house in distress.

Example
Input
5 7
+ 5
- 10
- 20
+ 40
- 20
Output
22 1
Input
5 17
- 16
- 2
- 98
+ 100
- 98
Output
3 2
Note
Consider the first sample.

Initially Kay and Gerda have 7 packs of ice cream.
Carrier brings 5 more, so now they have 12 packs.
A kid asks for 10 packs and receives them. There are only 2 packs remaining.
Another kid asks for 20 packs. Kay and Gerda do not have them, so the kid goes away distressed.
Carrier bring 40 packs, now Kay and Gerda have 42 packs.
Kid asks for 20 packs and receives them. There are 22 packs remaining.
 */

import java.util.*;
import java.io.*;

public class C_Free_Ice_Cream {

    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));

        int n = in.nextInt();
        int x = in.nextInt();
        char a[] = new char[n];
        int b[] = new int[n];
        long count = x;
        int depress=0;
        for (int i = 0; i < n; i++) {
            a[i] = in.next().charAt(0);
            b[i] = in.nextInt();
        }
        in.close();
        for (int i = 0; i < n; i++) {
            if (a[i] == '+') {
                count += b[i];

            } else {
                count -= b[i];
            }
            if (count<0) {
                count += b[i];
                depress++;
            }
            
        }
        System.out.print(count);
        System.out.println(" "+depress);
       
    }

}
