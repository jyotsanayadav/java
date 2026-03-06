interface Playable {
    void play();
}

class MusicPlayer implements Playable {
    public void play() {
        System.out.println("Playing music...");
    }
}

class VideoPlayer implements Playable {
    public void play() {
        System.out.println("Playing video...");
    }
}

public class InterfacePlayable {
    public static void main(String[] args) {
        Playable p1 = new MusicPlayer();
        Playable p2 = new VideoPlayer();

        p1.play();
        p2.play();
    }
}