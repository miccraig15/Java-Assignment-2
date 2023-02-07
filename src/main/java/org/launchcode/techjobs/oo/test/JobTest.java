package org.launchcode.techjobs.oo.test;
import org.junit.BeforeClass;
import org.launchcode.techjobs.oo.Job;
import org.launchcode.techjobs.oo.Employer;
import org.launchcode.techjobs.oo.Location;
import org.launchcode.techjobs.oo.PositionType;
import org.launchcode.techjobs.oo.CoreCompetency;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)

public class JobTest {

    static Job job_One; static Job job_Two; static Job job_Three; static Job job_Four; static Job job_Five;
    static Job job_Six; static Job job_Seven; static Job job_Eight; static Job job_Nine;
    @BeforeClass
    public static void createJobObjects() {
        job_One = new Job();
        job_Two = new Job();
        job_Three = new Job(("Product tester"), new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job_Four = new Job(("Product tester"), new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job_Five = new Job((""), new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job_Six = new Job(("Product tester"), new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job_Seven = new Job(("Product tester"), new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job_Eight = new Job(("Product tester"), new Employer("ACME"), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        job_Nine = new Job(("Product tester"), new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));
    }
    @Test
    public void testSettingJobId() {
        assertEquals(job_One.getId(), 1);
        assertEquals(job_Two.getId(), 2);
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals(job_Three.getName(),"Product tester", "Product tester");
        assertEquals(job_Three.getEmployer().getValue(), "ACME", "ACME");
        assertEquals(job_Three.getLocation().getValue(), "Desert", "Desert");
        assertEquals(job_Three.getPositionType().getValue(), "Quality control", "Quality control");
        assertEquals(job_Three.getCoreCompetency().getValue(), "Persistence", "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(job_Three.equals(job_Four));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        assertEquals(job_Three.toString(),"\n" +
                "ID: 3" + "\n" +
                "Name: Product tester" + "\n" +
                "Employer: ACME" + "\n" +
                "Location: Desert" + "\n" +
                "Position Type: Quality control" + "\n" +
                "Core Competency: Persistence" + "\n");
    }

    @Test
    public void testToStringHandlesEmptyField() {
        assertEquals(job_Five.toString(), "\n" +
                "ID: 5" + "\n" +
                "Name: Data not available" + "\n" +
                "Employer: ACME" + "\n" +
                "Location: Desert" + "\n" +
                "Position Type: Quality control" + "\n" +
                "Core Competency: Persistence" + "\n");

        assertEquals(job_Six.toString(), "\n" +
                "ID: 6" + "\n" +
                "Name: Product tester" + "\n" +
                "Employer: Data not available" + "\n" +
                "Location: Desert" + "\n" +
                "Position Type: Quality control" + "\n" +
                "Core Competency: Persistence" + "\n");

        assertEquals(job_Seven.toString(), "\n" +
                "ID: 7" + "\n" +
                "Name: Product tester" + "\n" +
                "Employer: ACME" + "\n" +
                "Location: Data not available" + "\n" +
                "Position Type: Quality control" + "\n" +
                "Core Competency: Persistence" + "\n");

        assertEquals(job_Eight.toString(), "\n" +
                "ID: 8" + "\n" +
                "Name: Product tester" + "\n" +
                "Employer: ACME" + "\n" +
                "Location: Desert" + "\n" +
                "Position Type: Data not available" + "\n" +
                "Core Competency: Persistence" + "\n");

        assertEquals(job_Nine.toString(), "\n" +
                "ID: 9" + "\n" +
                "Name: Product tester" + "\n" +
                "Employer: ACME" + "\n" +
                "Location: Desert" + "\n" +
                "Position Type: Quality control" + "\n" +
                "Core Competency: Data not available" + "\n");
    }
}
