package day12.task4;

public class Task4 {
    public static void main(String[] args) {
        MusicBand cobhc = new MusicBand("Children of Bodom", 1993);
        MusicBand nightwish = new MusicBand("Nightwish", 1996);

        cobhc.addMember("Alexi Laiho");
        cobhc.addMember("Jaska Raatikainen");
        cobhc.addMember("Janne Wirman");
        cobhc.addMember("Henkka T. Blacksmith");
        cobhc.addMember("Roope Latvala");

        nightwish.addMember("Tuomas Holopainen");
        nightwish.addMember("Emppu Vuorinen");
        nightwish.addMember("Marco Hietala");
        nightwish.addMember("Jukka Nevalainen");
        nightwish.addMember("Tarja Turunen");

        MusicBand.transferMembers(cobhc, nightwish);
        cobhc.printMembers();
    }
}
