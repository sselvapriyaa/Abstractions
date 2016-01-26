/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractions;

/**
 *
 * @author Gladwin
 */
public abstract class Vehicle {

    private String vehicleNumber;
    private String color;
    private String manufacturer;

    public abstract void accelerate(int speed);

    public abstract void stop();

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getColor() {
        return color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}
