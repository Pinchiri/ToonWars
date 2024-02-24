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

import java.util.Random;
import java.util.concurrent.Semaphore;

import UserInterface.MainUI;

/**
 *
 * @author Rolando
 */
public class Administrator extends Thread {

    private AnimationStudio Nickelodeon;
    private AnimationStudio CartoonNetwork;
    private int cyclesCounter;
    private int newCharacterChance;
    private Semaphore synchronization;
    private ArtificialIntelligence AI;
    private MainUI userInterface;

    public Administrator(Semaphore synchronization, ArtificialIntelligence AI, MainUI userInterface) {
        this.Nickelodeon = new AnimationStudio(NICKELODEON_INT, NICKELODEON_STRING);
        this.CartoonNetwork = new AnimationStudio(CARTOON_NETWORK_INT, CARTOON_NETWORK_STRING);
        this.cyclesCounter = 0;
        this.newCharacterChance = NEW_CHARACTER_CHANCE;
        this.synchronization = synchronization;
        this.AI = AI;
        this.userInterface = userInterface;
    }

    @Override
    public void run() {
        while (true) {
            try {

                getSynchronization().acquire();
                // TODO - Remove when implemented the correct initialization
                Character newCharacter = new Character(getNickelodeon().generateCharacterStringID(NICKELODEON_INT),
                        "Eskere 1", 1, new Stats(1, 1, 1, 1, 1, 1));
                Character newCharacter2 = new Character(
                        getCartoonNetwork().generateCharacterStringID(CARTOON_NETWORK_INT), "Eskere 2", 1,
                        new Stats(1, 1, 1, 1, 1, 1));

                // TODO - Remove when implemented the correct initialization
                getNickelodeon().addCharacter(newCharacter);
                getCartoonNetwork().addCharacter(newCharacter2);

                chooseFighters();

                if (getAI().getBattleOcurring() == null) {
                    System.out.println("No hay peleadores disponibles");
                    sleep(2000);
                    continue;
                }

                System.out.println(
                        "Ya se escogieron los peleadores: "
                        + getAI().getBattleOcurring().getFirstFighter().getName()
                        + " vs " + getAI().getBattleOcurring().getSecondFighter().getName());

                getNickelodeon().increaseStarvationCounters();
                getCartoonNetwork().increaseStarvationCounters();

                if (cyclesCounter == 2) {
                    setCyclesCounter(0);

                    Random random = new Random();

                    if (random.nextInt(1, 101) < newCharacterChance) {
                        // TODO - Change when Add Character method is refactored
                    }
                }

                cyclesCounter++;
                getUserInterface().changeAIStatus("Picking Winner");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void chooseFighters() {
        Character firstFighter = getNickelodeon().getNextFighter();
        getAI().setFirstFighter(firstFighter);
        Character secondFighter = getCartoonNetwork().getNextFighter();
        getAI().setSecondFighter(secondFighter);

        if (firstFighter != null && secondFighter != null) {
            Battle battle = new Battle(firstFighter, secondFighter);
            getAI().setBattleOcurring(battle);
        }
    }

    public void updateUserInterfaceValues() {

    }

    public void updateUserInterfaceQueues() {

    }

    public void updateUserInterfaceCharacters() {

    }

    public AnimationStudio getStudioByStudioInt(int studioInt) {
        return switch (studioInt) {
            case 0 ->
                getNickelodeon();
            case 1 ->
                getCartoonNetwork();
            default ->
                null;
        };
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

    public Semaphore getSynchronization() {
        return synchronization;
    }

    public ArtificialIntelligence getAI() {
        return AI;
    }

    public void setAI(ArtificialIntelligence AI) {
        this.AI = AI;
    }

    public MainUI getUserInterface() {
        return userInterface;
    }
}
