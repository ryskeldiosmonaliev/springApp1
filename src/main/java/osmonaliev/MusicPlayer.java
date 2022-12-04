package osmonaliev;

public class MusicPlayer {
    private String name;
    private int volume;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    private Music music;
    //IoC
    public MusicPlayer(Music music){
        this.music=music;
    }
    public MusicPlayer(){}

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public  void playMusic(){
        System.out.println("Playing:"+music.getSong());
    }
}
