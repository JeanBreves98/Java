package dev.lpa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SearchTreeTest {
    private SearchTree tree;

    @BeforeEach
    void setUp() {
        tree = new SearchTree(null);
    }

    @Test
    void testAddFirstItem() {
        ListItem item = new Node("Root");
        assertTrue(tree.addItem(item));
        assertEquals(item, tree.getRoot());
    }

    @Test
    void testAddDuplicateItem() {
        ListItem item1 = new Node("Test");
        ListItem item2 = new Node("Test");
        assertTrue(tree.addItem(item1));
        assertFalse(tree.addItem(item2));
    }

    @Test
    void testTreeOrder() {
        ListItem b = new Node("B");
        ListItem a = new Node("A");
        ListItem c = new Node("C");

        tree.addItem(b);
        tree.addItem(a);
        tree.addItem(c);

        assertEquals(b, tree.getRoot());
        assertEquals(a, b.previous());
        assertEquals(c, b.next());
    }
}
