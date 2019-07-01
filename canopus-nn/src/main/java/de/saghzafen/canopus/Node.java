package de.saghzafen.canopus;

/**
 * Node
 */
public class Node {

    float value;
    Layer nextLayer;

    Node(float value) {
        this.value = value;
    }

    public float activate() {
        if (this.value < 0) {
            return 0;
        }else if(this.value > 1) {
            return 1;
        }
        
        return value;
    }

    public void setNextLayer(Layer nextLayer) {
        this.nextLayer = nextLayer;
    }
    
}