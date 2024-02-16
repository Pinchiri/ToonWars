/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import DataStructures.LinkedList;
import DataStructures.Queue;

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

    public AnimationStudio(int studioInt, String studioName) {
        this.studioInt = studioInt;
        this.studioName = studioName;
        this.characters = new LinkedList<>();
        this.topPriorityQueue = new Queue<>();
        this.secondPriorityQueue = new Queue<>();
        this.thirdPriorityQueue = new Queue<>();
        this.supportQueue = new Queue<>();
    }

    //Getters and Setters
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

}
