package basics.azamat.begimai;

public class Contract {
    private int price;

    public Contract() {
    }

    public Contract(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;

    }

    public void setPrice(int price) {
        if(price<0){
            System.out.println("Preis darf nicht - Zahl sein");
        }
        else {
            this.price=price;
        }
    }



}


