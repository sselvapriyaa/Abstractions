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
public abstract class CartoonCharacter {

    private String gender;
    private String creator;
    private String costume;

    public abstract void animation(int frameRate);

    public abstract void stop();

    public String getGender() {
        return gender;
    }

    public String getCreator() {
        return creator;
    }

    public String getCostume() {
        return costume;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

}
