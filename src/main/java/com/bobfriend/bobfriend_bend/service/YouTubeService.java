package com.bobfriend.bobfriend_bend.service;

import com.bobfriend.bobfriend_bend.dto.ItemsDto;

import java.util.List;
public interface YouTubeService {

    List<ItemsDto> getPopularVideos(int maxResults);
}
