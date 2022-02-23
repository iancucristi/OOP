package ro.itschool.Stock;

public class Stock {
    private String simbol;
    private String numeStock;
    private double closingPrice;
    private double currentPrice;

    public Stock(String simbol, String numeStock) {
        this.simbol = simbol;
        this.numeStock = numeStock;
    }

    public void setClosingPrice(double closingPrice) {
        this.closingPrice = closingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        return Math.abs(((this.closingPrice - this.currentPrice) / this.closingPrice) * 100);
    }
}
