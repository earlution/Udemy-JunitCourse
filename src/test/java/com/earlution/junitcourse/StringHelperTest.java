package com.earlution.junitcourse;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author ruari
 */
public class StringHelperTest {
    
    @Test
    public void test() {
        StringHelper helper = new StringHelper();
        // AACD => CD, ACD => CD, CDEF => CDEF, CDAA=> CDAA
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
        //expected, actual
    }
    
}
