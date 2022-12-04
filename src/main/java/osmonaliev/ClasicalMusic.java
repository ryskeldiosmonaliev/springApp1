package osmonaliev;

public class ClasicalMusic implements Music{

    private ClasicalMusic(){//чтобы не создават обекты через new
    }
    public static ClasicalMusic getClasicalMusik(){
        return new ClasicalMusic();
    }
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    public void doMyDectroy(){
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return "Ala-Too";
    }
}
