/*
A. Hulk
Dr. Bruce Banner hates his enemies (like others don't). As we all know, he can barely talk when he turns into the incredible Hulk. 
That's why he asked you to help him to express his feelings.

Hulk likes the Inception so much, and like that his feelings are complicated. They have n layers. The first layer is hate, 
second one is love, third one is hate and so on...

For example if n?=?1, then his feeling is "I hate it" or if n?=?2 it's "I hate that I love it", 
and if n?=?3 it's "I hate that I love that I hate it" and so on.

Please help Dr. Banner.

Input
The only line of the input contains a single integer n (1???n???100) � the number of layers of love and hate.

Output
Print Dr.Banner's feeling in one line.

Examples
input
1
output
I hate it
input
2
output
I hate that I love it
input
3
output
I hate that I love that I hate it
*/


import java.util.*;
import java.io.*;

public class A_Hulk {

    public static void main(String[] args) {

        Scanner in = new Scanner(new InputStreamReader(System.in));
        int n = in.nextInt();
        String s1[] ={"I hate","I love"};
        String s2 = "I hate";
        for (int i = 1; i < n; i++) {
            s2+=" that "+s1[i%2];
        }
        System.out.println(s2+" it");
        

    }

}
