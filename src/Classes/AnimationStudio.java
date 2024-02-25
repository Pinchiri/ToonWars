/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import static Classes.Main.NUMBER_ID;
import DataStructures.LinkedList;
import DataStructures.Queue;
import UserInterface.MainUI;

/**
 *
 * @author Rolando
 */
public class AnimationStudio {

    private int studioInt;
    private String studioName;
    private LinkedList<Character> characters;
    private Queue<Character> topPriorityQueue;
    private Queue<Character> secondPriorityQueue;
    private Queue<Character> thirdPriorityQueue;
    private Queue<Character> supportQueue;
    private MainUI userInterface;
    private int winsQty;

    public AnimationStudio(int studioInt, String studioName, MainUI userInterface) {
        this.studioInt = studioInt;
        this.studioName = studioName;
        this.characters = new LinkedList<>();
        this.topPriorityQueue = new Queue<>();
        this.secondPriorityQueue = new Queue<>();
        this.thirdPriorityQueue = new Queue<>();
        this.supportQueue = new Queue<>();
        this.userInterface = userInterface;
        this.winsQty = 0;
    }

    public Character getNextFighter() {
        if (!topPriorityQueue.isEmpty()) {
            return topPriorityQueue.dispatch();
        } else if (!secondPriorityQueue.isEmpty()) {
            return secondPriorityQueue.dispatch();
        } else if (!thirdPriorityQueue.isEmpty()) {
            return thirdPriorityQueue.dispatch();
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

    public void updateQueuesUI() {
        getUserInterface().changeQueueByPriorityLevelAndStudio(1, getStudioInt(),
                getTopPriorityQueue().printQueue());

        getUserInterface().changeQueueByPriorityLevelAndStudio(2, getStudioInt(),
                getSecondPriorityQueue().printQueue());

        getUserInterface().changeQueueByPriorityLevelAndStudio(3, getStudioInt(),
                getThirdPriorityQueue().printQueue());

        getUserInterface().changeQueueByPriorityLevelAndStudio(4, getStudioInt(),
                getSupportQueue().printQueue());
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
            topPriorityQueue.add(character);
        } else if (character.getPriorityLevel() == 2) {
            secondPriorityQueue.add(character);
        } else if (character.getPriorityLevel() == 3) {
            thirdPriorityQueue.add(character);
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

    public MainUI getUserInterface() {
        return userInterface;
    }

    public int getWinsQty() {
        return winsQty;
    }

    public void setWinsQty(int winsQty) {
        this.winsQty = winsQty;
    }
}
