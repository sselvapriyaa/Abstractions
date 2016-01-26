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
public abstract class Bird {

    private String name;
    private String color;
    private String sound;

    public abstract void fly(String wings);

    public abstract void sleep();

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSound() {
        return sound;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

}
