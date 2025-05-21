package com.pluralsight.streams;

import java.util.ArrayList;

import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    static ArrayList<Person> people = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


        people.add(new Person("Anna", "Zerkle", 29));
        people.add(new Person("Caroline", "Zerkle", 27));
        people.add(new Person("Roman", "Zanotelli", 25));
        people.add(new Person("Topher", "Carter", 8000));
        people.add(new Person("Helena", "Eagen", 27));
        people.add(new Person("Berkcan", "Emre", 30));
        people.add(new Person("Sophia", "Elasmar", 23));
        people.add(new Person("Bee", "Zerkle", 5));
        people.add(new Person("Ethan", "O'Toole", 25));
        people.add(new Person("Michael", "Zerkle", 62));



        System.out.println(getYoungestPerson(people));
        System.out.println(getLastName(people));
        System.out.println(getaverageAge(people));
    }
    public static ArrayList<Person> getFirstName(ArrayList<Person> people){
        System.out.print("Please enter the First Name you would like to find: ");
        String firstName = input.nextLine();
        input.nextLine();
        return people.stream().filter(person -> person.getFirstName().equals(firstName)).collect(Collectors.toCollection(ArrayList::new));
    }
    public static ArrayList<Person> getLastName(ArrayList<Person> people){
        System.out.print("Please enter the last Name you would like to find: ");
        String lastName = input.nextLine();
        input.nextLine();
        return people.stream().filter(person -> person.getLastName().equals(lastName)).collect(Collectors.toCollection(ArrayList::new));
    }
    public static double getaverageAge(ArrayList<Person> people){
        return people.stream().mapToDouble(Person::getAge).average().getAsDouble();
    }
    public static double getOldestPerson(ArrayList<Person> people){
        return people.stream().mapToDouble(Person::getAge).max().getAsDouble();
    }
    public static double getYoungestPerson(ArrayList<Person> people){
        return people.stream().mapToDouble(Person::getAge).min().getAsDouble();
    }

}
