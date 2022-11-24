package models;

public class Car {

    int seatcount;
    int tyrecount;
    double engine;
    boolean awd;
    String color;

    public void setSeatcount(int seatcount) {
        this.seatcount = seatcount;
    }

    public void setTyrecount(int tyrecount) {
        this.tyrecount = tyrecount;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public void setAwd(boolean awd) {
        this.awd = awd;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    String carmodel;

    public Car(int seatcount, int tyrecount, double engine, boolean awd, String color, String carmodel) {
        this.seatcount = seatcount;
        this.tyrecount = tyrecount;
        this.engine = engine;
        this.awd = awd;
        this.color = color;
        this.carmodel = carmodel;
    }
//-----decleration of variables------







    public void startCar() {

        System.out.println("vrom");
    }
    public void StopCar(){

        System.out.println("stawp");
    }




}

