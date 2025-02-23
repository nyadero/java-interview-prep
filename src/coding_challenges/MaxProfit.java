package coding_challenges;

public class MaxProfit {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public static int maxProfit(int[] prices){
        double maxProfit = 0, minPrice = Double.POSITIVE_INFINITY;
        for(int price : prices){
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return (int) maxProfit;
    }
}
