import utils.Door;
public class App {
    public static void main(String[] args) throws Exception {
        Door.getInstance().getStatus();
        Door.getInstance().toClose();
        Door.getInstance().getStatus();
        Door.getInstance().toOpen();
        Door.getInstance().getStatus();
    }
}
