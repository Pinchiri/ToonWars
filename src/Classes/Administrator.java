/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import static Constants.Constants.CARTOON_NETWORK_INT;
import static Constants.Constants.CARTOON_NETWORK_STRING;
import static Constants.Constants.NEW_CHARACTER_CHANCE;
import static Constants.Constants.NICKELODEON_INT;
import static Constants.Constants.NICKELODEON_STRING;

/**
 *
 * @author Rolando
 */
public class Administrator extends Thread {

    private AnimationStudio Nickelodeon;
    private AnimationStudio CartoonNetwork;
    private int cyclesCounter;
    private int newCharacterChance;

    public Administrator() {
        this.Nickelodeon = new AnimationStudio(NICKELODEON_INT, NICKELODEON_STRING);
        this.CartoonNetwork = new AnimationStudio(CARTOON_NETWORK_INT, CARTOON_NETWORK_STRING);
        this.cyclesCounter = 0;
        this.newCharacterChance = NEW_CHARACTER_CHANCE;
    }

    // Getters and Setters
    public AnimationStudio getNickelodeon() {
        return Nickelodeon;
    }

    public void setNickelodeon(AnimationStudio Nickelodeon) {
        this.Nickelodeon = Nickelodeon;
    }

    public AnimationStudio getCartoonNetwork() {
        return CartoonNetwork;
    }

    public void setCartoonNetwork(AnimationStudio CartoonNetwork) {
        this.CartoonNetwork = CartoonNetwork;
    }

    public int getCyclesCounter() {
        return cyclesCounter;
    }

    public void setCyclesCounter(int cyclesCounter) {
        this.cyclesCounter = cyclesCounter;
    }

    public int getNewCharacterChance() {
        return newCharacterChance;
    }

    public void setNewCharacterChance(int newCharacterChance) {
        this.newCharacterChance = newCharacterChance;
    }

}
