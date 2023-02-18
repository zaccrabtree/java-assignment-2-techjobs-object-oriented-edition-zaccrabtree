package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {


    @Test
    public void testSettingJobId(){
        Job test_job1 = new Job();
        Job test_job2 = new Job();
        assertNotEquals(test_job1, test_job2);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertTrue(test_job3.getName() instanceof String);
        assertTrue(test_job3.getEmployer() instanceof Employer);
        assertTrue(test_job3.getLocation() instanceof Location);
        assertTrue(test_job3.getPositionType() instanceof PositionType);
        assertTrue(test_job3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Product tester", test_job3.getName());
        assertEquals("ACME", test_job3.getEmployer().toString());
        assertEquals("Desert", test_job3.getLocation().toString());
        assertEquals("Quality Control", test_job3.getPositionType().toString());
        assertEquals("Persistence", test_job3.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality(){
        Job test_job4 = new Job ("Y2K Debugger", new Employer("Initech"), new Location("Los Angeles"), new PositionType("Office Drone"), new CoreCompetency("Not Caring"));
        Job test_job5 = new Job ("Y2K Debugger", new Employer("Initech"), new Location("Los Angeles"), new PositionType("Office Drone"), new CoreCompetency("Not Caring"));
        assertFalse(test_job4.equals(test_job5));
    }

}
