package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;


import static org.junit.Assert.assertEquals;


public class JobTest {
   Job testJob1;
   Job testJob2;
   Job testJob3;
   Job testJob4;
   Job testJob5;

    @Before
    public void createJobObj() {
        testJob1 = new Job();
        testJob2 = new Job();
        testJob3 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        testJob4 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        testJob5 = new Job("",
                new Employer(""),
                new Location(""),
                new PositionType(""),
                new CoreCompetency("")
        );
    }
    @Test
    public void testSettingJobId() {
        assertEquals(1,testJob2.getId() - testJob1.getId(), .001);
    }
    @Test
    public void testJobConstructorSetAllFields() {
        assertEquals(true,testJob3 instanceof Job);
    }

    @Test
    public void testJobsForEquality() {
        assertEquals(false,testJob3.equals(testJob4));
    }

    @Test
    public void testToStringEmpty() {
        assertEquals(false,testJob5.toString().startsWith("\n"));
    }
}
