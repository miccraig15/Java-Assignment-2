package org.launchcode.techjobs.oo.test;
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

    @Test
    public void testSettingJobId() {
        Job job_One = new Job();
        assertEquals(1, 1);
        Job job_Two = new Job();
        assertEquals(2, 2);
//        System.out.println(job_One.getId());
//        System.out.println(job_Two.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job_One = new Job(("Product tester"), new Employer ("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(job_One.getName(),"Product tester", "Product tester");
        assertEquals(job_One.getEmployer().getValue(), "ACME", "ACME");
        assertEquals(job_One.getLocation().getValue(), "Desert", "Desert");
        assertEquals(job_One.getPositionType().getValue(), "Quality control", "Quality control");
        assertEquals(job_One.getCoreCompetency().getValue(), "Persistence", "Persistence");
//        System.out.println(job_One.getId());
//        System.out.println(job_One.getName());
//        System.out.println(job_One.getEmployer());
//        System.out.println(job_One.getLocation());
//        System.out.println(job_One.getPositionType());
//        System.out.println(job_One.getCoreCompetency());
    }

    @Test
    public void testJobsForEquality() {
        Job job_One = new Job(("Product tester"), new Employer ("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job_Two = new Job(("Product tester"), new Employer ("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job_One.equals(job_Two));
//        System.out.println(job_One.equals(job_Two));
//        System.out.println(job_One.getId());
//        System.out.println(job_Two.getId());
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job_One = new Job(("Product tester"), new Employer ("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(job_One.toString(), "\n" +
                "ID: 1" + "\n" +
                "Name: Product tester" + "\n" +
                "Employer: ACME" + "\n" +
                "Location: Desert" + "\n" +
                "Position Type: Quality control" + "\n" +
                "Core Competency: Persistence" + "\n");
//        System.out.println(job_One.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job_One = new Job((""), new Employer ("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(job_One.toString(), "\n" +
                "ID: 1" + "\n" +
                "Name: Data not available" + "\n" +
                "Employer: ACME" + "\n" +
                "Location: Desert" + "\n" +
                "Position Type: Quality control" + "\n" +
                "Core Competency: Persistence" + "\n");

        Job job_Two = new Job(("Product tester"), new Employer (""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(job_Two.toString(), "\n" +
                "ID: 2" + "\n" +
                "Name: Product tester" + "\n" +
                "Employer: Data not available" + "\n" +
                "Location: Desert" + "\n" +
                "Position Type: Quality control" + "\n" +
                "Core Competency: Persistence" + "\n");

        Job job_Three = new Job(("Product tester"), new Employer ("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(job_Three.toString(), "\n" +
                "ID: 3" + "\n" +
                "Name: Product tester" + "\n" +
                "Employer: ACME" + "\n" +
                "Location: Data not available" + "\n" +
                "Position Type: Quality control" + "\n" +
                "Core Competency: Persistence" + "\n");

        Job job_Four = new Job(("Product tester"), new Employer ("ACME"), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        assertEquals(job_Four.toString(), "\n" +
                "ID: 4" + "\n" +
                "Name: Product tester" + "\n" +
                "Employer: ACME" + "\n" +
                "Location: Desert" + "\n" +
                "Position Type: Data not available" + "\n" +
                "Core Competency: Persistence" + "\n");

        Job job_Five = new Job(("Product tester"), new Employer ("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));
        assertEquals(job_Five.toString(), "\n" +
                "ID: 5" + "\n" +
                "Name: Product tester" + "\n" +
                "Employer: ACME" + "\n" +
                "Location: Desert" + "\n" +
                "Position Type: Quality control" + "\n" +
                "Core Competency: Data not available" + "\n");
    }
}
