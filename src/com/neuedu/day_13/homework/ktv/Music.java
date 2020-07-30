package com.neuedu.day_13.homework.ktv;

import java.util.Objects;

public class Music {
    private String name;
    private String singer;

    public Music(String name, String singer) {
        this.name = name;
        this.singer = singer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Music music = (Music) o;
        return Objects.equals(name, music.name) &&
                Objects.equals(singer, music.singer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, singer);
    }
}
