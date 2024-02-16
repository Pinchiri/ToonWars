/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Rolando
 */
public class Administrator {

    private AnimationStudio Nickelodeon;
    private AnimationStudio CartoonNetwork;
    private int cyclesCounter;
    private float newCharacterChance;

    public Administrator() {
        this.Nickelodeon = new AnimationStudio(0, "Nickelodeon");
        this.CartoonNetwork = new AnimationStudio(1, "Cartoon Network");
        this.cyclesCounter = 0;
        this.newCharacterChance = 0.8f;
    }

    //Getters and Setters
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

    public float getNewCharacterChance() {
        return newCharacterChance;
    }

    public void setNewCharacterChance(float newCharacterChance) {
        this.newCharacterChance = newCharacterChance;
    }

}
