package dev.lpa;

public interface NodeList {
    abstract void getRoot();

    abstract boolean addItem(ListItem item);

    abstract boolean removeItem(ListItem item);

    abstract void traverse(ListItem root);
}
