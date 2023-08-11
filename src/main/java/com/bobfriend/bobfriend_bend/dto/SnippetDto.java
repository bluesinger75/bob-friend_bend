package com.bobfriend.bobfriend_bend.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SnippetDto {
    private String publishedAt;
    private String channelId;
    private String title;
//    private String description;
    private ThumbnailsDto thumbnails;
    private String channelTitle;
//    private String defaultAudioLanguage;
}
