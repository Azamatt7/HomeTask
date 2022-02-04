package Peaksoft;

public class Main {

    public static void main(String[] args) {

        Parrot parrot = new Parrot();
        parrot.setName("Billy");
        parrot.setSpecies("AfricanGrey");
        parrot.setColour("Grey");
        parrot.setVocabulary(200);
        parrot.setAge((byte)5);
        parrot.setLifespan((byte)50);
        parrot.setHeight((float)35.40);
        parrot.setWeight((float)400);


        Fish trout = new Fish();
        trout.setName("Trout");
        trout.setFishBreed("Salmon");
        trout.setColour("Greyish");
        trout.setWeight((float) 5.5);
        trout.setLength((float) 35.8);
        trout.setLifespan((byte)11);


        Dog dog =  new Dog();
        dog.setName("Graf");
        dog.setColour("Black");
        dog.setGender("Male");
        dog.setAge((byte)1);
        dog.setDogBreed("Taigan");
        dog.setWeight((float) 10.2);
        dog.setHeight((float) 60);

        Cat cat = new Cat();
        cat.setName("Murka");
        cat.setAge((byte)5);
        cat.setCatBreed("Sphynx");
        cat.setWeight((float) 1.5);
        cat.setHeight((float) 15.4);
        cat.setLength((float) 55.3);
        cat.setColour("White");

        parrot.showInfo();
        System.out.println();
        trout.showInfo();
        System.out.println();
        dog.showInfo();
        System.out.println();
        cat.showInfo();



    }
}
