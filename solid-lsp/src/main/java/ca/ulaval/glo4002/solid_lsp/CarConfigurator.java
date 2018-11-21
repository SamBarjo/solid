package ca.ulaval.glo4002.solid_lsp;

public class CarConfigurator {

    private Car car;

    public CarConfigurator(Car car) {
        this.car = car;
    }

    public CarConfigurator withColor(String color) {
        car.setColor(color);
        return this;
    }

    public CarConfigurator withLength(int length) {
        car.setLength(length);
        return this;
    }

    public CarConfigurator withWheels(int count) {
        car.setWheels(count);
        return this;
    }
}
