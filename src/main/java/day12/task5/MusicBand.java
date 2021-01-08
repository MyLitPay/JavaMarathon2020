package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

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

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void addMember(MusicArtist member) {
        members.add(member);
    }

    public void removeMember(MusicArtist member) {
        if (members.contains(member)) {
            members.remove(member);
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
