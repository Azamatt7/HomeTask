package Peaksoft;

public class Parrot {
    private String name;
    private String species;
    private String colour;
    private int vocabulary;
    private byte age;
    private byte lifespan;
    private float height;
    private float weight;

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if (age <= 0) {
            System.out.println("invalid age ["+ age +"]");
        } else
        this.age = age;
    }

    public byte getLifespan() {
        return lifespan;
    }

    public void setLifespan(byte lifespan) {
        if (lifespan <= 0) {
            System.out.println("invalid lifespan ["+ lifespan +"]");
        } else
        this.lifespan = lifespan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.matches("[A-Za-z0-9]*")) {
            System.out.println("invalid name ["+ name +"]");
        } else
            this.name = name;
    }



    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        if (!species.matches("[A-Za-z0-9]*")){
            System.out.println("invalid species["+ species +"]");
        } else
        this.species = species;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        if (!colour.matches("[A-Za-z0-9]*")){
            System.out.println("invalid colour["+ colour +"]");
        } else
        this.colour = colour;
    }
    public int getVocabulary() {
        return vocabulary;
    }
    public void setVocabulary(int vocabulary) {
        if (vocabulary <= 0) {
            System.out.println("invalid vocabulary["+ vocabulary +"]");
        } else
            this.vocabulary = vocabulary;
    }


    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if (height <= 0) {
            System.out.println("invalid height ["+ height +"]");
    } else
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight<=0) {
            System.out.println("invalid weight ["+ weight +"]");
        } else
        this.weight = weight;
    }

    public void showInfo() {
     System.out.printf("Parrot info : \n" + """
             Parrot name : %s 
             Parrot species : %s 
             Parrot colour : %s   
             Parrot vocabulary : %d words  
             Parrot age : %d  
             Parrot lifespan : %d years
             Parrot height : %f cm  
             Parrot weight : %f  grm \n""",
             name, species, colour, vocabulary, age, lifespan, height, weight);
 }
}
