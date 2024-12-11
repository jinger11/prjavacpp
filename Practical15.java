/*
15. Write a Java program to create an interface Playable with a method play() that takes no arguments and returns void. Create three classes Football, Volleyball, and Basketball that implement the Playable interface and override the play() method to play the respective sports
*/
// Interface Playable with a method play()
interface Playable {
    void play();  // Abstract method to play a sport
}

// Class Football implementing the Playable interface
class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Football.");
    }
}

// Class Volleyball implementing the Playable interface
class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Volleyball.");
    }
}

// Class Basketball implementing the Playable interface
class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Basketball.");
    }
}

// Main class to test the Playable interface and its implementations
public class Practical15 {
    public static void main(String[] args) {
        // Create objects of Football, Volleyball, and Basketball
        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();
        
        // Call the play() method for each sport
        football.play();      // Output: Playing Football.
        volleyball.play();    // Output: Playing Volleyball.
        basketball.play();    // Output: Playing Basketball.
    }
}

