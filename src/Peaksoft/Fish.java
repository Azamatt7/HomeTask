package Peaksoft;

public class Fish {
    private String name;
    private String fishBreed;
    private String colour;
    private float weight;
    private float length;
    private byte lifespan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.matches("[A-Za-z0-9]*")) {
            System.out.println("invalid name [" + name + "]");
        } else
        this.name = name;
    }

    public String getFishBreed() {
        return fishBreed;
    }

    public void setFishBreed(String fishBreed) {
        if (!fishBreed.matches("[A-Za-z0-9]*")) {
            System.out.println("invalid fish breed ["+fishBreed+"]");
        } else
        this.fishBreed = fishBreed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        if (!colour.matches("[A-Za-z0-9]*")){
            System.out.println("invalid colour ["+ colour +"]");
        } else
        this.colour = colour;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight <= 0) {
            System.out.println("invalid weight ["+ weight +"]");
        } else
        this.weight = weight;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if (length <= 0) {
            System.out.println("invalid length ["+ length +"]");
        } else
        this.length = length;

    }

    public byte getLifespan() {
        return lifespan;
    }

    public void setLifespan(byte lifespan) {
        if (lifespan <= 0) {
            System.out.println("invalid lifespan ["+ lifespan +"]");
        }
        this.lifespan = lifespan;
    }

    public void showInfo() {
        System.out.printf(" Fish info : \n" + """
                Fish name : %s 
                Fish breed : %s  
                Fish colour : %s 
                Fish weight : %f kg  
                Fish length : %f cm  
                Fish lifespan : %d years \n """,
                name, fishBreed, colour, weight, length, lifespan);
    }
}
