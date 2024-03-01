/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import static Constants.Constants.NEW_CHARACTER_CHANCE;
import static Constants.Constants.ZERO_STATS;

import java.util.Random;
import java.util.concurrent.Semaphore;

import UserInterface.MainUI;

/**
 *
 * @author Rolando
 */
public class Administrator extends Thread {

    private AnimationStudio nickelodeon;
    private AnimationStudio cartoonNetwork;
    private int cyclesCounter;
    private int newCharacterChance;
    private Semaphore synchronization;
    private Semaphore readyAI;
    private ArtificialIntelligence AI;
    private MainUI userInterface;
    private int processingSpeedInMS;

    public Administrator(Semaphore synchronization, Semaphore readyAI, ArtificialIntelligence AI, 
            int processingSpeedInMS, AnimationStudio nickelodeon, AnimationStudio cartoonNetwork,
            MainUI userInterface) {
        this.nickelodeon = nickelodeon;
        this.cartoonNetwork = cartoonNetwork;
        this.cyclesCounter = 1;
        this.newCharacterChance = NEW_CHARACTER_CHANCE;
        this.synchronization = synchronization;
        this.AI = AI;
        this.userInterface = userInterface;
        this.readyAI = readyAI;
        this.processingSpeedInMS = processingSpeedInMS;
    }

    @Override
    public void run() {
        while (true) {
            try {
                getUserInterface().changeAIStatus("Waiting");
                sleep(1000);

                updateUIValues();
                chooseFighters();
                updateUIValues();

                if (getAI().getBattleOcurring() == null) {
                    System.out.println("No hay peleadores disponibles");
                    sleep(this.getProcessingSpeedInMS());
                    continue;
                }

                Random random = new Random();
                if ( (cyclesCounter % 3 == 0) && (random.nextInt(1, 100) < newCharacterChance) ) {
                    

                    
                        

                    
                }
                getAI().setRound(cyclesCounter);

                cyclesCounter++;

                getSynchronization().release();

                getReadyAI().acquire();

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
            updateCharactersUI(firstFighter, secondFighter);
            Battle battle = new Battle(firstFighter, secondFighter);
            getAI().setBattleOcurring(battle);
        } else {
            updateCharactersUI(firstFighter, secondFighter);
            getAI().setBattleOcurring(null);
        }
        getAI();

    }

    public void updateUIValues() {
        getNickelodeon().updateQueuesUI();
        getCartoonNetwork().updateQueuesUI();

    }

    public void updateCharactersUI(Character firstFighter, Character secondFighter) {
        if (firstFighter != null && secondFighter != null) {
            getUserInterface().changeCharacterStatsByStudio(getNickelodeon().getStudioInt(), firstFighter.getStats(),
                    firstFighter.getID());
            getUserInterface().changeCharacterStatsByStudio(getCartoonNetwork().getStudioInt(),
                    secondFighter.getStats(),
                    secondFighter.getID());

            getUserInterface().changeCharacterImage(getNickelodeon().getStudioInt(), firstFighter.getImage());
            getUserInterface().changeCharacterImage(getCartoonNetwork().getStudioInt(), secondFighter.getImage());
        } else {
            getUserInterface().changeCharacterStatsByStudio(getNickelodeon().getStudioInt(), ZERO_STATS, null);
            getUserInterface().changeCharacterStatsByStudio(getCartoonNetwork().getStudioInt(), ZERO_STATS, null);

            getUserInterface().changeCharacterImage(getNickelodeon().getStudioInt(),
                    "src/Assets/NickImages/logo-de-avatar-la-leyenda-de-aang-avatar.png");
            getUserInterface().changeCharacterImage(getCartoonNetwork().getStudioInt(),
                    "src/Assets/CartoonImages/logo-un-show-mas.png");
        }

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
        return nickelodeon;
    }

    public void setNickelodeon(AnimationStudio Nickelodeon) {
        this.nickelodeon = Nickelodeon;
    }

    public AnimationStudio getCartoonNetwork() {
        return cartoonNetwork;
    }

    public void setCartoonNetwork(AnimationStudio CartoonNetwork) {
        this.cartoonNetwork = CartoonNetwork;
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

    public Semaphore getReadyAI() {
        return readyAI;
    }

    /**
     * @return the workingSpeed
     */
    public int getProcessingSpeedInMS() {
        return processingSpeedInMS;
    }

    /**
     * @param processingSpeedInMS the workingSpeed to set
     */
    public void setProcessingSpeedInMS(int processingSpeedInMS) {
        this.processingSpeedInMS = processingSpeedInMS;
    }
}
