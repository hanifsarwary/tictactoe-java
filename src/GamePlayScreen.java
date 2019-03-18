import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GamePlayScreen {

    JFrame jFrame;
    JButton  [][] buttonArray;
    JPanel jPanel;
    JLabel jLabel,jLabel1;
    ActionListener actionListener;
    int buttonIntegerArray [][];
    Boolean cross;

    GamePlayScreen(){
        cross = false;
        buttonIntegerArray = new int[3][3];

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
                buttonIntegerArray[i][j]=0;
                buttonArray[i][j] = new JButton();
                buttonArray[i][j].setBackground(Color.WHITE);

                buttonArray[i][j].setSize(40,40);
                buttonArray[i][j].setLocation(x,y);

                buttonArray[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        JButton jButton = (JButton) actionEvent.getSource();
                        Point point = jButton.getLocation();
                        int col = point.x / 40;
                        int row = point.y / 40;
                        if(!cross){

                            if (buttonIntegerArray[row][col] == 0) {
                            try {



                                    Image image = ImageIO.read(getClass().getResource("circle.jpg"));
                                    image = image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                                    buttonIntegerArray[row][col]=1;

                                    jButton.setIcon(new ImageIcon(image));
                                    cross = true;
                                } catch(IOException e){
                                    e.printStackTrace();
                                }
                            }

                        }
                        else{
                            if(buttonIntegerArray[row][col]==0) {
                                try {

                                    Image image = ImageIO.read(getClass().getResource("cross.jpg"));
                                    image = image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                                    buttonIntegerArray[row][col]=2;

                                    jButton.setIcon(new ImageIcon(image));
                                    cross = false;
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        }

                        if(buttonIntegerArray[0][0]==buttonIntegerArray[0][1]&& buttonIntegerArray[0][1]==buttonIntegerArray[0][2] && (buttonIntegerArray[0][0]==1 ||buttonIntegerArray[0][0]==2)){ //first row
                            Dialog dialog = new Dialog(jFrame,"WINNER");
                            if(buttonIntegerArray[0][0] == 1) {
                                dialog.add(new JLabel("Player One won the match"));
                                dialog.setSize(200,200);
                                dialog.setVisible(true);


                            }
                            else{
                                dialog.add(new JLabel("Player Two won the match"));
                                dialog.setSize(200,200);
                                dialog.setVisible(true);


                            }



                        }
                        else if(buttonIntegerArray[1][0]==buttonIntegerArray[1][1]&& buttonIntegerArray[0][1]==buttonIntegerArray[1][2] && (buttonIntegerArray[1][0]==1 ||buttonIntegerArray[1][0]==2)){
                            Dialog dialog = new Dialog(jFrame,"WINNER");
                            if(buttonIntegerArray[1][0] == 1) {
                                dialog.add(new JLabel("Player One won the match"));
                                dialog.setSize(200,200);
                                dialog.setVisible(true);


                            }
                            else{
                                dialog.add(new JLabel("Player Two won the match"));
                                dialog.setSize(200,200);
                                dialog.setVisible(true);


                            }
                        }

                        else if(buttonIntegerArray[2][0]==buttonIntegerArray[2][1]&& buttonIntegerArray[2][1]==buttonIntegerArray[2][2] && (buttonIntegerArray[2][0]==1 ||buttonIntegerArray[2][0]==2)){
                            Dialog dialog = new Dialog(jFrame,"WINNER");
                            if(buttonIntegerArray[2][0] == 1) {
                                dialog.add(new JLabel("Player One won the match"));
                                dialog.setSize(200,200);
                                dialog.setVisible(true);


                            }
                            else{
                                dialog.add(new JLabel("Player Two won the match"));
                                dialog.setSize(200,200);
                                dialog.setVisible(true);


                            }
                        }
                        else if(buttonIntegerArray[0][0]==buttonIntegerArray[1][0]&& buttonIntegerArray[1][0]==buttonIntegerArray[2][0] && (buttonIntegerArray[0][0]==1 ||buttonIntegerArray[0][0]==2)){//first column
                            Dialog dialog = new Dialog(jFrame,"WINNER");
                            if(buttonIntegerArray[0][0] == 1) {
                                dialog.add(new JLabel("Player One won the match"));
                                dialog.setSize(200,200);
                                dialog.setVisible(true);


                            }
                            else{
                                dialog.add(new JLabel("Player Two won the match"));
                                dialog.setSize(200,200);
                                dialog.setVisible(true);


                            }
                        }

                        else if(buttonIntegerArray[0][1]==buttonIntegerArray[1][1]&& buttonIntegerArray[1][1]==buttonIntegerArray[2][1] && (buttonIntegerArray[0][1]==1 ||buttonIntegerArray[0][1]==2)){//second column
                            Dialog dialog = new Dialog(jFrame,"WINNER");
                            if(buttonIntegerArray[0][1] == 1) {
                                dialog.add(new JLabel("Player One won the match"));
                                dialog.setSize(200,200);
                                dialog.setVisible(true);


                            }
                            else{
                                dialog.add(new JLabel("Player Two won the match"));
                                dialog.setSize(200,200);
                                dialog.setVisible(true);


                            }
                        }

                        else if(buttonIntegerArray[0][2]==buttonIntegerArray[1][2]&& buttonIntegerArray[1][2]==buttonIntegerArray[2][2] && (buttonIntegerArray[0][2]==1 ||buttonIntegerArray[0][2]==2)){//third
                            Dialog dialog = new Dialog(jFrame,"WINNER");
                            if(buttonIntegerArray[0][2] == 1) {
                                dialog.add(new JLabel("Player One won the match"));
                                dialog.setSize(200,200);
                                dialog.setVisible(true);


                            }
                            else{
                                dialog.add(new JLabel("Player Two won the match"));
                                dialog.setSize(200,200);
                                dialog.setVisible(true);


                            }
                        }

                        else if(buttonIntegerArray[0][0]==buttonIntegerArray[1][1]&& buttonIntegerArray[1][1]==buttonIntegerArray[2][2] && (buttonIntegerArray[0][0]==1 ||buttonIntegerArray[0][0]==2)){//first diagonal
                            Dialog dialog = new Dialog(jFrame,"WINNER");
                            if(buttonIntegerArray[0][0] == 1) {
                                dialog.add(new JLabel("Player One won the match"));
                                dialog.setSize(200,200);
                                dialog.setVisible(true);


                            }
                            else{
                                dialog.add(new JLabel("Player Two won the match"));
                                dialog.setSize(200,200);
                                dialog.setVisible(true);


                            }
                        }

                        else if(buttonIntegerArray[0][2]==buttonIntegerArray[1][1]&& buttonIntegerArray[1][1]==buttonIntegerArray[2][0] && (buttonIntegerArray[0][2]==1 ||buttonIntegerArray[0][2]==2)){//second diagonal
                            Dialog dialog = new Dialog(jFrame,"WINNER");
                            if(buttonIntegerArray[0][2] == 1) {
                                dialog.add(new JLabel("Player One won the match"));
                                dialog.setSize(200,200);
                                dialog.setVisible(true);


                            }
                            else{
                                dialog.add(new JLabel("Player Two won the match"));
                                dialog.setSize(200,200);
                                dialog.setVisible(true);


                            }
                        }




                    }
                });
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
