public class Player {
    String name;

    String  tick_cross;

    public Player(String name, String score,String tick_cross){
        this.name=name;
        this.tick_cross=tick_cross;
    }
    public String getName(){
        return this.name;
    }

    public String getTick_cross(){
        return tick_cross;
    }

}
