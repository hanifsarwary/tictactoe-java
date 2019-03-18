import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuScreen {

    JFrame jFrame;
    JButton playGameButton,exitButton;

    MenuScreen(){
        jFrame=new JFrame("TIC TAC TOE");
        jFrame.setSize(800,600);
        playGameButton = new JButton("Start Game");
        exitButton = new JButton();
        jFrame.setBackground(Color.WHITE);


        playGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jFrame.dispose();
                new GamePlayScreen();
            }
        });

        jFrame.setLayout(null);
        playGameButton.setSize(150,40);
        playGameButton.setLocation(320,100);
        exitButton.setSize(150,40);
        exitButton.setLocation(320,200);
        jFrame.add(playGameButton);
        jFrame.add(exitButton);
        exitButton.setText("Exit Game");


        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

}
