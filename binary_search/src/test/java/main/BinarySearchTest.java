package main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author unkown;
 */
public class BinarySearchTest {
    /**
     * Test of search method, of class Main.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int expResult = 4; //index of 5
        int result = BinarySearch.search(arr, target);
        assertEquals(expResult, result);
    }

    //simulando um erro no teste
    /*
    @Test
    public void testSearchError() {
        System.out.println("search");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int expResult = -1; //index of 5 is 4
        int result = BinarySearch.search(arr, target);
        assertEquals(expResult, result);
    }
    */

    @Test
    public void testSearchNotFound() {
        System.out.println("searchNotFound");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 11;
        int expResult = -1; //index of 11
        int result = BinarySearch.search(arr, target);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testArrayNotOrdered() {
        System.out.println("ArrayNotOrdered");
        int[] arr = {1, 4, 3, 7, 5, 2, 0, 6, 9, 10};
        int target = 7;
        int expResult = -2;
        int result = BinarySearch.search(arr, target);
        assertEquals(expResult, result);
    }
}
