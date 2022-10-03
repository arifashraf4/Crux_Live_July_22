package Lec26;

public class Coin_Permutation {
    public static void main(String[] args) {
        //Infinite Coins
        int coin[] = {2, 3, 5, 6};
        int amount = 10;
        printAnswer(coin, amount, "");
    }

    public static void printAnswer(int coin[], int amount, String ans) {
        if (amount == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < coin.length; i++) {
            if (amount >= coin[i]) {
//                //With Backtracking
//                amount -= coin[i];
                printAnswer(coin, amount - coin[i], ans + coin[i]);
//                amount += coin[i];
            }
        }
    }
}
