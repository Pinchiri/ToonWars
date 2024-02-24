/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author david
 */
public class CharacterCreator {

    private Stats getStats() {
        return StatsCreator.creatStats();
    }

    private Character createCharacter(int studioInt, int nextCharacterInt, String name) {
        String studio = Integer.toString(studioInt);
        String characterInt = Integer.toString(nextCharacterInt);
        String nameNoBlanks = name.replace(" ", "");
        String id = studio + "-" + name + "-" + characterInt;
        Stats stats = this.getStats();
        return new Character(id, name, 1, stats);
    }

    // Nick Characters Create Methods
    public Character createAang(int studioInt, int nextCharacterInt) {
        String name = "Aang";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createOzai(int studioInt, int nextCharacterInt) {
        String name = "Ozai";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createAvatarRoku(int studioInt, int nextCharacterInt) {
        String name = "Avatar Roku";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createAvatarKyoshi(int studioInt, int nextCharacterInt) {
        String name = "Avatar Kyoshi";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createTophBeifong(int studioInt, int nextCharacterInt) {
        String name = "Toph Beifong";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createIroh(int studioInt, int nextCharacterInt) {
        String name = "Iroh";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createZuko(int studioInt, int nextCharacterInt) {
        String name = "Zuko";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createKatara(int studioInt, int nextCharacterInt) {
        String name = "Katara";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createAzula(int studioInt, int nextCharacterInt) {
        String name = "Azula";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createKorra(int studioInt, int nextCharacterInt) {
        String name = "Korra";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createZaheer(int studioInt, int nextCharacterInt) {
        String name = "Zaheer";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createSozin(int studioInt, int nextCharacterInt) {
        String name = "Sozin";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createCombustionMan(int studioInt, int nextCharacterInt) {
        String name = "Combustion Man";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createKuvira(int studioInt, int nextCharacterInt) {
        String name = "Kuvira";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createKingBumi(int studioInt, int nextCharacterInt) {
        String name = "King Bumi";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createJeongJeong(int studioInt, int nextCharacterInt) {
        String name = "Jeong Jeong";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createPakku(int studioInt, int nextCharacterInt) {
        String name = "Pakku";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createGhazan(int studioInt, int nextCharacterInt) {
        String name = "Ghazan";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createSuyinBeifong(int studioInt, int nextCharacterInt) {
        String name = "Suyin Beifong";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createMingHua(int studioInt, int nextCharacterInt) {
        String name = "Ming-Hua";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }
}
