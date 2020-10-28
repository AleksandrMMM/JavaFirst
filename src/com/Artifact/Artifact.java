package com.Artifact;

public class Artifact {
    int number;
    String culture;
    int age;
    public Artifact(int number){
        this.number = number;
    }
    public Artifact(int number, String culture){
        this.number = number;
        this.culture = culture;

    }
    public Artifact(int number, String culture, int age){
        this.number = number;
        this.culture = culture;
        this.age = age;
    }

    public static void main(String[] args) {
        Artifact art1 = new Artifact(1);
        Artifact art2 = new Artifact(1, "actec");
        Artifact art3 = new Artifact(1, "apache", 18);
        System.out.println(art1.number);
        System.out.println(art2.culture);



    }
}
