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

    private Character firstFighter;
    private Character secondFighter;
    private int result; // 0 = Win, 1 = Draw, 2 = Not happened
    private Character winner;

    public Battle(Character firstFighter, Character secondFighter) {
        this.firstFighter = firstFighter;
        this.secondFighter = secondFighter;
        this.result = -1;
        this.winner = null;
    }
    
    public String toString(){
        String firstName = (this.getFirstFighter() == null) ?  "-" :this.getFirstFighter().getName();
        String secondName = (this.getSecondFighter() == null) ?  "-" :this.getSecondFighter().getName();
        
        String resultString="";
        
        switch(this.getResult()){
            case -1 ->
                resultString = "---";
            case 0 ->
                resultString = "Winner: " + this.winner.getName();
            case 1 ->
                resultString = "Draw";
            case 2 ->
                resultString = "No Combat";
        }
        String fight = "F1: " + firstName + "  vs  "+ " F2: "+ secondName;
        return fight +"\n" + resultString;
        
    }

    // Getters and Setters
    public Character getFirstFighter() {
        return firstFighter;
    }

    public void setFirstFighter(Character firstFighter) {
        this.firstFighter = firstFighter;
    }

    public Character getSecondFighter() {
        return secondFighter;
    }

    public void setSecondFighter(Character secondFighter) {
        this.secondFighter = secondFighter;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public Character getWinner() {
        return winner;
    }

    public void setWinner(Character winner) {
        this.winner = winner;
    }
}
