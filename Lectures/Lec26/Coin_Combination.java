package Lec26;

public class Coin_Combination {
    public static void main(String[] args) {
        //Infinite Coins
        int coin[] = {2, 3, 5, 6};
        int amount = 10;
        printAnswer(coin, amount, "", 0);
    }

    public static void printAnswer(int coin[], int amount, String ans, int last) {
        if (amount == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = last; i < coin.length; i++) {
            if (amount >= coin[i]) {
//                //With Backtracking
//                amount -= coin[i];
                printAnswer(coin, amount - coin[i], ans + coin[i], i);
//                amount += coin[i];
            }
        }
    }
}
