package de.saghzafen.canopus;

import java.util.ArrayList;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        ArrayList<Node> inputNodes = new ArrayList<Node>(4);
        
        Layer inputLayer = new Layer(inputNodes);
        Layer hiddenLayer_1 = new Layer(8);
        Layer outputLayer = new Layer(1);


        System.out.println("exit");
    }
}
