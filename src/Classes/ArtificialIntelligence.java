/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import static Constants.Constants.DRAW_RATE;
import static Constants.Constants.NON_COMBAT_RATE;
import static Constants.Constants.WIN_RATE;

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
                synchronization.acquire();
                System.out.println("AI is working");

            } catch (Exception e) {
                e.printStackTrace();
            }
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

}
