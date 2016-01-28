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
public abstract class Instrument {

    private String instrumentNumber;
    private String origin;
    private String classification;

    public abstract void play(String notes);

    public abstract void stop();

    public String getInstrumentNumber() {
        return instrumentNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public String getClassification() {
        return classification;
    }

    public void setInstrumentNumber(String InstrumentNumber) {
        this.instrumentNumber = InstrumentNumber;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setClasification(String classification) {
        this.classification = classification;
    }

}
