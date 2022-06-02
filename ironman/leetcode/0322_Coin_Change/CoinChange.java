import java.util.Arrays;

public class CoinChange {
    
    public static int coinChange(int[] coins, int amount) {
        int coinCounter = 0;
        Arrays.sort(coins);
        for (int value = coins.length -1; value >= 0; value--) {
            coinCounter += amount / coins[value];
            System.out.println("value:" + coins[value] + " amount: " + amount / coins[value]);
            amount = amount % coins[value];
            System.out.println("current anount: " + amount);
            System.out.println("current coinCounter: " + coinCounter);
        }
        
        System.out.println("current anount: " + amount);
        if (amount > 0) {
            coinCounter = -1;
        }
        return coinCounter;
    }

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1, 2, 5}, 11));
        System.out.println(coinChange(new int[]{2}, 3));
        System.out.println(coinChange(new int[]{2, 5, 10, 1}, 27));
        System.out.println(coinChange(new int[]{186,419,83,408}, 6249));
    }
}
