package ru.job4j.oop;

public class Student {
    public void sing() {
        System.out.println("i believe i can fly");
    }

    public void music() {
        System.out.println("Tra tra tra");
    }

    public void music(String lyrics) {
        System.out.println("I can sing a song : " + lyrics);
    }

    public static void main(String[] args) {
        Student petya = new Student();
        String song = "i believe i can fly";
        petya.music();
        petya.music();
        petya.music();
        petya.sing();
        petya.sing();
        petya.sing();
        petya.music(song);
    }
}
