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
public class Guitar extends Instrument {

    String instrumentNumber;
    String origin;

    public void playMusic(String notes) {
        System.out.println("Play the chords when a finger is placed on the string ");
    }

    public void endMusic() {
        System.out.println("Stop the chords when a finger is released from the string");
    }

    @Override
    public void setInstrumentNumber(String instrumentNumber) {
        this.instrumentNumber = instrumentNumber;
    }

    @Override
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String getInstrumentNumber() {
        return instrumentNumber;
    }

    @Override
    public String getOrigin() {
        return origin;
    }

}
