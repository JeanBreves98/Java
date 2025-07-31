package dev.lpa;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class MyLinkedListTest {

    private MyLinkedList list;

    @BeforeEach
    void setUp() {
        list = new MyLinkedList(null);
    }

    @Test
    void testAddFirstItem() {
        ListItem item = new Node("First");
        assertTrue(list.addItem(item));
        assertEquals(item, list.getRoot());
    }

    @Test
    void testAddMultipleItems() {
        ListItem first = new Node("A");
        ListItem second = new Node("B");
        ListItem third = new Node("C");

        list.addItem(first);
        list.addItem(second);
        list.addItem(third);


        assertEquals(first,list.getRoot());
        assertEquals(second, first.next());
        assertEquals(third, second.next());
    }

    @Test
    void testRemoveItem() {
        ListItem item = new Node("Test");
        list.addItem(item);
        assertTrue(list.removeItem(item));
        assertNull(list.getRoot());

    }

}
