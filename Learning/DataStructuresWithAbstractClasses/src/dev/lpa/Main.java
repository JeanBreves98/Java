package dev.lpa;

public class Main {
    public static void main(String[] args) {
        SearchTree tree = new SearchTree(null);

        tree.addItem(new Node("Delta"));
        tree.addItem(new Node("Alpha"));
        tree.addItem(new Node("Charlie"));
        tree.addItem(new Node("Bravo"));
        tree.addItem(new Node("Echo"));

        tree.traverse(tree.getRoot());
    }
}