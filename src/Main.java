public class Main {
  public static void main(String [] args) {
    Music mySong1 = new Music("I want you", "The Beatles", "Abbey Road", 1969);
    Music mySong2 = new Music("Everything's ruined", "Faith no more", "Angel Dust", 1990);
    Music mySong3 = new Music("99 Luftballons", "Nena", "Nur geträumt", 1982);
    System.out.println(mySong1.toString());
    System.out.println(mySong2);
    Music.getNumberOfSongs();
  }
}
