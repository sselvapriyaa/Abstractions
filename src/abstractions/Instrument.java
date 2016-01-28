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
    String classification;

    public abstract void setInstrumentNumber(String instrumentNumber);
    public abstract void setOrigin(String origin);
    public abstract String getInstrumentNumber();
    public abstract String getOrigin();

    
   
   
}
