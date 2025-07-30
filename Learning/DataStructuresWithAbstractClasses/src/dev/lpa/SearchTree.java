package dev.lpa;

public class SearchTree implements NodeList {
    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (root == null) {
            root = item;
            return true;
        }

        ListItem current = root;

        while (current != null) {
            int comparison = current.compareTo(item);
            if (comparison < 0) {
                if (current.next() != null) {
                    current = current.next();
                } else {
                    current.setNext(item);
                    return true;
                }
            } else if (comparison > 0) {
                if (current.previous() != null) {
                    current = current.previous();
                } else {
                    current.setPrevious(item);
                    return true;
                }
            } else {
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem current = root;
        ListItem parent = current;

        while (current != null) {
            int comparison = current.compareTo(item);
            if (comparison < 0) {
                parent = current;
                current = current.next();
            } else if (comparison > 0) {
                parent = current;
                current = current.previous();
            } else {
                performRemoval(current, parent);
                return true;
            }
        }

        return false;
    }

    private void performRemoval(ListItem toBeRemoved, ListItem parent) {
        if (toBeRemoved.next() == null && toBeRemoved.previous() == null) {
            if (parent.next() == toBeRemoved) {
                parent.setNext(null);
            } else if (parent.previous() == toBeRemoved) {
                parent.setPrevious(null);
            } else {
                root = null;
            }
        } else if (toBeRemoved.previous() == null) {
            if (parent.next() == toBeRemoved) {
                parent.setNext(toBeRemoved.next());
            } else if (parent.previous() == toBeRemoved) {
                parent.setPrevious(toBeRemoved.next());
            } else {
                root = toBeRemoved.next();
            }
        } else if (toBeRemoved.next() == null) {
            if (parent.next() == toBeRemoved) {
                parent.setNext(toBeRemoved.previous());
            } else if (parent.previous() == toBeRemoved) {
                parent.setPrevious(toBeRemoved.previous());
            } else {
                root = toBeRemoved.previous();
            }
        } else {
            ListItem current = toBeRemoved.next();
            ListItem leftMostParent = toBeRemoved;

            while (current.previous() != null) {
                leftMostParent = current;
                current = current.previous();
            }

            toBeRemoved.setValue(current.getValue());

            if (leftMostParent == toBeRemoved) {
                toBeRemoved.setNext(current.next());
            } else {
                leftMostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
