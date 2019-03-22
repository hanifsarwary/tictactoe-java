import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GamePlayScreenView {

    JFrame jFrame;
    JButton  [][] buttonArray;
    JPanel jPanel;
    JLabel jLabel,jLabel1;
    ActionListener actionListener;


    GamePlayScreenView(){


        buttonArray = new JButton[3][3];
        jFrame = new JFrame();
        jFrame.setSize(800,600);
        jPanel = new JPanel();
        jPanel.setSize(200,200);
        jPanel.setLayout(null);
        jPanel.setLocation(310,200);
        jLabel = new JLabel();
        jLabel1 = new JLabel();
        jLabel.setText("Player one:O");
        jLabel.setSize(100,60);
        jLabel.setLocation(60,60);
        jLabel1.setText("Player Two:X");
        jLabel1.setSize(100,60);
        jLabel1.setLocation(600,60);
        int x = 0;
        int y= 0;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                buttonArray[i][j] = new JButton();
                buttonArray[i][j].setBackground(Color.WHITE);

                buttonArray[i][j].setSize(40,40);
                buttonArray[i][j].setLocation(x,y);
                jPanel.add(buttonArray[i][j]);
                x+=40;

                }
                y+=40;
                x=0;
            }
            jPanel.setVisible(true);
            jFrame.add(jPanel);
            jFrame.add(jLabel);
            jFrame.add(jLabel1);
            jFrame.setLayout(null);
            jFrame.setVisible(true);
            jFrame.setDefaultCloseOperation(2);


        }

    }
