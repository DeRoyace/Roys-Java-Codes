public class Toy {
    public void play() {
        System.out.print("play-");
    }

    public void finalizer() {
        System.out.print("clean-");
    }
    
    public void finalize() {
		System.out.println("game-");
	}

    public static void main(String[] fun) {
        Toy car = new Toy();
        car.play();
        car = null;
        System.gc();
        Toy doll = new Toy();
        doll.play();
    }
}

// OUTPUT : play-play-game-
