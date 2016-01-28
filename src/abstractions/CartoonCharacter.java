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
public abstract class CartoonCharacter extends Character{

   

    public abstract void startAnimation(int frameRate);

    public abstract void stopAnimation();

     

    public String getCostume() {
        return costume;
    }

    
    
    public void setCostume(String costume) {
        this.costume = costume;
    }

}
