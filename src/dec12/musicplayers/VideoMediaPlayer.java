package dec12.musicplayers;

public class VideoMediaPlayer implements MediaPlayer {
    @Override
    public void play() {
        System.out.println("Play option....");
    }

    @Override
    public void pause() {
        System.out.println("pause option....");

    }

    @Override
    public void fastForward() {
        System.out.println("Fast Forward option.....");

    }

    @Override
    public void rewind() {
        System.out.println("Rewind option.....");

    }
    public void Vedio(){
        System.out.println("Vedio option included");
    }
}
