public class Music {
  static int numberOfSongs;
  String song;
  String artist;
  String album;
  int year;

  Music(String song, String artist, String album, int year){
    this.song = song;
    this.artist = artist;
    this.album = album;
    this.year = year;
    numberOfSongs++;
  }

  public static void getNumberOfSongs() {
    System.out.format("You have %d songs in your collection!", numberOfSongs);
  }

  public String toString() {
    return String.format("\nSong: %s\nArtist: %s\nAlbum: %s\nYear: %d",
            this.song, this.artist, this.album, this.year);
  }
}
