package dev.lpa;

public class Node extends ListItem{


    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        rightLink = item;
        return rightLink;
    }

    @Override
    ListItem previous() {
        return leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        leftLink = item;
        return leftLink;
    }

    @Override
    int compareTo(ListItem item) {
        if (this.getValue() instanceof Comparable && item.getValue() instanceof Comparable) {
            Comparable<Object> x = (Comparable<Object>) this.getValue();
            return x.compareTo(item.getValue());
        }
        return 0;
    }
}
