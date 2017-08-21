/*
/*
B - Beautiful Matrix 

You've got a 5???5 matrix, consisting of 24 zeroes and a single number one. 
Let's index the matrix rows by numbers from 1 to 5 from top to bottom, 
let's index the matrix columns by numbers from 1 to 5 from left to right. In one move, 
you are allowed to apply one of the two following transformations to the matrix:

Swap two neighboring matrix rows, that is, rows with indexes i and i?+?1 for some integer i (1?<=?i?<?5).
Swap two neighboring matrix columns, that is, columns with indexes j and j?+?1 for some integer j (1?<=j?<?5).
You think that a matrix looks beautiful, if the single number one of the matrix is located in its middle 
(in the cell that is on the intersection of the third row and the third column). 
Count the minimum number of moves needed to make the matrix beautiful.

Input
The input consists of five lines, each line contains five integers: the j-th integer in the i-th line of the input 
represents the element of the matrix that is located on the intersection of the i-th row and the j-th column. 
It is guaranteed that the matrix consists of 24 zeroes and a single number one.

Output
Print a single integer � the minimum number of moves needed to make the matrix beautiful.

0 0 0 0 0
0 0 0 0 1
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
 */
 

import java.util.Scanner;

public class B_Beautiful_Matrix  {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[][] a = new int[5][5];
        int index[] = new int[2];
        int count=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = in.nextInt();
                if (a[i][j] == 1) {
                    index[0] = i;
                    index[1] = j;
                }
                if (a[2][2]==1) {
                    System.out.println(0);
                    return;
                }

            }
        }
        count = Math.abs(2-index[0])+Math.abs(2-index[1]);
       
        System.out.println(count);
         
    }
}
