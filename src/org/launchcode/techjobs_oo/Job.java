package org.launchcode.techjobs_oo;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public String toString() {
        String employer = this.getEmployer().getValue().equals("") ? "Data not available" : this.getEmployer().getValue();
        String location = this.getLocation().getValue().equals("") ? "Data not available" : this.getLocation().getValue();
        String positionType = this.getPositionType().getValue().equals("") ? "Data not available" : this.getPositionType().getValue();
        String coreCompetency = this.getCoreCompetency().getValue().equals("") ? "Data not available" : this.getCoreCompetency().getValue();
        return "\nID: " + this.getId() + "\n" +
                "name: '" + name + "\n" +
                "employer: " + employer + "\n" +
                "location: " + location + "\n" +
                "positionType: " + positionType + "\n" +
                "coreCompetency: " + coreCompetency + "\n";
    }

    @Override
    public int hashCode () {
        return Objects.hash(getId());
    }


}