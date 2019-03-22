public class GamePlayModel {
    int buttonIntegerArray [][];
    Boolean cross;
    public GamePlayModel(){
        cross = false;
        buttonIntegerArray = new int[3][3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++) {
                buttonIntegerArray[i][j] = 0;
            }
        }

    }
}
