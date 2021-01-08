package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
        this.members = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void addMember(String nameOfMember) {
        members.add(nameOfMember);
    }

    public void removeMember(String nameOfMember) {
        if (members.contains(nameOfMember)) {
            members.remove(nameOfMember);
        } else {
            System.out.println("There is no such member in the band");
        }
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        band1.getMembers().addAll(band2.getMembers());
    }

    public void printMembers() {
        members.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
