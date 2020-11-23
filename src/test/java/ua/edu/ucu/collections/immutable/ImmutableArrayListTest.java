package ua.edu.ucu.collections.immutable;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ImmutableArrayListTest {

    @Test
    public void testMethodAdd() {
        Object[] array = {1, 2, 3};
        ImmutableList newArray = new ImmutableArrayList(array);
        ImmutableList result = newArray.add(4);

        Object[] expResult = {1, 2, 3, 4};
        Object[] actualResult = result.toArray();
        assertArrayEquals(expResult, actualResult);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMethodAddIndexWrongIndex() {
        Object[] array = {1, 2, 3};
        ImmutableList newArray = new ImmutableArrayList(array);
        ImmutableList result = newArray.add(5, 4);
    }

    @Test
    public void testMethodAddIndex() {
        Object[] array = {1, 2, 3};
        ImmutableList newArray = new ImmutableArrayList(array);
        ImmutableList result = newArray.add(2, 4);

        Object[] expResult = {1, 2, 4, 3};
        Object[] actualResult = result.toArray();
        assertArrayEquals(expResult, actualResult);
    }


    @Test
    public void testMethodAddAll() {
        Object[] array = {1, 2, 3};
        Object[] cArray = {6, 7};
        ImmutableList newArray = new ImmutableArrayList(array);
        newArray = newArray.addAll(2, cArray);
        ImmutableList result = newArray;

        Object[] expResult = {1, 2, 6, 7, 3};
        Object[] actualResult = result.toArray();
        System.out.println(Arrays.toString(actualResult));
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testMethodAddAllStart() {

        Object[] cArray = {6, 7};
        ImmutableList newArray = new ImmutableArrayList();
        newArray = newArray.addAll(cArray);
        ImmutableList result = newArray;

        Object[] expResult = {6, 7};
        Object[] actualResult = result.toArray();
        assertArrayEquals(expResult, actualResult);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMethodAddAllWrongIndex() {
        Object[] array = {1, 2, 3};
        Object[] cArray = {6, 7};
        ImmutableList newArray = new ImmutableArrayList(array);
        ImmutableList result = newArray.addAll(5, cArray);
    }

    @Test
    public void testMethodGet() {
        Object[] array = {1, 2, 3};
        ImmutableList newArray = new ImmutableArrayList(array);
        Object expResult = 1;
        Object actualResult = newArray.get(0);
        assertEquals(expResult, actualResult);


    }

    @Test(expected = IllegalArgumentException.class)
    public void testMethodGetWrongIndex() {
        Object[] array = {1, 2, 3};
        ImmutableList newArray = new ImmutableArrayList(array);
        Object expResult = 1;
        Object actualResult = newArray.get(10);
    }

    @Test
    public void testMethodRemove() {
        Object[] array = {1, 2, 3};
        ImmutableList newArray = new ImmutableArrayList(array);
        ImmutableList result = newArray.remove(1);
        Object[] expResult = {1, 3};
        Object[] actualResult = result.toArray();
        assertArrayEquals(expResult, actualResult);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMethodRemoveWrongIndex() {
        Object[] array = {1, 2, 3};
        ImmutableList newArray = new ImmutableArrayList(array);
        ImmutableList result = newArray.remove(5);
    }

    @Test
    public void testMethodSet() {
        Object[] array = {1, 2, 3};
        Object eObj = 5;
        ImmutableList newArray = new ImmutableArrayList(array);
        ImmutableList result = newArray.set(1, eObj);
        Object[] expResult = {1, 5, 3};
        Object[] actualResult = result.toArray();
        assertArrayEquals(expResult, actualResult);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMethodSetWrongIndex() {
        Object[] array = {1, 2, 3};
        Object eObj = 5;
        ImmutableList newArray = new ImmutableArrayList(array);
        ImmutableList result = newArray.set(5, eObj);

    }

    @Test
    public void testMethodIndexOf() {
        Object[] array = {1, 2, 3};
        ImmutableList newArray = new ImmutableArrayList(array);
        int actualResult = newArray.indexOf(3);

        assertEquals(2, actualResult);
    }

    @Test
    public void testMethodIndexOfNoElement() {
        Object[] array = {1, 2, 3};
        ImmutableList newArray = new ImmutableArrayList(array);
        int actualResult = newArray.indexOf(5);

        assertEquals(-1, actualResult);
    }

    @Test
    public void testMethodSize() {
        Object[] array = {1, 2, 3};
        ImmutableList newArray = new ImmutableArrayList(array);
        int actualResult = newArray.size();

        assertEquals(3, actualResult);
    }

    @Test
    public void testMethodClear() {
        Object[] array = {1, 2, 3};
        ImmutableList newArray = new ImmutableArrayList(array);
        ImmutableList result = newArray.clear();
        Object[] expResult = {};
        Object[] actualResult = result.toArray();
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testMethodEmpty() {
        Object[] array = {};
        ImmutableList newArray = new ImmutableArrayList(array);
        boolean actualResult = newArray.isEmpty();
        assertEquals(true, actualResult);
    }

    @Test
    public void testMethodToArray() {
        Object[] array = {1, 2, 3};
        ImmutableList newArray = new ImmutableArrayList(array);
        Object [] actualResult = newArray.toArray();
        Object [] expResult = {1, 2, 3};
        assertEquals(Arrays.toString(expResult), Arrays.toString(actualResult));
    }
}
    

