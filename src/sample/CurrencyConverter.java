package sample;

public class CurrencyConverter
{
    private int toConvert;

    public double toEuro(double Yen)
    {
        double Euro;
        Euro = Yen / 124;
        return Euro;
    }

    public double toYen(double Euro)
    {
        double Yen;
        Yen = Euro * 124;
        return Yen;
    }
}