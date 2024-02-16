/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Rolando
 */
public class Battle {

    private Character firstContestant;
    private Character secondContestant;
    private int result; // 0 = Win, 1 = Draw, 2 = Not happened

    public Battle(Character firstContestant, Character secondContestant) {
        this.firstContestant = firstContestant;
        this.secondContestant = secondContestant;
        this.result = -1;
    }

    //Getters and Setters
    public Character getFirstContestant() {
        return firstContestant;
    }

    public void setFirstContestant(Character firstContestant) {
        this.firstContestant = firstContestant;
    }

    public Character getSecondContestant() {
        return secondContestant;
    }

    public void setSecondContestant(Character secondContestant) {
        this.secondContestant = secondContestant;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

}
