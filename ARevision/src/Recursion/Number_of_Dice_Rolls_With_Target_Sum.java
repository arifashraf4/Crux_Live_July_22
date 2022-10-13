package Recursion;

//Q.1155 - Number of Dice Rolls With Target Sum (Leetcode Question)
public class Number_of_Dice_Rolls_With_Target_Sum {
    static int count = 0;
    public static void main(String[] args) {
        int n = 2; //No. of dice
        int dice = 30; //No.of Faces
        int target = 34; //Target value
        rollsToTarget(n, dice, target, "");
        count = count % (int)(Math.pow(10,9) + 7) ;
        System.out.println(count);
    }

    //Only works for smaller values, for higher values it will give TLE
    public static void rollsToTarget(int n, int dice, int target, String ans) {

        if (n == 0 && target == 0) {
            count++;
            System.out.println(ans);
            return;
        }

        if (n == 0 && target > 0) {
            return;
        }

        if (n < 0 || target < 0) {
            return;
        }

        for (int die = 1; die <= dice; die++) {
            rollsToTarget(n - 1, dice, target - die, ans + die + " ");
        }


    }
}
