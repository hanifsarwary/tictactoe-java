import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GamePlayContoller implements ActionListener {
    GamePlayModel gamePlayModel;
    GamePlayScreenView gamePlayScreenView;

    public GamePlayContoller(GamePlayModel model,GamePlayScreenView view){
        this.gamePlayModel = model;
        this.gamePlayScreenView = view;
        for (int i =0;i<3;i++){
            for (int j=0;j<3;j++){
                gamePlayScreenView.buttonArray[i][j].addActionListener(this::actionPerformed);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton jButton = (JButton) actionEvent.getSource();
        Point point = jButton.getLocation();
        int col = point.x / 40;
        int row = point.y / 40;
        if(!gamePlayModel.cross){

            if (gamePlayModel.buttonIntegerArray[row][col] == 0) {
                try {

                    Image image = ImageIO.read(getClass().getResource("circle.jpg"));
                    image = image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                    gamePlayModel.buttonIntegerArray[row][col]=1;

                    jButton.setIcon(new ImageIcon(image));
                    gamePlayModel.cross = true;
                } catch(IOException e){
                    e.printStackTrace();
                }
            }

        }
        else{
            if(gamePlayModel.buttonIntegerArray[row][col]==0) {
                try {

                    Image image = ImageIO.read(getClass().getResource("cross.jpg"));
                    image = image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                    gamePlayModel.buttonIntegerArray[row][col]=2;

                    jButton.setIcon(new ImageIcon(image));
                    gamePlayModel.cross = false;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        if(gamePlayModel.buttonIntegerArray[0][0]==gamePlayModel.buttonIntegerArray[0][1]&& gamePlayModel.buttonIntegerArray[0][1]==gamePlayModel.buttonIntegerArray[0][2] && (gamePlayModel.buttonIntegerArray[0][0]==1 ||
                gamePlayModel.buttonIntegerArray[0][0]==2)){ //first row
            Dialog dialog = new Dialog(gamePlayScreenView.jFrame,"WINNER");
            if(gamePlayModel.buttonIntegerArray[0][0] == 1) {
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
        else if(gamePlayModel.buttonIntegerArray[1][0]==gamePlayModel.buttonIntegerArray[1][1]&& gamePlayModel.buttonIntegerArray[0][1]==gamePlayModel.buttonIntegerArray[1][2] &&
                (gamePlayModel.buttonIntegerArray[1][0]==1 ||gamePlayModel.buttonIntegerArray[1][0]==2)){
            Dialog dialog = new Dialog(gamePlayScreenView.jFrame,"WINNER");
            if(gamePlayModel.buttonIntegerArray[1][0] == 1) {
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

        else if(gamePlayModel.buttonIntegerArray[2][0]==gamePlayModel.buttonIntegerArray[2][1]&& gamePlayModel.buttonIntegerArray[2][1]==gamePlayModel.buttonIntegerArray[2][2] &&
                (gamePlayModel.buttonIntegerArray[2][0]==1 ||gamePlayModel.buttonIntegerArray[2][0]==2)){
            Dialog dialog = new Dialog(gamePlayScreenView.jFrame,"WINNER");
            if(gamePlayModel.buttonIntegerArray[2][0] == 1) {
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
        else if(gamePlayModel.buttonIntegerArray[0][0]==gamePlayModel.buttonIntegerArray[1][0]&& gamePlayModel.buttonIntegerArray[1][0]==gamePlayModel.buttonIntegerArray[2][0] &&
                (gamePlayModel.buttonIntegerArray[0][0]==1 ||gamePlayModel.buttonIntegerArray[0][0]==2)){//first column
            Dialog dialog = new Dialog(gamePlayScreenView.jFrame,"WINNER");
            if(gamePlayModel.buttonIntegerArray[0][0] == 1) {
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

        else if(gamePlayModel.buttonIntegerArray[0][1]==gamePlayModel.buttonIntegerArray[1][1]&& gamePlayModel.buttonIntegerArray[1][1]==gamePlayModel.buttonIntegerArray[2][1] &&
                (gamePlayModel.buttonIntegerArray[0][1]==1 ||gamePlayModel.buttonIntegerArray[0][1]==2)){//second column
            Dialog dialog = new Dialog(gamePlayScreenView.jFrame,"WINNER");
            if(gamePlayModel.buttonIntegerArray[0][1] == 1) {
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

        else if(gamePlayModel.buttonIntegerArray[0][2]==gamePlayModel.buttonIntegerArray[1][2]&& gamePlayModel.buttonIntegerArray[1][2]==gamePlayModel.buttonIntegerArray[2][2] &&
                (gamePlayModel.buttonIntegerArray[0][2]==1 ||gamePlayModel.buttonIntegerArray[0][2]==2)){//third
            Dialog dialog = new Dialog(gamePlayScreenView.jFrame,"WINNER");
            if(gamePlayModel.buttonIntegerArray[0][2] == 1) {
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

        else if(gamePlayModel.buttonIntegerArray[0][0]==gamePlayModel.buttonIntegerArray[1][1]&& gamePlayModel.buttonIntegerArray[1][1]==gamePlayModel.buttonIntegerArray[2][2] &&
                (gamePlayModel.buttonIntegerArray[0][0]==1 ||gamePlayModel.buttonIntegerArray[0][0]==2)){//first diagonal
            Dialog dialog = new Dialog(gamePlayScreenView.jFrame,"WINNER");
            if(gamePlayModel.buttonIntegerArray[0][0] == 1) {
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

        else if(gamePlayModel.buttonIntegerArray[0][2]==gamePlayModel.buttonIntegerArray[1][1]&& gamePlayModel.buttonIntegerArray[1][1]==gamePlayModel.buttonIntegerArray[2][0] &&
                (gamePlayModel.buttonIntegerArray[0][2]==1 ||gamePlayModel.buttonIntegerArray[0][2]==2)){//second diagonal
            Dialog dialog = new Dialog(gamePlayScreenView.jFrame,"WINNER");
            if(gamePlayModel.buttonIntegerArray[0][2] == 1) {
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
    }

