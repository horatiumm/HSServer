/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author hmuresan
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({test.TestOrg.class,test.TestBase.class,test.TestProduct.class})
public class HSFTestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}