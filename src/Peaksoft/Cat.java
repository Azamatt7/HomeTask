package Peaksoft;

public class Cat {
    private String name;
    private byte age;
    private String catBreed;
    private String colour;
    private float weight;
    private float height;
    private float length;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.matches("[A-Za-z0-9]*")) {
            System.out.println("invalid name ["+ name +"]");
        } else
        this.name = name;
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

    public String getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(String catBreed) {
        if (!catBreed.matches("[A-Za-z0-9]*")) {
            System.out.println("invalid catbreed ["+ catBreed +"]");
        } else
        this.catBreed = catBreed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        if (!colour.matches("[A-Za-z0-9]*")) {
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

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if (height <= 0) {
            System.out.println("invalid height ["+ height +"]");
        } else
        this.height = height;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if (length <= 0) {
            System.out.println("invalid length ["+ length +"]");
        }
        this.length = length;
    }
    public void showInfo() {
        System.out.printf("Cat info : \n " + """
                Cat name : %s 
                Cat age : %d year
                CatBreed : %s 
                Cat colour : %s 
                Cat weight : %f kg
                Cat height : %f cm
                cat length : %f cm \n """,
                name,age,catBreed,colour,weight,height,length);
    }
}
