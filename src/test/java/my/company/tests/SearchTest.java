package my.company.tests;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 28.10.13t
 */
public class SearchTest {



    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void searchTest() throws Exception {
        Assert.assertTrue(true);



    }

    @Test
    public void simpleTest() throws Exception {
       Assert.assertEquals(33, 2323);
    }



      @Test
    public void simpleTestWithAttachments() throws Exception {
          Assert.assertEquals(33 , 33);
    }


}

