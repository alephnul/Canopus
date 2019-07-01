package de.saghzafen.canopus;

import java.awt.List;
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
        //TODO: load training data to input nodes

        ArrayList<Node> inputNodes = new ArrayList<Node>(4);
        inputNodes.add(new Node(0));
        inputNodes.add(new Node(1));
        inputNodes.add(new Node(0.5f));
        inputNodes.add(new Node(0.7f));

        ArrayList<ArrayList<Node>> inputs = new ArrayList<ArrayList<Node>>();
        inputs.add(inputNodes);
    
        Layer inputLayer = new Layer(inputNodes);
        Layer hiddenLayer_1 = new Layer(8);
        Layer outputLayer = new Layer(1);

        NNetwork myNetwork = new NNetwork(inputLayer, outputLayer, hiddenLayer_1);

        for ( ArrayList<Node> input: inputs) {
            myNetwork.trainWithThisData(input);
        }

        //TODO: serialize calculated weights
        System.out.println("exit");
    }
}
