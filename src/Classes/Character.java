/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Rolando
 */
public class Character {

    private int id;
    private String name;
    private int priorityLevel;
    private Stats stats;
    private int starvationCounter;

    public Character(int id, String name, int priorityLevel, Stats stats, int starvationCounter) {
        this.id = id;
        this.name = name;
        this.priorityLevel = priorityLevel;
        this.stats = stats;
        this.starvationCounter = starvationCounter;
    }

    public void increaseStarvationCounter() {
        if (!isTopPriority() && getStarvationCounter() < 8) {
            this.starvationCounter++;
        }
    }

    public boolean isTopPriority() {
        return getPriorityLevel() == 1;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public int getStarvationCounter() {
        return starvationCounter;
    }

    public void setStarvationCounter(int starvationCounter) {
        this.starvationCounter = starvationCounter;
    }

}
