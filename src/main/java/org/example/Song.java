package org.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Song {

    @Id
    private int id;
    private String songName;
    @Column(name = "artist")
    private String singer;

    public Song() {
    }

    public Song(String songName, String singer) {
        this.songName = songName;
        this.singer = singer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}
