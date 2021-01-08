package day12.task5;

public class Task5 {
    public static void main(String[] args) {
        MusicBand cobhc = new MusicBand("Children of Bodom", 1993);
        MusicBand nightwish = new MusicBand("Nightwish", 1996);

        cobhc.addMember(new MusicArtist("Alexi Laiho", 40));
        cobhc.addMember(new MusicArtist("Jaska Raatikainen", 38));
        cobhc.addMember(new MusicArtist("Janne Wirman", 37));
        cobhc.addMember(new MusicArtist("Henkka T. Blacksmith", 36));
        cobhc.addMember(new MusicArtist("Roope Latvala", 54));

        nightwish.addMember(new MusicArtist("Tuomas Holopainen", 35));
        nightwish.addMember(new MusicArtist("Emppu Vuorinen", 37));
        nightwish.addMember(new MusicArtist("Marco Hietala", 50));
        nightwish.addMember(new MusicArtist("Jukka Nevalainen", 43));
        nightwish.addMember(new MusicArtist("Tarja Turunen", 34));

        MusicBand.transferMembers(cobhc, nightwish);
        cobhc.printMembers();
    }
}
