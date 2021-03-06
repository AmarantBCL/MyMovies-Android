package com.example.android.mymovies.data;

public class Trailer {
    private String name;
    private String videoKey;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVideoKey() {
        return videoKey;
    }

    public void setVideoKey(String videoKey) {
        this.videoKey = videoKey;
    }

    public Trailer(String name, String videoKey) {
        this.name = name;
        this.videoKey = videoKey;
    }
}
