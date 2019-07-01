package de.saghzafen.canopus;

/**
 * Node
 */
public class Node {

    private float value;
    private float weight;

    private Layer previousLayer;

    Node(float value, float weight) {
        this.value = value;
        this.weight = weight;
    }

    Node(float weight) {
        this.value = weight;
    }

    public float activate() {
        if (this.value < 0) {
            return 0;
        }else if(this.value > 1) {
            return 1;
        }
        
        return value;
    }

    public void setValue(float value){
        this.value = value;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setpreviousLayer(Layer previousLayer) {
        this.previousLayer = previousLayer;
    }

    public float getValue() {
        return this.value;
    }
    
    public float getWeight() {
        return this.weight;
    }

    public Layer getPreviousLayer() {
        return this.previousLayer;
    }
}