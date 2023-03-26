package org.example;

import java.util.Iterator;
import java.util.List;

public class Calc {
    public Double sum(List<? extends Number> items) {
        double sum = 0.0;
        for (Number i : items)
            sum += i.doubleValue();
        return sum;
    }

    public Double mult(List<? extends Number> items) {
        double mult = 1.0;
        for (Number i : items)
            mult *= i.doubleValue();
        return mult;
    }

    public Double div(List<? extends Number> items) {
        double div = 0.0;
        for (Iterator<Number> i = (Iterator<Number>) items.iterator(); i.hasNext(); ) {
            div = i.next().doubleValue() / i.next().doubleValue();
        }
        return div;
    }

    public Integer bin10to2(List<? extends Number> items) {
        int bin10to2 = 0;
        for (Iterator<Number> i = (Iterator<Number>) items.iterator(); i.hasNext(); ) {
            bin10to2 = i.next().intValue();
            String sStr = "";
            int iNumb = bin10to2;
            while (iNumb > 0) {
                sStr += Integer.toString(iNumb % 2);
                iNumb = iNumb / 2;
            }
            String sStr2 = "";
            for (int j = sStr.length() - 1; j >= 0; j--) {
                sStr2 += Character.toString(sStr.charAt(j));
            }
            bin10to2 = Integer.parseInt(sStr2);
        }
        return bin10to2;
    }

    public String bin2to10(List<? extends Number> items) {
        String bin2to10 = "";
        for (Iterator<Number> i = (Iterator<Number>) items.iterator(); i.hasNext(); ) {
            bin2to10 = i.next().toString();
            String sStr = bin2to10;
            String sStr2 = "";
            int iStepenTwo = 1;
            Integer iNumb2 = Integer.parseInt(Character.toString(sStr.charAt(sStr.length() - 1)));
            for (int j = sStr.length() - 2; j >= 0; j--) {
                sStr2 = Character.toString(sStr.charAt(j));
                iStepenTwo *= 2;
                iNumb2 += Integer.parseInt(sStr2) * iStepenTwo;
            }
            bin2to10 = iNumb2.toString();
        }
        return bin2to10;
    }
}
