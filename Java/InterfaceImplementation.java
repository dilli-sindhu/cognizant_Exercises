/*
 Interface Implementation 
• Objective: Use interfaces in Java. 
• Task: Define an interface Playable with a method play(). 
• Instructions: 
o Implement the interface in classes Guitar and Piano. 
o Each class should provide its own implementation of play(). 
o Instantiate the classes and call the method.
*/
interface Playable {
    void play();
}

class Guitar implements Playable {

    @Override
    public void play() {
        System.out.println("Playing the Guitar");
    }
}

class Piano implements Playable {

    @Override
    public void play() {
        System.out.println("Playing the Piano");
    }
}

public class InterfaceImplementation {
    public static void main(String[] args) {

        Guitar guitar = new Guitar();
        Piano piano = new Piano();

        guitar.play();
        piano.play();
    }
}