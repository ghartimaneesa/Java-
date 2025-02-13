//5. Write a Java program to create an interface Playable with a method play()
// that takes no arguments and returns void.
// Create three classes Football, Volleyball, and Basketball that implement the Playable interface
// and override the play() method to play the respective sports.

package Interface;

interface Playable {

    void play();


}

class Football implements Playable{

    @Override
    public void play() {
        System.out.println("I AM PLAYING FOOTBALL");
    }
}

class Basketball implements Playable{

    @Override
    public void play() {

        System.out.println("I AM PLAYING BASKETBALL");

    }
}

class Volleyball implements Playable{

    @Override
    public void play() {

        System.out.println(" I AM PLAYING VOLLEYBALL");

    }
}

class Main{
    public static void main(String[] args) {

        Football f1 = new Football();
        f1.play();

    }
}