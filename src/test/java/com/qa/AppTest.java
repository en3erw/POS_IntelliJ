package com.qa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private static final Logger logger = Logger.getLogger(AppTest.class.getName());
    FileHandler fh;




    @Test
    public void test1 (){
        try {
            fh = new FileHandler("mylog.txt");

        fh.setFormatter(new SimpleFormatter());
        logger.addHandler(fh);
        logger.setLevel(Level.INFO);
        logger.log(Level.INFO, "Example dataaa!!");
        logger.info("Example data!");}
        catch (IOException e) {
            logger.severe("Error" + e.toString());
            fail();
        }
    }

    /**
     * Rigorous Test :-)
     */

    private App app;

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @Test
    public void mainTest()
    {
        app = new App();
        String[] input = new String[]{"a"};

       // app.main(input);
    }


    @Test
    public void calculateTest()
    {
        assertEquals(7,app.calculate(3,4));
    }

}
