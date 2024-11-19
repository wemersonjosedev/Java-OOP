package membrosEstáticos.Exercícios.util;

public class CurrencyConverter {

    public static double dollar;
    public static double bought;

    public static final double TAX = 0.06;

    public static double valueDollarsSolid(){
        return bought * dollar * (1.0 + TAX);
    }
}
