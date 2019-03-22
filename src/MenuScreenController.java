import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuScreenController implements ActionListener {

    MenuScreenView view;
    public  MenuScreenController(MenuScreenView view){
        this.view = view;
        view.playGameButton.addActionListener(this::actionPerformed);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        view.jFrame.dispose();
        new GamePlayContoller(new GamePlayModel(),new GamePlayScreenView());
    }
}
