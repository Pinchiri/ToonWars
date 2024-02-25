/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Constants.Constants;
import static Constants.Constants.QUALITY_ABILITIES_CHANCE;
import static Constants.Constants.QUALITY_AGILITY_CHANCE;
import static Constants.Constants.QUALITY_HP_CHANCE;
import static Constants.Constants.QUALITY_STRENGTH_CHANCE;
import Utils.Functions;

/**
 *
 * @author david
 */
public class CharacterCreator {

    private Stats getStats() {
        return StatsCreator.createStats();
    }
    
    // We could use Weigthed Factors
    private int calculatePriority(){
        
        int skillsQuality = Functions.checkSuccess(QUALITY_ABILITIES_CHANCE);
        int hpQuality = Functions.checkSuccess(QUALITY_HP_CHANCE);
        int strengthQuality = Functions.checkSuccess(QUALITY_STRENGTH_CHANCE);
        int agilityQuality = Functions.checkSuccess(QUALITY_AGILITY_CHANCE);
        
        int overall = skillsQuality + hpQuality + strengthQuality + agilityQuality;
        int[] priorities = {3,3,2,2,1};
        int characterPriority = priorities[overall];
        
        return characterPriority;
    }

    private Character createCharacter(int studioInt, int nextCharacterInt, String name) {
        String studio = Integer.toString(studioInt);
        String characterInt = Integer.toString(nextCharacterInt);
        String nameNoBlanks = name.replace(" ", "");
        String id = studio + "-" + nameNoBlanks + "-" + characterInt;
        Stats stats = this.getStats();
        int priority = this.calculatePriority();
        return new Character(id, name, priority, stats);
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
    
    //Cartoon Characters Create Methods
     public Character createMordecai(int studioInt, int nextCharacterInt){
        String name = "Mordecai";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createRigby(int studioInt, int nextCharacterInt){
        String name = "Rigby";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createMuscleMan(int studioInt, int nextCharacterInt){
        String name = "Muscle Man";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createPops(int studioInt, int nextCharacterInt){
        String name = "Pops";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createSkips(int studioInt, int nextCharacterInt){
        String name = "Skips";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createBenson(int studioInt, int nextCharacterInt){
        String name = "Benson";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createEileen(int studioInt, int nextCharacterInt){
        String name = "Eileen";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createThomas(int studioInt, int nextCharacterInt){
        String name = "Thomas";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createHighFiveGhost(int studioInt, int nextCharacterInt){
        String name = "High Five Ghost";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createDeath(int studioInt, int nextCharacterInt){
        String name = "Death";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createMrMaellard(int studioInt, int nextCharacterInt){
        String name = "Mr. Maellard";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createGary(int studioInt, int nextCharacterInt){
        String name = "Gary";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createTechmo(int studioInt, int nextCharacterInt){
        String name = "Techmo";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createGarrettBobbyFergusonJr(int studioInt, int nextCharacterInt){
        String name = "Garrett Bobby Ferguson Jr.";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createGarrettBobbyFerguson(int studioInt, int nextCharacterInt){
        String name = "Garrett Bobby Ferguson";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createStarla(int studioInt, int nextCharacterInt){
        String name = "Starla";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createMargaret(int studioInt, int nextCharacterInt){
        String name = "Margaret";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createCJ(int studioInt, int nextCharacterInt){
        String name = "CJ";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createPartyPete(int studioInt, int nextCharacterInt){
        String name = "Party Pete";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }

    public Character createDougShablowski(int studioInt, int nextCharacterInt){
        String name = "Doug Shablowski";
        return this.createCharacter(studioInt, nextCharacterInt, name);
    }
}
