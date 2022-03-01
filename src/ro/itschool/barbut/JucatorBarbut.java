package ro.itschool.barbut;

public class JucatorBarbut {
    private int dicesResult;
    Zar dice1 = new Zar();
    Zar dice2 = new Zar();

    public JucatorBarbut() {

    }

    public int rollDices() {
        int min = 1, max = 6;
        int coef = max - min + 1;
        int randomResult1 = (int) (coef * Math.random() + min);
        int dice1Result = dice1.getDiceValue(randomResult1);
        int randomResult2 = (int) (coef * Math.random() + min);
        int dice2Result = dice2.getDiceValue(randomResult2);
        this.dicesResult=dice1Result + dice2Result;
        return dicesResult;
    }

    public int getDicesResult() {
        return dicesResult;
    }
}
