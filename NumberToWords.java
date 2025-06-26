package JavaBasicCodes;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        NumberToWords ntw = new NumberToWords();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String number = sc.nextLine();
        int dotCount = 0;
        for (char c : number.toCharArray()) {
            if (c == '.') {
                dotCount++;
            } else if (!Character.isDigit(c)) {
                System.out.print("Only Numbers allowed ");
            }
        }

        if (dotCount > 1) {
            System.out.println("Only 1 decimal allowed");
        }
        String ganzteil = number;
        String nachkommateil = "";

        if (number.contains(".")) {
            int dotIndex = number.indexOf(".");
            ganzteil = number.substring(0, dotIndex);
            nachkommateil = number.substring(dotIndex + 1);
        }

        if (nachkommateil.length() > 1) {
            System.out.println("Only upto 1 decimal place allowed");
        }

        int ganzzahl = Integer.parseInt(ganzteil.isEmpty() ? "0" : ganzteil);
        if (ganzzahl > 99 || ganzzahl < 0) {
            System.out.println("Invalid range...Enter number only between 0 and 99");
        }

        String output = ntw.numberToWords(ganzzahl);
        if (!nachkommateil.isEmpty()) {
            int nachkommazahl = Integer.parseInt(nachkommateil);
            output += "komma" + ntw.numberToWords(nachkommazahl);
        }

        System.out.println("Number in words : " + output);
    }

    public String numberToWords(int n) {
        String[] unterzehn = {
                "null", "eins", "zwei", "drei", "vier", "fünf",
                "sechs", "sieben", "acht", "neun"
        };
        String[] unterzwanzig = {
                "zehn", "elf", "zwölf", "dreizehn", "vierzehn",
                "fünfzehn", "sechzehn", "siebzehn", "achtzehn", "neunzehn"
        };
        String[] zehns = {
                "", "", "zwanzig", "dreißig", "vierzig", "fünfzig",
                "sechzig", "siebzig", "achtzig", "neunzig"

        };
        if (n < 10) return unterzehn[n];
        if (n < 20) return unterzwanzig[n - 10];

        int onesDigit = n % 10;
        int tensDigit = n / 10;

        if (onesDigit == 0) {
            return zehns[tensDigit];
        }

        return unterzehn[onesDigit] + "und" + zehns[tensDigit];
    }
}
