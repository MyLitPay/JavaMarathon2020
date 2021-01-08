package day12.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Band1", 1990);
        MusicBand band2 = new MusicBand("Band2", 2015);
        MusicBand band3 = new MusicBand("Band3", 2004);
        MusicBand band4 = new MusicBand("Band4", 2001);
        MusicBand band5 = new MusicBand("Band5", 1975);
        MusicBand band6 = new MusicBand("Band6", 1986);
        MusicBand band7 = new MusicBand("Band7", 2019);
        MusicBand band8 = new MusicBand("Band8", 1812);
        MusicBand band9 = new MusicBand("Band9", 1970);
        MusicBand band10 = new MusicBand("Band10", 2007);

        List<MusicBand> list = new ArrayList<>();
        list.add(band1);
        list.add(band2);
        list.add(band3);
        list.add(band4);
        list.add(band5);
        list.add(band6);
        list.add(band7);
        list.add(band8);
        list.add(band9);
        list.add(band10);

        List<MusicBand> after2000 = groupsAfter2000(list);

        System.out.println(list);
        System.out.println(after2000);
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        return bands.stream().filter(b -> b.getYear() > 2000)
                .collect(Collectors.toList());
    }
}
