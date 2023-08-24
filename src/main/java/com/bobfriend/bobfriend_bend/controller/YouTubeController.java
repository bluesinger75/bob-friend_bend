package com.bobfriend.bobfriend_bend.controller;


import com.bobfriend.bobfriend_bend.dto.ItemsDto;
import com.bobfriend.bobfriend_bend.service.YouTubeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class YouTubeController {

    private final YouTubeService youTubeService;
    @GetMapping("/api/youtube-lists/{id}")
    public List<ItemsDto> youTubeVideoLists(@PathVariable Long id) {
        //TODO maxResults 파라미터 하드코딩
        return youTubeService.getPopularVideos(50, id);
    }
}
