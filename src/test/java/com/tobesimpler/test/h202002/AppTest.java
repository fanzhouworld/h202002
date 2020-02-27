package com.tobesimpler.test.h202002;

import java.util.Arrays;
import java.util.List;

import com.tobesimpler.test.h202002.App;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigorous Test :-)
     */
    public void testApp()
    {
        // stage1
        App app = new App();
        
        List<String> actual1 = app.stage1("ilikesamsungmobile");
        List<String> excepted1 = Arrays.asList("i like samsung mobile, i like sam sung mobile".split(", "));
        assertEquals(actual1.size(), excepted1.size());
        assertTrue(actual1.containsAll(excepted1));
        
        List<String> actual2 = app.stage1("ilikeicecreamandmango");
        List<String> excepted2 = Arrays.asList("i like ice cream and man go".split(", "));
        assertEquals(actual2.size(), excepted2.size());
        assertTrue(actual2.containsAll(excepted2));
    }
}
