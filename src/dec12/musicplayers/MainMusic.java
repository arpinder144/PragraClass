package dec12.musicplayers;

public class MainMusic {
    public static void main(String[] args) {
        Youtube youtube=new Youtube();
        youtube.play();
        youtube.Vedio();
        youtube.fastForward();
        youtube.pause();
        youtube.rewind();
        AmazonMusic amazonMusic=new AmazonMusic();
        amazonMusic.play();
        amazonMusic.fastForward();
        Spotify spotify=new Spotify();
        spotify.play();
        spotify.pause();
    }
}
