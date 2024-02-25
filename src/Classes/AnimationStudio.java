/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import static Classes.Main.NUMBER_ID;
import DataStructures.LinkedList;
import DataStructures.Queue;

/**
 *
 * @author Rolando
 */
public class AnimationStudio {

    private int studioInt;
    private String studioName;
    private int characterCounter;   //used to generate charcaters ID
    private LinkedList<Character> characters;
    private Queue<Character> topPriorityQueue;
    private Queue<Character> secondPriorityQueue;
    private Queue<Character> thirdPriorityQueue;
    private Queue<Character> supportQueue;
    private CharacterCreator characterCreator;

    public AnimationStudio(int studioInt, String studioName) {
        this.studioInt = studioInt;
        this.studioName = studioName;
        this.characterCounter = 0;
        this.characters = new LinkedList<>();
        this.topPriorityQueue = new Queue<>();
        this.secondPriorityQueue = new Queue<>();
        this.thirdPriorityQueue = new Queue<>();
        this.supportQueue = new Queue<>();
        this.characterCreator = new CharacterCreator();
        this.createInitialCharacters();
    }

    public Character getNextFighter() {
        if (!topPriorityQueue.isEmpty()) {
            return getTopPriorityQueue().dispatch();
        } else if (!secondPriorityQueue.isEmpty()) {
            return getSecondPriorityQueue().dispatch();
        } else if (!thirdPriorityQueue.isEmpty()) {
            return getThirdPriorityQueue().dispatch();
        } else {
            return null;
        }
    }

    public void increaseStarvationCounters() {
        for (int i = 0; i < getSecondPriorityQueue().getSize() - 1; i++) {
            modifyCharacterPriority(i, 2);
        }

        for (int i = 0; i < getThirdPriorityQueue().getSize() - 1; i++) {
            modifyCharacterPriority(i, 3);
        }

    }

    public void modifyCharacterPriority(int index, int queuePriorityLevel) {
        Queue<Character> queue = getQueueByPriorityLevel(queuePriorityLevel);
        Character character = queue.getElement(index);
        character.increaseStarvationCounter();

        if (character.getStarvationCounter() == 8) {
            character.setPriorityLevel(queuePriorityLevel - 1);
            queue.remove();

            Queue<Character> newQueue = getQueueByPriorityLevel(queuePriorityLevel - 1);
            newQueue.add(character);
        }
    }

    public Queue<Character> getQueueByPriorityLevel(int priorityLevel) {
        switch (priorityLevel) {
            case 1:
                return getTopPriorityQueue();
            case 2:
                return getSecondPriorityQueue();
            case 3:
                return getThirdPriorityQueue();
            default:
                return null;
        }
    }

    public String generateCharacterStringID(int studioInt) {
        String characterID;
        switch (studioInt) {
            case 0:
                characterID = "A" + Integer.toString(NUMBER_ID);
                NUMBER_ID++;
                return characterID;

            case 1:
                characterID = "U" + Integer.toString(NUMBER_ID);
                NUMBER_ID++;
                return characterID;
            default:
                return null;
        }
    }

    public void addCharacter(Character character) {
        // TODO - Refactor to Add random character to the Studio
        if (character.isTopPriority()) {
            getTopPriorityQueue().add(character);
        } else if (character.getPriorityLevel() == 2) {
            getSecondPriorityQueue().add(character);
        } else if (character.getPriorityLevel() == 3) {
            getThirdPriorityQueue().add(character);
        }
    }

    public void createInitialCharacters() {
        switch (this.getStudioInt()) {
            case 0 ->
                this.characters = this.characterCreator.createInitialNickCharacters();
            case 1 ->
                this.characters = this.characterCreator.createInitialCartoonCharacters();
        }
        this.characterCounter = 20;
        for (int i = 0; i < this.characters.getSize(); i++) {
            Character character = this.characters.getElement(i);
            this.addCharacter(character);
        }
        

    }


    // Getters and Setters
    public int getStudioInt() {
        return studioInt;
    }

    public void setStudioInt(int studioInt) {
        this.studioInt = studioInt;
    }

    public String getStudioName() {
        return studioName;
    }

    public void setStudioName(String studioName) {
        this.studioName = studioName;
    }

    public LinkedList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(LinkedList<Character> characters) {
        this.characters = characters;
    }

    public Queue<Character> getTopPriorityQueue() {
        return topPriorityQueue;
    }

    public void setTopPriorityQueue(Queue<Character> topPriorityQueue) {
        this.topPriorityQueue = topPriorityQueue;
    }

    public Queue<Character> getSecondPriorityQueue() {
        return secondPriorityQueue;
    }

    public void setSecondPriorityQueue(Queue<Character> secondPriorityQueue) {
        this.secondPriorityQueue = secondPriorityQueue;
    }

    public Queue<Character> getThirdPriorityQueue() {
        return thirdPriorityQueue;
    }

    public void setThirdPriorityQueue(Queue<Character> thirdPriorityQueue) {
        this.thirdPriorityQueue = thirdPriorityQueue;
    }

    public Queue<Character> getSupportQueue() {
        return supportQueue;
    }

    public void setSupportQueue(Queue<Character> supportQueue) {
        this.supportQueue = supportQueue;
    }

    /**
     * @return the characterCounter
     */
    public int getCharacterCounter() {
        return characterCounter;
    }

    /**
     * @param characterCounter the characterCounter to set
     */
    public void setCharacterCounter(int characterCounter) {
        this.characterCounter = characterCounter;
    }

    /**
     * @return the characterCreator
     */
    public CharacterCreator getCharacterCreator() {
        return characterCreator;
    }

    /**
     * @param characterCreator the characterCreator to set
     */
    public void setCharacterCreator(CharacterCreator characterCreator) {
        this.characterCreator = characterCreator;
    }

}
