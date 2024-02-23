/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import static Constants.Constants.DRAW_RATE;
import static Constants.Constants.NON_COMBAT_RATE;
import static Constants.Constants.WIN_RATE;

import java.util.Random;
import java.util.concurrent.Semaphore;

import DataStructures.LinkedList;

/**
 *
 * @author Rolando
 */
public class ArtificialIntelligence extends Thread {

    private Character firstFighter;
    private Character secondFighter;
    private int winRate;
    private int drawRate;
    private int nonCombatRate;
    private LinkedList<Character> winners;
    private Battle battleOcurring;
    private Semaphore synchronization;

    public ArtificialIntelligence(Semaphore synchronization) {
        this.firstFighter = null;
        this.secondFighter = null;
        this.winRate = WIN_RATE;
        this.drawRate = DRAW_RATE;
        this.nonCombatRate = NON_COMBAT_RATE;
        this.winners = new LinkedList<>();
        this.battleOcurring = null;
        this.synchronization = synchronization;
    }

    @Override
    public void run() {
        while (true) {
            try {
                getSynchronization().acquire();
                chooseWinner();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void chooseWinner() {
        // TODO - Modify User Interface to show the winner
        if (getBattleOcurring() != null) {
            Random random = new Random();
            int randomResult = random.nextInt(1, 101);

            if (randomResult <= getDrawRate()) {
                getBattleOcurring().setResult(1);
                getWinners().addLast(null);
                System.out.println("Empate");
            } else if (randomResult > getDrawRate() && randomResult <= getDrawRate() + getNonCombatRate()) {
                getBattleOcurring().setResult(2);
                getWinners().addLast(null);
                System.out.println("No ocurrio");
            } else if (randomResult > getDrawRate() + getNonCombatRate()
                    && randomResult <= getDrawRate() + getNonCombatRate() + getWinRate()) {
                determineWinner(random);
            }
        }

    }

    public void determineWinner(Random random) {
        int pickWinner = random.nextInt(1, 3);
        if (pickWinner == 1) {
            getWinners().addLast(getFirstFighter());
            getBattleOcurring().setResult(0);
            getBattleOcurring().setWinner(getFirstFighter());
            System.out.println("Ganador: " + getFirstFighter().getName());
        } else {
            getWinners().addLast(getSecondFighter());
            getBattleOcurring().setResult(0);
            getBattleOcurring().setWinner(getSecondFighter());
            System.out.println("Ganador: " + getSecondFighter().getName());
        }
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

    public int getWinRate() {
        return winRate;
    }

    public void setWinRate(int winRate) {
        this.winRate = winRate;
    }

    public int getDrawRate() {
        return drawRate;
    }

    public void setDrawRate(int drawRate) {
        this.drawRate = drawRate;
    }

    public int getNonCombatRate() {
        return nonCombatRate;
    }

    public void setNonCombatRate(int nonCombatRate) {
        this.nonCombatRate = nonCombatRate;
    }

    public LinkedList<Character> getWinners() {
        return winners;
    }

    public void setWinners(LinkedList<Character> winners) {
        this.winners = winners;
    }

    public Battle getBattleOcurring() {
        return battleOcurring;
    }

    public void setBattleOcurring(Battle battleOcurring) {
        this.battleOcurring = battleOcurring;
    }

    public Semaphore getSynchronization() {
        return synchronization;
    }

}
