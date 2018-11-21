package ca.ulaval.glo4002.solid_lsp;

public class Car {

    private int length;
    private int width;
    private String color;
    private int wheelCount;

    public void setColor(String color) {
        this.color = color;
    }

    public void setLength(int length) {
        this.length = length;
        this.width = length / 2;
    }

    public void setWheels(int count) {
        wheelCount = count;
    }

    public int getWidth() {
        return width;
    }

}
