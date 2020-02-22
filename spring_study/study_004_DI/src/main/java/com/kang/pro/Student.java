package com.kang.pro;
import java.util.*;

public class Student {

    private String name;
    private Address address;
    private String[] books;
    private List<String> hobbies;
    private Set<String> games;
    private Map<String,String> card;
    private Properties info;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address.toString()+
                ", books=" + Arrays.toString(books) +
                ", hobbies=" + hobbies +
                ", games=" + games +
                ", card=" + card +
                ", info=" + info +
                ", wife='" + wife + '\'' +
                '}';
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    private String wife;
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

    public List<String> getHobbys() {
        return hobbies;
    }

    public void setHobbys(List<String> hobbys) {
        this.hobbies = hobbys;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

}
