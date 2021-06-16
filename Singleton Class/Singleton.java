import java.util.Random;

public class Singleton {
    private int ID;

    private static Singleton instance=null;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    private Singleton(){
        Random random=new Random();
        setID(random.nextInt(100));
    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
