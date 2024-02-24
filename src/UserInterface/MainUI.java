/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface;

import Classes.Administrator;
import Classes.ArtificialIntelligence;
import Classes.Stats;
import java.awt.Image;
import java.util.concurrent.Semaphore;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Rolando
 */
public class MainUI extends javax.swing.JFrame {

    private ArtificialIntelligence AI;
    private Administrator admin;

    /**
     * Creates new form MainUI
     */
    public MainUI() {
        super("ToonWars");
        initComponents();
        setLocationRelativeTo(null);

        changeCharacterImage(0, "src/Assets/NickImages/logo-de-avatar-la-leyenda-de-aang-avatar.png");
        changeCharacterImage(1, "src/Assets/CartoonImages/logo-un-show-mas.png");

        Semaphore sync = new Semaphore(0);
        Semaphore readyAI = new Semaphore(0);

        setAI(new ArtificialIntelligence(sync, readyAI, 1000, this));
        setAdmin(new Administrator(sync, readyAI, getAI(), this));

        getAdmin().start();
        getAI().start();

    }

    public void changeQueueByPriorityLevelAndStudio(int priorityLevel, int studioInt, String queueString) {
        switch (priorityLevel) {
            case 1 -> {
                changeTopPriorityQueueByStudio(studioInt, queueString);
            }
            case 2 -> {
                changeSecondPriorityQueueByStudio(studioInt, queueString);
            }
            case 3 -> {
                changeThirdPriorityQueueByStudio(studioInt, queueString);
            }
            case 4 -> {
                changeSupportPriorityQueueByStudio(studioInt, queueString);
            }
            default -> {
            }
        }
    }

    public void changeTopPriorityQueueByStudio(int studioInt, String queueString) {
        switch (studioInt) {
            case 0 -> {
                topQueueNick.setText(queueString);
            }
            case 1 -> {
                topQueueCartoon.setText(queueString);
            }
            default -> {
            }
        }
    }

    public void changeSecondPriorityQueueByStudio(int studioInt, String queueString) {
        switch (studioInt) {
            case 0 -> {
                secondQueueNick.setText(queueString);
            }
            case 1 -> {
                secondQueueCartoon.setText(queueString);
            }
            default -> {
            }
        }
    }

    public void changeThirdPriorityQueueByStudio(int studioInt, String queueString) {
        switch (studioInt) {
            case 0 -> {
                thirdQueueNick.setText(queueString);
            }
            case 1 -> {
                thirdQueueCartoon.setText(queueString);
            }
            default -> {
            }
        }
    }

    public void changeSupportPriorityQueueByStudio(int studioInt, String queueString) {
        switch (studioInt) {
            case 0 -> {
                supportQueueNick.setText(queueString);
            }
            case 1 -> {
                supportQueueCartoon.setText(queueString);
            }
            default -> {
            }
        }
    }

    public void changeCharacterStatsByStudio(int studioInt, Stats characterStats, String characterID) {
        switch (studioInt) {
            case 0 -> {
                characterIDNick.setText(characterID);
                chracterHPNick.setText(Integer.toString(characterStats.getHP()));
                chracterSTNick.setText(Integer.toString(characterStats.getStrength()));
                chracterAGNick.setText(Integer.toString(characterStats.getAgility()));
                chracterSPNick.setText(Integer.toString(characterStats.getSpeed()));
                chracterMGNick.setText(Integer.toString(characterStats.getMagic()));
                chracterMPNick.setText(Integer.toString(characterStats.getManaPoints()));

            }
            case 1 -> {
                characterIDCartoon.setText(characterID);
                chracterHPCartoon.setText(Integer.toString(characterStats.getHP()));
                chracterSTCartoon.setText(Integer.toString(characterStats.getStrength()));
                chracterAGCartoon.setText(Integer.toString(characterStats.getAgility()));
                chracterSPCartoon.setText(Integer.toString(characterStats.getSpeed()));
                chracterMGCartoon.setText(Integer.toString(characterStats.getMagic()));
                chracterMPCartoon.setText(Integer.toString(characterStats.getManaPoints()));
            }
            default -> {
            }
        }
    }

    public void changeAIStatus(String status) {
        statusAI.setText(status);
    }

    public void changeCharacterImage(int studioInt, String characterImagePath) {
        ImageIcon characterResizedImage = resizeIcon(new ImageIcon(characterImagePath),
                getCharacterImageByStudio(studioInt).getWidth(),
                getCharacterImageByStudio(studioInt).getHeight());

        getCharacterImageByStudio(studioInt).setIcon(characterResizedImage);

    }

    private ImageIcon resizeIcon(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image resizedImage = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }

    private JLabel getCharacterImageByStudio(int studioInt) {
        return switch (studioInt) {
            case 0 ->
                characterImgNick;
            case 1 ->
                characterImgCartoon;
            default ->
                null;
        };
    }

    public ArtificialIntelligence getAI() {
        return AI;
    }

    public void setAI(ArtificialIntelligence AI) {
        this.AI = AI;
    }

    public Administrator getAdmin() {
        return admin;
    }

    public void setAdmin(Administrator admin) {
        this.admin = admin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        generalPanel = new javax.swing.JPanel();
        cartoonNetworkPanel = new javax.swing.JPanel();
        cartoonNetworkPanel_title = new javax.swing.JLabel();
        networkPanel_title = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        chracterSPCartoon = new javax.swing.JLabel();
        chracterAGCartoon_Label = new javax.swing.JLabel();
        chracterMPCartoon_Label = new javax.swing.JLabel();
        characterIDCartoon = new javax.swing.JLabel();
        chracterMPCartoon = new javax.swing.JLabel();
        characterIDCartoon_Label = new javax.swing.JLabel();
        chracterSPCartoon_Label = new javax.swing.JLabel();
        chracterHPCartoon = new javax.swing.JLabel();
        chracterHPCartoon_Label = new javax.swing.JLabel();
        chracterMGCartoon = new javax.swing.JLabel();
        chracterSTCartoon = new javax.swing.JLabel();
        chracterSTCartoon_Label = new javax.swing.JLabel();
        characterImgCartoon = new javax.swing.JLabel();
        chracterAGCartoon = new javax.swing.JLabel();
        chracterMGCartoon_Label = new javax.swing.JLabel();
        secondQueueCartoon_label = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        secondQueueCartoon = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        topQueueCartoon = new javax.swing.JTextArea();
        topQueueCartoon_label = new javax.swing.JLabel();
        supportQueueCartoon_label = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        thirdQueueCartoon = new javax.swing.JTextArea();
        thirdQueueCartoon_label = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        supportQueueCartoon = new javax.swing.JTextArea();
        statusAI = new javax.swing.JLabel();
        AI_label = new javax.swing.JLabel();
        nickelodeonPanel = new javax.swing.JPanel();
        secondQueueNick_label = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        characterIDNick_Label = new javax.swing.JLabel();
        characterIDNick = new javax.swing.JLabel();
        characterImgNick = new javax.swing.JLabel();
        chracterHPNick_Label = new javax.swing.JLabel();
        chracterHPNick = new javax.swing.JLabel();
        chracterAGNick = new javax.swing.JLabel();
        chracterAGNick_Label = new javax.swing.JLabel();
        chracterSTNick = new javax.swing.JLabel();
        chracterSTNick_Label = new javax.swing.JLabel();
        chracterSPNick = new javax.swing.JLabel();
        chracterSPNick_Label = new javax.swing.JLabel();
        chracterMGNick = new javax.swing.JLabel();
        chracterMGNick_Label = new javax.swing.JLabel();
        chracterMPNick_Label = new javax.swing.JLabel();
        chracterMPNick = new javax.swing.JLabel();
        nickelodeonPanel_title = new javax.swing.JLabel();
        topQueueNick_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        secondQueueNick = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        topQueueNick = new javax.swing.JTextArea();
        thirdQueueNick_label = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        thirdQueueNick = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        supportQueueNick = new javax.swing.JTextArea();
        supportQueueNick_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        generalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cartoonNetworkPanel.setBackground(new java.awt.Color(255, 255, 255));
        cartoonNetworkPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cartoonNetworkPanel_title.setBackground(new java.awt.Color(0, 0, 0));
        cartoonNetworkPanel_title.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        cartoonNetworkPanel_title.setForeground(new java.awt.Color(51, 51, 51));
        cartoonNetworkPanel_title.setText("CARTOON");
        cartoonNetworkPanel.add(cartoonNetworkPanel_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 200, 60));

        networkPanel_title.setBackground(new java.awt.Color(51, 51, 51));
        networkPanel_title.setForeground(new java.awt.Color(255, 255, 255));
        networkPanel_title.setText("NETWORK");
        networkPanel_title.setFocusable(false);
        networkPanel_title.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        cartoonNetworkPanel.add(networkPanel_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 210, 60));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chracterSPCartoon.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterSPCartoon.setForeground(java.awt.Color.white);
        chracterSPCartoon.setText("0");
        jPanel2.add(chracterSPCartoon, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 54, 23));

        chracterAGCartoon_Label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterAGCartoon_Label.setForeground(java.awt.Color.white);
        chracterAGCartoon_Label.setText("AG:");
        jPanel2.add(chracterAGCartoon_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 29, -1));

        chracterMPCartoon_Label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterMPCartoon_Label.setForeground(java.awt.Color.white);
        chracterMPCartoon_Label.setText("MP:");
        jPanel2.add(chracterMPCartoon_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        characterIDCartoon.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        characterIDCartoon.setForeground(java.awt.Color.white);
        characterIDCartoon.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(characterIDCartoon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 143, 23));

        chracterMPCartoon.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterMPCartoon.setForeground(java.awt.Color.white);
        chracterMPCartoon.setText("0");
        jPanel2.add(chracterMPCartoon, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 54, 23));

        characterIDCartoon_Label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        characterIDCartoon_Label.setForeground(java.awt.Color.white);
        characterIDCartoon_Label.setText("ID:");
        jPanel2.add(characterIDCartoon_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 41, -1));

        chracterSPCartoon_Label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterSPCartoon_Label.setForeground(java.awt.Color.white);
        chracterSPCartoon_Label.setText("SP:");
        jPanel2.add(chracterSPCartoon_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 29, -1));

        chracterHPCartoon.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterHPCartoon.setForeground(java.awt.Color.white);
        chracterHPCartoon.setText("0");
        jPanel2.add(chracterHPCartoon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 54, 23));

        chracterHPCartoon_Label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterHPCartoon_Label.setForeground(java.awt.Color.white);
        chracterHPCartoon_Label.setText("HP:");
        jPanel2.add(chracterHPCartoon_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 29, -1));

        chracterMGCartoon.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterMGCartoon.setForeground(java.awt.Color.white);
        chracterMGCartoon.setText("0");
        jPanel2.add(chracterMGCartoon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 54, 23));

        chracterSTCartoon.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterSTCartoon.setForeground(java.awt.Color.white);
        chracterSTCartoon.setText("0");
        jPanel2.add(chracterSTCartoon, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 54, 23));

        chracterSTCartoon_Label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterSTCartoon_Label.setForeground(java.awt.Color.white);
        chracterSTCartoon_Label.setText("ST:");
        jPanel2.add(chracterSTCartoon_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 29, -1));

        characterImgCartoon.setForeground(java.awt.Color.white);
        characterImgCartoon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/CartoonImages/logo-un-show-mas.png"))); // NOI18N
        characterImgCartoon.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(characterImgCartoon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 200, 220));

        chracterAGCartoon.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterAGCartoon.setForeground(java.awt.Color.white);
        chracterAGCartoon.setText("0");
        jPanel2.add(chracterAGCartoon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 54, 23));

        chracterMGCartoon_Label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterMGCartoon_Label.setForeground(java.awt.Color.white);
        chracterMGCartoon_Label.setText("MG:");
        jPanel2.add(chracterMGCartoon_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 35, -1));

        cartoonNetworkPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 230, 360));

        secondQueueCartoon_label.setBackground(new java.awt.Color(0, 0, 0));
        secondQueueCartoon_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        secondQueueCartoon_label.setForeground(new java.awt.Color(51, 51, 51));
        secondQueueCartoon_label.setText("Second Priority:");
        cartoonNetworkPanel.add(secondQueueCartoon_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 130, 30));

        secondQueueCartoon.setBackground(new java.awt.Color(255, 255, 255));
        secondQueueCartoon.setColumns(20);
        secondQueueCartoon.setRows(5);
        secondQueueCartoon.setBorder(null);
        jScrollPane6.setViewportView(secondQueueCartoon);

        cartoonNetworkPanel.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 260, 80));

        topQueueCartoon.setBackground(new java.awt.Color(255, 255, 255));
        topQueueCartoon.setColumns(20);
        topQueueCartoon.setRows(5);
        topQueueCartoon.setBorder(null);
        jScrollPane5.setViewportView(topQueueCartoon);

        cartoonNetworkPanel.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 260, 80));

        topQueueCartoon_label.setBackground(new java.awt.Color(0, 0, 0));
        topQueueCartoon_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        topQueueCartoon_label.setForeground(new java.awt.Color(51, 51, 51));
        topQueueCartoon_label.setText("Top Priority:");
        cartoonNetworkPanel.add(topQueueCartoon_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 110, 30));

        supportQueueCartoon_label.setBackground(new java.awt.Color(0, 0, 0));
        supportQueueCartoon_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        supportQueueCartoon_label.setForeground(new java.awt.Color(51, 51, 51));
        supportQueueCartoon_label.setText("Supports:");
        cartoonNetworkPanel.add(supportQueueCartoon_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, 80, 30));

        thirdQueueCartoon.setBackground(new java.awt.Color(255, 255, 255));
        thirdQueueCartoon.setColumns(20);
        thirdQueueCartoon.setRows(5);
        thirdQueueCartoon.setBorder(null);
        jScrollPane7.setViewportView(thirdQueueCartoon);

        cartoonNetworkPanel.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 260, 80));

        thirdQueueCartoon_label.setBackground(new java.awt.Color(0, 0, 0));
        thirdQueueCartoon_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        thirdQueueCartoon_label.setForeground(new java.awt.Color(51, 51, 51));
        thirdQueueCartoon_label.setText("Third Priority:");
        cartoonNetworkPanel.add(thirdQueueCartoon_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 110, 30));

        supportQueueCartoon.setBackground(new java.awt.Color(255, 255, 255));
        supportQueueCartoon.setColumns(20);
        supportQueueCartoon.setRows(5);
        supportQueueCartoon.setBorder(null);
        jScrollPane8.setViewportView(supportQueueCartoon);

        cartoonNetworkPanel.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, 260, 80));

        statusAI.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        statusAI.setForeground(new java.awt.Color(51, 51, 51));
        statusAI.setText("Waiting");
        cartoonNetworkPanel.add(statusAI, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 190, 30));

        AI_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        AI_label.setForeground(new java.awt.Color(51, 51, 51));
        AI_label.setText("AI:");
        cartoonNetworkPanel.add(AI_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 40, 30));

        generalPanel.add(cartoonNetworkPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 600, 640));

        nickelodeonPanel.setBackground(new java.awt.Color(255, 153, 0));
        nickelodeonPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        secondQueueNick_label.setBackground(new java.awt.Color(0, 0, 0));
        secondQueueNick_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        secondQueueNick_label.setForeground(new java.awt.Color(255, 255, 255));
        secondQueueNick_label.setText("Second Priority:");
        nickelodeonPanel.add(secondQueueNick_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 110, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        characterIDNick_Label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        characterIDNick_Label.setForeground(new java.awt.Color(255, 153, 0));
        characterIDNick_Label.setText("ID:");
        jPanel1.add(characterIDNick_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 6, 41, -1));

        characterIDNick.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        characterIDNick.setForeground(new java.awt.Color(255, 153, 0));
        characterIDNick.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        jPanel1.add(characterIDNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 6, 143, 23));

        characterImgNick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NickImages/logo-de-avatar-la-leyenda-de-aang-avatar.png"))); // NOI18N
        characterImgNick.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        jPanel1.add(characterImgNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 47, 200, 220));

        chracterHPNick_Label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterHPNick_Label.setForeground(new java.awt.Color(255, 153, 0));
        chracterHPNick_Label.setText("HP:");
        jPanel1.add(chracterHPNick_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 273, 29, -1));

        chracterHPNick.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterHPNick.setForeground(new java.awt.Color(255, 153, 0));
        chracterHPNick.setText("0");
        jPanel1.add(chracterHPNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 273, 54, 23));

        chracterAGNick.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterAGNick.setForeground(new java.awt.Color(255, 153, 0));
        chracterAGNick.setText("0");
        jPanel1.add(chracterAGNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 302, 54, 23));

        chracterAGNick_Label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterAGNick_Label.setForeground(new java.awt.Color(255, 153, 0));
        chracterAGNick_Label.setText("AG:");
        jPanel1.add(chracterAGNick_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 302, 29, -1));

        chracterSTNick.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterSTNick.setForeground(new java.awt.Color(255, 153, 0));
        chracterSTNick.setText("0");
        jPanel1.add(chracterSTNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 273, 54, 23));

        chracterSTNick_Label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterSTNick_Label.setForeground(new java.awt.Color(255, 153, 0));
        chracterSTNick_Label.setText("ST:");
        jPanel1.add(chracterSTNick_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 273, 29, -1));

        chracterSPNick.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterSPNick.setForeground(new java.awt.Color(255, 153, 0));
        chracterSPNick.setText("0");
        jPanel1.add(chracterSPNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 302, 54, 23));

        chracterSPNick_Label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterSPNick_Label.setForeground(new java.awt.Color(255, 153, 0));
        chracterSPNick_Label.setText("SP:");
        jPanel1.add(chracterSPNick_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 302, 29, -1));

        chracterMGNick.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterMGNick.setForeground(new java.awt.Color(255, 153, 0));
        chracterMGNick.setText("0");
        jPanel1.add(chracterMGNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 331, 54, 23));

        chracterMGNick_Label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterMGNick_Label.setForeground(new java.awt.Color(255, 153, 0));
        chracterMGNick_Label.setText("MG:");
        jPanel1.add(chracterMGNick_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 331, 35, -1));

        chracterMPNick_Label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterMPNick_Label.setForeground(new java.awt.Color(255, 153, 0));
        chracterMPNick_Label.setText("MP:");
        jPanel1.add(chracterMPNick_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 331, 29, -1));

        chracterMPNick.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        chracterMPNick.setForeground(new java.awt.Color(255, 153, 0));
        chracterMPNick.setText("0");
        jPanel1.add(chracterMPNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 331, 54, 23));

        nickelodeonPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 230, 360));

        nickelodeonPanel_title.setBackground(new java.awt.Color(0, 0, 0));
        nickelodeonPanel_title.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        nickelodeonPanel_title.setForeground(new java.awt.Color(255, 255, 255));
        nickelodeonPanel_title.setText("NICKELODEON");
        nickelodeonPanel.add(nickelodeonPanel_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 280, 60));

        topQueueNick_label.setBackground(new java.awt.Color(0, 0, 0));
        topQueueNick_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        topQueueNick_label.setForeground(new java.awt.Color(255, 255, 255));
        topQueueNick_label.setText("Top Priority:");
        nickelodeonPanel.add(topQueueNick_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, 30));

        secondQueueNick.setBackground(new java.awt.Color(255, 255, 255));
        secondQueueNick.setColumns(20);
        secondQueueNick.setRows(5);
        secondQueueNick.setBorder(null);
        jScrollPane1.setViewportView(secondQueueNick);

        nickelodeonPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 260, 80));

        topQueueNick.setBackground(new java.awt.Color(255, 255, 255));
        topQueueNick.setColumns(20);
        topQueueNick.setRows(5);
        topQueueNick.setBorder(null);
        jScrollPane2.setViewportView(topQueueNick);

        nickelodeonPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 260, 80));

        thirdQueueNick_label.setBackground(new java.awt.Color(0, 0, 0));
        thirdQueueNick_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        thirdQueueNick_label.setForeground(new java.awt.Color(255, 255, 255));
        thirdQueueNick_label.setText("Third Priority:");
        nickelodeonPanel.add(thirdQueueNick_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 110, 30));

        thirdQueueNick.setBackground(new java.awt.Color(255, 255, 255));
        thirdQueueNick.setColumns(20);
        thirdQueueNick.setRows(5);
        thirdQueueNick.setBorder(null);
        jScrollPane3.setViewportView(thirdQueueNick);

        nickelodeonPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 260, 80));

        supportQueueNick.setBackground(new java.awt.Color(255, 255, 255));
        supportQueueNick.setColumns(20);
        supportQueueNick.setRows(5);
        supportQueueNick.setBorder(null);
        jScrollPane4.setViewportView(supportQueueNick);

        nickelodeonPanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 260, 80));

        supportQueueNick_label.setBackground(new java.awt.Color(0, 0, 0));
        supportQueueNick_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        supportQueueNick_label.setForeground(new java.awt.Color(255, 255, 255));
        supportQueueNick_label.setText("Supports:");
        nickelodeonPanel.add(supportQueueNick_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 110, 30));

        generalPanel.add(nickelodeonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 640));

        getContentPane().add(generalPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AI_label;
    private javax.swing.JPanel cartoonNetworkPanel;
    private javax.swing.JLabel cartoonNetworkPanel_title;
    private javax.swing.JLabel characterIDCartoon;
    private javax.swing.JLabel characterIDCartoon_Label;
    private javax.swing.JLabel characterIDNick;
    private javax.swing.JLabel characterIDNick_Label;
    private javax.swing.JLabel characterImgCartoon;
    private javax.swing.JLabel characterImgNick;
    private javax.swing.JLabel chracterAGCartoon;
    private javax.swing.JLabel chracterAGCartoon_Label;
    private javax.swing.JLabel chracterAGNick;
    private javax.swing.JLabel chracterAGNick_Label;
    private javax.swing.JLabel chracterHPCartoon;
    private javax.swing.JLabel chracterHPCartoon_Label;
    private javax.swing.JLabel chracterHPNick;
    private javax.swing.JLabel chracterHPNick_Label;
    private javax.swing.JLabel chracterMGCartoon;
    private javax.swing.JLabel chracterMGCartoon_Label;
    private javax.swing.JLabel chracterMGNick;
    private javax.swing.JLabel chracterMGNick_Label;
    private javax.swing.JLabel chracterMPCartoon;
    private javax.swing.JLabel chracterMPCartoon_Label;
    private javax.swing.JLabel chracterMPNick;
    private javax.swing.JLabel chracterMPNick_Label;
    private javax.swing.JLabel chracterSPCartoon;
    private javax.swing.JLabel chracterSPCartoon_Label;
    private javax.swing.JLabel chracterSPNick;
    private javax.swing.JLabel chracterSPNick_Label;
    private javax.swing.JLabel chracterSTCartoon;
    private javax.swing.JLabel chracterSTCartoon_Label;
    private javax.swing.JLabel chracterSTNick;
    private javax.swing.JLabel chracterSTNick_Label;
    private javax.swing.JPanel generalPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JFormattedTextField networkPanel_title;
    private javax.swing.JPanel nickelodeonPanel;
    private javax.swing.JLabel nickelodeonPanel_title;
    private javax.swing.JTextArea secondQueueCartoon;
    private javax.swing.JLabel secondQueueCartoon_label;
    private javax.swing.JTextArea secondQueueNick;
    private javax.swing.JLabel secondQueueNick_label;
    private javax.swing.JLabel statusAI;
    private javax.swing.JTextArea supportQueueCartoon;
    private javax.swing.JLabel supportQueueCartoon_label;
    private javax.swing.JTextArea supportQueueNick;
    private javax.swing.JLabel supportQueueNick_label;
    private javax.swing.JTextArea thirdQueueCartoon;
    private javax.swing.JLabel thirdQueueCartoon_label;
    private javax.swing.JTextArea thirdQueueNick;
    private javax.swing.JLabel thirdQueueNick_label;
    private javax.swing.JTextArea topQueueCartoon;
    private javax.swing.JLabel topQueueCartoon_label;
    private javax.swing.JTextArea topQueueNick;
    private javax.swing.JLabel topQueueNick_label;
    // End of variables declaration//GEN-END:variables
}
