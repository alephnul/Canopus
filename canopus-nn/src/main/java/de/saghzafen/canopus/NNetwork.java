package de.saghzafen.canopus;

import java.util.ArrayList;

/**
 * NNetwork
 */
public class NNetwork {

    private Layer inputLayer;
    private Layer outputLayer;
    private Layer[] hiddenLayers;

    NNetwork(Layer inputLayer, Layer outputLayer, Layer... hiddenLayers) {
        this.inputLayer = inputLayer;
        this.outputLayer = outputLayer;
        this.hiddenLayers = hiddenLayers;
    }

    public void trainWithThisData(ArrayList<Node> nodes) {
        try {
            inputLayer.setNodes(nodes);
        } catch (Exception e) {
            System.err.println("Training Data must have consistent size.");
            e.printStackTrace();
        }
        trainWeights();
    }

	private void trainWeights() {
	}
    
}