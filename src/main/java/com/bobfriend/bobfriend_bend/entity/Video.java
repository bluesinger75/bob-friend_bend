package com.bobfriend.bobfriend_bend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Video {
    @Id
    @GeneratedValue
    @Column(name = "video_id")
    private String id;


    private String title;

    public String setTitle(String title) {
        return this.title = title;
    }
    public String setVideoId(String id) {
        return this.id = id;
    }
}
