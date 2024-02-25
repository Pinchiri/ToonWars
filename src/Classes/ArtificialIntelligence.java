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
import UserInterface.MainUI;

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
    private Semaphore readyAI;
    private MainUI userInterface;
    private int processingSpeedInMS;
    private AnimationStudio nickelodeon;
    private AnimationStudio cartoonNetwork;

    public ArtificialIntelligence(Semaphore synchronization, Semaphore readyAI, int processingSpeedInMS,
            AnimationStudio nickelodeon, AnimationStudio cartoonNetwork, MainUI userInterface) {
        this.firstFighter = null;
        this.secondFighter = null;
        this.winRate = WIN_RATE;
        this.drawRate = DRAW_RATE;
        this.nonCombatRate = NON_COMBAT_RATE;
        this.winners = new LinkedList<>();
        this.battleOcurring = null;
        this.synchronization = synchronization;
        this.userInterface = userInterface;
        this.readyAI = readyAI;
        this.processingSpeedInMS = processingSpeedInMS;
        this.nickelodeon = nickelodeon;
        this.cartoonNetwork = cartoonNetwork;
    }

    @Override
    public void run() {
        while (true) {
            try {
                getSynchronization().acquire();

                getUserInterface().changeAIStatus("Picking Winner");
                chooseWinner();
                sleep(getProcessingSpeedInMS());

                getReadyAI().release();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void chooseWinner() {
        // TODO - Modify User Interface to show the winner
        if (getBattleOcurring() != null) {
            Random random = new Random();
            int randomResult = random.nextInt(1, 100);

            if (randomResult <= getDrawRate()) {
                System.out.println("Empate");
                getBattleOcurring().setResult(1);
            } else if (randomResult > getDrawRate() && randomResult <= getDrawRate() + getNonCombatRate()) {
                System.out.println("No hubo combate");
                getBattleOcurring().setResult(2);
            } else if (randomResult > getDrawRate() + getNonCombatRate()
                    && randomResult <= getDrawRate() + getNonCombatRate() + getWinRate()) {
                determineWinner(random);
            }
        }
    }

    public void determineWinner(Random random) {
        if (getFirstFighter() != null && getSecondFighter() != null) {
            int pickWinner = random.nextInt(1, 3);
            if (pickWinner == 1) {
                getWinners().addLast(getFirstFighter());

                getNickelodeon().setWinsQty(getNickelodeon().getWinsQty() + 1);
                getUserInterface().changeWinsCounterByStudio(getNickelodeon().getStudioInt(),
                        getNickelodeon().getWinsQty());

                getBattleOcurring().setResult(0);
                getBattleOcurring().setWinner(getFirstFighter());
            } else {
                getWinners().addLast(getSecondFighter());

                getCartoonNetwork().setWinsQty(getCartoonNetwork().getWinsQty() + 1);
                getUserInterface().changeWinsCounterByStudio(getCartoonNetwork().getStudioInt(),
                        getCartoonNetwork().getWinsQty());

                getBattleOcurring().setResult(0);
                getBattleOcurring().setWinner(getSecondFighter());
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

    public Semaphore getSynchronization() {
        return synchronization;
    }

    public MainUI getUserInterface() {
        return userInterface;
    }

    public Semaphore getReadyAI() {
        return readyAI;
    }

    public int getProcessingSpeedInMS() {
        return processingSpeedInMS;
    }

    public void setProcessingSpeedInMS(int processingSpeedInMS) {
        this.processingSpeedInMS = processingSpeedInMS;
    }

    public AnimationStudio getNickelodeon() {
        return nickelodeon;
    }

    public AnimationStudio getCartoonNetwork() {
        return cartoonNetwork;
    }
}
