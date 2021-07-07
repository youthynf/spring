package com.study.pojo;

import java.util.*;

public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List hobbies;
    private Set games;
    private String wife;
    private Map card;
    private Properties info;

    public Student() {
    }

    public Student(String name, Address address, String[] books, List hobbies, Set games, String wife, Map card, Properties info) {
        this.name = name;
        this.address = address;
        this.books = books;
        this.hobbies = hobbies;
        this.games = games;
        this.wife = wife;
        this.card = card;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    public Set getGames() {
        return games;
    }

    public void setGames(Set games) {
        this.games = games;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public Map getCard() {
        return card;
    }

    public void setCard(Map card) {
        this.card = card;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", books=" + Arrays.toString(books) +
                ", hobbies=" + hobbies +
                ", games=" + games +
                ", wife='" + wife + '\'' +
                ", card=" + card +
                ", info=" + info +
                '}';
    }
}
