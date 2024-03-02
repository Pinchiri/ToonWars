/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author david
 */
public class BattleType {

    private int type; // 0: Normal Battle, 1:Resistance battle, 2: Agility Battle
    private float[] weights; // weights[0]:HP  weights[1]:strength weights[2]:agility weights[3]:speed weights[4]:magic weights[5]:manaPoints

    public BattleType(int type) {
        this.type = type;
        this.weights = this.chooseWeightsByType();
    }

    private float[] chooseWeightsByType() {
        float[] typeBattleArray = {1, 1, 1, 1, 1, 1};
        switch (this.type) {
            case 0 -> {
                float[] normalBattleArray = {16.67f, 16.67f, 16.67f, 16.67f, 16.67f, 16.67f};
                typeBattleArray = normalBattleArray;
            }
            case 1 -> {
                float[] resistanceBattleArray = {25f, 25f, 10f, 10f, 10f, 20f};
                typeBattleArray = resistanceBattleArray;
            }
            case 2 -> {
                float[] agilityBattleArray = {10f, 10f, 25f, 25f, 20f, 10f};
                typeBattleArray = agilityBattleArray;
            }
        }
        return typeBattleArray;

    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the weights
     */
    public float[] getWeights() {
        return weights;
    }

    /**
     * @param weights the weights to set
     */
    public void setWeights(float[] weights) {
        this.weights = weights;
    }

}
