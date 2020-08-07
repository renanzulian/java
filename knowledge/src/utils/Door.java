package utils;

public class Door {
    private static Door instance;
    private String status;

    private Door() {
        this.status = "Closed";
    }

    public static synchronized Door getInstance(){
        if(instance == null) {
            instance = new Door();
        }
        return instance;
    }

    public void toOpen(){
        this.status = "Opned";
    }

    public void toClose(){
        this.status = "Closed";
    }

    public void getStatus(){
        System.out.println(this.status);
    }
}