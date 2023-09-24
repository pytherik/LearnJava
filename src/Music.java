public class Music {
  String song;
  String artist;
  String album;
  int year;

  Music(String song, String artist, String album, int year){
    this.song = song;
    this.artist = artist;
    this.album = album;
    this.year = year;
  }

  public String toString() {
    return String.format("\nSong: %s\nArtist: %s\nAlbum: %s\nYear: %d",
            this.song, this.artist, this.album, this.year);
  }
}
