package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    //    Custom toString method:

    @Override
    public String toString() {
        return "\n" +
                "ID: " + getId() + "\n" +
                "Name: " + getName() + "\n" +
                "Employer: " + getEmployer() + "\n" +
                "Location: " + getLocation() + "\n" +
                "Position Type: " + getPositionType() + "\n" +
                "Core Competency: " + getCoreCompetency() + "\n"
                ;
    }

    @Override
    public boolean equals(Object o) { // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() { return Objects.hash(getId()); }

    // Getters:

    public int getId() { return id; }

    public String getName() {
        if (name == "") {
            return "Data not available";
        } else {
            return name;
        }
    }
    public Employer getEmployer() {
        if (employer.getValue() == "") {
            employer.setValue("Data not available");
            }
        return employer;
    }

    public Location getLocation() {
        if (location.getValue() == "") {
            location.setValue("Data not available");
        }
        return location;
    }

    public PositionType getPositionType() {
        if (positionType.getValue() == "") {
            positionType.setValue("Data not available");
        }
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        if (coreCompetency.getValue() == "") {
            coreCompetency.setValue("Data not available");
        }
        return coreCompetency;
    }

    // Setters:

    public void setName(String name) { this.name = name; }

    public void setEmployer(Employer employer) { this.employer = employer; }

    public void setLocation(Location location) { this.location = location; }

    public void setPositionType(PositionType positionType) { this.positionType = positionType; }

    public void setCoreCompetency(CoreCompetency coreCompetency) { this.coreCompetency = coreCompetency; }

}