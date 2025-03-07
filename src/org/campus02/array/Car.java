package org.campus02.array;

public class Car implements Sortable<Car> {
    private int productionYear;
    private String carType;
    private int drivenKilometer;


    @Override
    public int sort(Car s) {
        if (this.getDrivenKilometer() == s.getDrivenKilometer()) {
            return 0;
        }
        if (this.getDrivenKilometer() < s.getDrivenKilometer()) {
            return -1;
        }
        else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "productionYear=" + productionYear +
                ", carType='" + carType + '\'' +
                ", drivenKilometer=" + drivenKilometer +
                '}';
    }

    public Car(int productionYear, String carType, int drivenKilometer) {
        this.productionYear = productionYear;
        this.carType = carType;
        this.drivenKilometer = drivenKilometer;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getDrivenKilometer() {
        return drivenKilometer;
    }

    public void setDrivenKilometer(int drivenKilometer) {
        this.drivenKilometer = drivenKilometer;
    }

}
