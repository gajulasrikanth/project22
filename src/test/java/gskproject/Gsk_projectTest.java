package gskproject;

import static org.junit.Assert.assertEquals;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.carewebframework.ui.test.MockUITest;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for gskproject
 */
public class Gsk_projectTest extends MockUITest {
    
    private static final Log log = LogFactory.getLog(Gsk_projectTest.class);
    
    /**
     * Unit Test initialization
     */
    @Before
    public final void init() {
        log.info("Initializing Test Class");
    }
    
    /**
     * Performs unit test A
     */
    @Test
    public void performUnitTestA() {
        log.info("Performing Unit Test A");
    }
    
}
