package de.saghzafen.canopus;

import java.util.ArrayList;
import java.util.Random;

public class Layer{

    private ArrayList<Node> nodes = new ArrayList<Node>();

    Layer (int size) {
        initNodes(size);
    }

    Layer(ArrayList<Node> nodes) {
        this.nodes = nodes;
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public void setNodes(ArrayList<Node> nodes) throws Exception {
        if (this.nodes.size() != nodes.size()) {
            throw new Exception("Size mismatch. Expected size " + this.nodes.size() + " but got " + nodes.size());
        }
        this.nodes = nodes;
    }

    public int size(){
        return nodes.size();
    }

    private void initNodes(int size) {
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            this.nodes.add(new Node(r.nextFloat()));
        }
    }

}