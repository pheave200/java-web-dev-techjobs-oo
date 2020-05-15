package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;


import static org.junit.Assert.assertArrayEquals;
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
                new CoreCompetency("Persistence"));
        testJob4 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
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
        assertEquals("Product tester", testJob3.getName());
        assertEquals("ACME", testJob3.getEmployer().getValue());
        assertEquals("Desert", testJob3.getLocation().getValue());
        assertEquals("Quality control", testJob3.getPositionType().getValue());
        assertEquals("Persistence", testJob3.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality() {
        assertEquals(false,testJob3.equals(testJob4));
    }

    @Test
    public void testStringStartsWithNewLine() {
        assertEquals(true,testJob3.toString().startsWith("\n"));
        assertEquals(true,testJob3.toString().endsWith("\n"));
    }
    @Test
    public void testJobsToString() {
        String output = "\nID: " + testJob3.getId() + "\n" +
                "name: " + testJob3.getName() + "\n" +
                "employer: " + testJob3.getEmployer() + "\n" +
                "location: " + testJob3.getLocation() + "\n" +
                "positionType: " + testJob3.getPositionType() + "\n" +
                "coreCompetency: " + testJob3.getCoreCompetency() + "\n";
    }
    @Test
    public void testToString1() {
        assertEquals(true,testJob5.toString().contains("Data not available"));
    }
}
