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

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
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

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        if (name.isEmpty() || name.equals(" ")){
            return "Data not available";
        } else {
            return name;
        }
    }

    public Employer getEmployer() {
        if(employer.getValue() == null || employer.getValue().equals("")){
            employer.setValue("Data not available");
            return employer;
        }
        else {
            return employer;
        }
    }

    public Location getLocation() {
        if(location.getValue() == null || location.getValue().equals("")){
            location.setValue("Data not available");
            return location;
        }
        else {
            return location;
        }
    }

    public PositionType getPositionType() {
        if(positionType.getValue() == null || positionType.getValue().equals("")){
            positionType.setValue("Data not available");
            return positionType;
        }
        else {
            return positionType;
        }
    }

    public CoreCompetency getCoreCompetency() {
        if(coreCompetency.getValue() == null || coreCompetency.getValue().equals("")){
            coreCompetency.setValue("Data not available");
            return coreCompetency;
        }
        else {
            return coreCompetency;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        return  "\n" +
                "ID: " + this.getId() + "\n" +
                "Name: " + this.getName() + "\n" +
                "Employer: " + this.getEmployer() + "\n" +
                "Location: " + this.getLocation() + "\n" +
                "Position Type: " + this.getPositionType() + "\n" +
                "Core Competency: " + this.getCoreCompetency() + "\n";
    }
}
