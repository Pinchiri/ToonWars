/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constants;

import Classes.Stats;

/**
 *
 * @author Rolando
 */
public class Constants {

    // Odds
    public static final int DRAW_RATE = 27;
    public static final int NON_COMBAT_RATE = 33;
    public static final int WIN_RATE = 40;

    public static final int QUALITY_ABILITIES_CHANCE = 60;
    public static final int QUALITY_HP_CHANCE = 70;
    public static final int QUALITY_STRENGTH_CHANCE = 50;
    public static final int QUALITY_AGILITY_CHANCE = 40;

    public static final int OUT_OF_SUPPORT_CHANCE = 40;
    public static final int NEW_CHARACTER_CHANCE = 80;

    // Nickelodeon
    public static final int NICKELODEON_INT = 0;
    public static final String NICKELODEON_STRING = "Nickelodeon";
    public static final String[] NICKELODEON_CHARACTER_NAMES = {
            "Aang",
            "Ozai",
            "Avatar Roku",
            "Avatar Kyoshi",
            "Toph Beifong",
            "Iroh",
            "Zuko",
            "Katara",
            "Korra",
            "Zaheer",
            "Sozin",
            "Combustion Man",
            "Kuvira",
            "King Bumi",
            "Jeong Jeong",
            "Pakku",
            "Ghazan",
            "Suyin Beifong",
            "Ming-Hua",
            "Azula"
    };
    public static final String[] NICKELODEON_CHARACTER_IMAGES = {
            "src/Assets/NickImages/Aang.png",
            "src/Assets/NickImages/Ozai.png",
            "src/Assets/NickImages/AvatarRoku.png",
            "src/Assets/NickImages/AvatarKyoshi.png",
            "src/Assets/NickImages/TophBeifong.png",
            "src/Assets/NickImages/Iroh.png",
            "src/Assets/NickImages/Zuko.png",
            "src/Assets/NickImages/Katara.png",
            "src/Assets/NickImages/Korra.png",
            "src/Assets/NickImages/Zaheer.png",
            "src/Assets/NickImages/Sozin.png",
            "src/Assets/NickImages/CombustionMan.png",
            "src/Assets/NickImages/Kuvira.png",
            "src/Assets/NickImages/KingBumi.png",
            "src/Assets/NickImages/JeongJeong.png",
            "src/Assets/NickImages/Pakku.png",
            "src/Assets/NickImages/Ghazan.png",
            "src/Assets/NickImages/SuyinBeifong.png",
            "src/Assets/NickImages/Ming-Hua.png",
            "src/Assets/NickImages/Azula.png"
    };

    // Cartoon Network
    public static final int CARTOON_NETWORK_INT = 1;
    public static final String CARTOON_NETWORK_STRING = "Cartoon Network";
    public static final String[] CARTOON_NETWORK_CHARACTER_NAMES = {
            "Mordecai",
            "Rigby",
            "Muscle Man",
            "Pops",
            "Skips",
            "Benson",
            "Eileen",
            "Thomas",
            "High Five Ghost",
            "Death",
            "Mr. Maellard",
            "Gary",
            "Techmo",
            "Garrett Bobby Ferguson Jr.",
            "Garrett Bobby Ferguson",
            "Starla",
            "Margaret",
            "CJ",
            "Party Pete",
            "Doug Shablowski"
    };

    public static final String[] CARTOON_NETWORK_CHARACTER_IMAGES = {
            "src/Assets/CartoonImages/Mordecai.png",
            "src/Assets/CartoonImages/Rigby.png",
            "src/Assets/CartoonImages/MuscleMan.png",
            "src/Assets/CartoonImages/Pops.png",
            "src/Assets/CartoonImages/Skips.png",
            "src/Assets/CartoonImages/Benson.png",
            "src/Assets/CartoonImages/Eileen.png",
            "src/Assets/CartoonImages/Thomas.png",
            "src/Assets/CartoonImages/HighFiveGhost.png",
            "src/Assets/CartoonImages/Death.png",
            "src/Assets/CartoonImages/MrMaellard.png",
            "src/Assets/CartoonImages/Gary.png",
            "src/Assets/CartoonImages/Techmo.png",
            "src/Assets/CartoonImages/GarrettBobbyFergusonJr.png",
            "src/Assets/CartoonImages/GarrettBobbyFerguson.png",
            "src/Assets/CartoonImages/Starla.png",
            "src/Assets/CartoonImages/Margaret.png",
            "src/Assets/CartoonImages/CJ.png",
            "src/Assets/CartoonImages/PartyPete.png",
            "src/Assets/CartoonImages/DougShablowski.png"
    };

    // Stats when Null
    public static final Stats ZERO_STATS = new Stats();

}
