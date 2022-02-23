package ro.itschool.Stock;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("stk", "Facebook");
        stock.setClosingPrice(200);
        stock.setCurrentPrice(223);
        double procent = stock.getChangePercent();
        System.out.println(procent);
    }
}
