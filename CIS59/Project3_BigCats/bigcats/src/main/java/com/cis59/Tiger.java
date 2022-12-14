package com.cis59;

public class Tiger extends Panthera {

    // constructor
    public Tiger(String name) {

        // call the super-class (parent) to instatiate it
        super(name);

        // initialize attributes
        this.setSpecies("tiger");

    }

    // serializes attributes into a string
    @Override // override superclass method
    public String toString() {
        String s;

        // since the object is complex, we return a JSON formatted string
        s = "{ ";
        s += "name: " + name();
        s += ", ";
        s += "species: " + species();
        s += ", ";
        s += "longitude: " + longitude();
        s += ", ";
        s += "latitude: " + latitude();
        s += ", ";
        s += "fur: " + fur();
        s += ", ";
        s += "weight: " + getWeight();
        s += ", ";
        s += "speed: " + getSpeed();
        s += " }";

        return s;

    }

    // function returns fur type unique to Tiger
    public String fur() {
        return "stripes";
    }

}
