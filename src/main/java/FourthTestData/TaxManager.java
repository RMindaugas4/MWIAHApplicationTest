package FourthTestData;

import Common.DTO;


public class TaxManager {


    public static double getGrossAmount(double netValue, double VATMultiplayer) {
        if (netValue <= 0 || VATMultiplayer <= 0) {
            throw new ValuesWasZeroOrNegativeException("Net Value and VAT Multiplyer value cannot be 0 or negative");
        }

        return netValue * VATMultiplayer;
    }

    public static double getGrossAmountRounded(double netValue, double VATMultiplayer) {
        if (netValue <= 0 || VATMultiplayer <= 0) {
            throw new ValuesWasZeroOrNegativeException("Net Value and VAT Multiplyer value cannot be 0 or negative");
        }

        double result = netValue * VATMultiplayer;
        result = Math.round(result * 1e2) / 1e2;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(getGrossAmount(3.57, DTO.valueAddedTaxMultiplyer));

        System.out.println(getGrossAmountRounded(3.57, DTO.valueAddedTaxMultiplyer));


    }
}
