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
public class Mickey extends CartoonCharacter {
    String gender;
    String creator;
    public void animation(int frameRate) {
        System.out.println("The number of frames per second is ");
    }

    public void stop() {
       // System.out.println("");
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setCreator(String creator) {
        this.creator=creator;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getCreator() {
        return creator;
    }

}
