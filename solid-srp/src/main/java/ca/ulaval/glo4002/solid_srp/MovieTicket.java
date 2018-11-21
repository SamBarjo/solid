package ca.ulaval.glo4002.solid_srp;

public abstract class MovieTicket {

    private static final float STUDENT_PRICE = 0.9f;
    private float price;

    public MovieTicket(float price, boolean isStudent) {
        if (isStudent) {
            this.price = price * STUDENT_PRICE;
        } else {
            this.price = price;
        }
    }

    public float getPrice() {
        return price;
    }
}
