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

    private String id;
    private String name;
    private int priorityLevel;
    private Stats stats;
    private int starvationCounter;
    private String image;

    public Character(String id, String name, int priorityLevel, Stats stats) {
        this.id = id;
        this.name = name;
        this.priorityLevel = priorityLevel;
        this.stats = stats;
        this.starvationCounter = 0;
    }
    
    public Character(String id, String name, int priorityLevel, Stats stats, String image) {
        this.id = id;
        this.name = name;
        this.priorityLevel = priorityLevel;
        this.stats = stats;
        this.starvationCounter = 0;
        this.image = image;
    }

    public void increaseStarvationCounter() {
        if (!isTopPriority() && getStarvationCounter() < 8) {
            this.starvationCounter++;
        }
    }

    public boolean isTopPriority() {
        return getPriorityLevel() == 1;
    }
    
    @Override
    public String toString(){
        return 
                "ID: " + this.id +"\n"+
                "Name: " + this.name +"\n"+
                "Priority: " + this.priorityLevel +"\n"+
                "Image: " + this.image +"\n"
                ;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
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
