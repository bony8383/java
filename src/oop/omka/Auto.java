// Version 1.0
package oop.omka;

public class Auto extends Transport {
    private String marka;
    private int preis;
    private int year;

    public Auto() {
        this.marka = "Белгисиз";
        this.preis = 0;
        this.year = 1970;
    }

    public Auto(String marka, int preis) {
        this.marka = marka;
        this.preis = preis;
        this.year = 2000;
    }

    // Setter & Getter
    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        if (preis > 0) {
            this.preis = preis;
        } else {
            System.out.println("Баа терс боло албайт!");
        }
    }

    public void setYear(int year) {
        if (year > 1900 && year < 2025) {
            this.year = year;
        } else {
            System.out.println("Машинанын жылы туура эмес!");
        }
    }

    public void all() {
        System.out.println("Машинанын маркасы: " + marka + ", баасы: " + preis + " доллар.");
    }
}

