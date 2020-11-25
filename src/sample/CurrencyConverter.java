package sample;

import java.util.ArrayList;

public class CurrencyConverter {

    final private ArrayList<Currency> dataBase = new ArrayList<>();

    public CurrencyConverter()
    {
        dataBase.add(new Currency("Yen", 124.00));
        dataBase.add(new Currency("US Dollar", 1.19));
    }

    public double converter(double v, String s)
    {
        Currency c=searchDB(s);

        return v * c.getValue();
    }
    public void addCurrency(Currency c)
    {
        dataBase.add(c);
    }

    private Currency searchDB(String s)
    {
        for (Currency c:dataBase)
        {
            if (s.equals(c.getName()))
                return c;
        }
        return null;
    }
}