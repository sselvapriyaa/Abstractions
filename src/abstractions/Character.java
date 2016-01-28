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
public abstract class Character {

    private String gender;
    private String creator;
    String costume;

    public abstract void setGender(String gender);

    public abstract void setCreator(String creator);

    public abstract String getGender();

    public abstract String getCreator();
}
