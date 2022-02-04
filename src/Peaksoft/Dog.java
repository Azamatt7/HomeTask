package Peaksoft;

public class Dog {
    private String name;
    private String colour;
    private String gender;
    private byte age;
    private String dogBreed;
    private float weight;
    private float height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.matches("[A-Za-z0-9]*")) {
            System.out.println("invalid name ["+ name +"]");
        } else
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        if (!colour.matches("[A-Za-z0-9]*")) {
            System.out.println("invalid colour ["+ colour +"]");
        }
        this.colour = colour;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (!gender.matches("[A-Za-z0-9]*")) {
            System.out.println("invalid gender ["+ gender +"]");
        } else
        this.gender = gender;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if (age <= 0) {
            System.out.println("invalid age ["+ age +"]");
        } else
        this.age = age;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        if (!dogBreed.matches("[A-Za-z0-9]*")) {
            System.out.println("invalid dogbreed ["+ dogBreed +"]");
        } else
        this.dogBreed = dogBreed;
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

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if (height <= 0) {
            System.out.println("invalid height ["+ height +"]");
        } else
        this.height = height;
    }
    public void showInfo() {
        System.out.printf("Dog info : \n " + """
                Dog name : %s 
                Dog colour : %s 
                Dog gender : %s 
                Dog age : %d year
                Dog breed : %s 
                Dog weight : %f kg
                Dog height : %f cm \n""", name,colour,gender,age,dogBreed,weight,height);
    }
}
