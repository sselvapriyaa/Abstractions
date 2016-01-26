/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractions;

/**
 *
 * @author sanandamirtharaj
 */
public abstract class Instruments {

    private String instrumentNumber;
    private String color;
    private String manufacturer;

    public abstract void play(String notes);

    public abstract void stop();

    public String getInstrumentNumber() {
        return instrumentNumber;
    }

    public String getColor() {
        return color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setInstrumentNumber(String InstrumentNumber) {
        this.instrumentNumber = InstrumentNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}
