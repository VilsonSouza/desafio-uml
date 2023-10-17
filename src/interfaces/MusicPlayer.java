package interfaces;

public interface MusicPlayer {
    boolean play();
    boolean pause(boolean isPlaying);
    void selectMusic(String musica);
}
