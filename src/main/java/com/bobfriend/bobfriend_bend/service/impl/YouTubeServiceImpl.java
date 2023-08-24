package com.bobfriend.bobfriend_bend.service.impl;

import com.bobfriend.bobfriend_bend.dto.ItemsDto;
import com.bobfriend.bobfriend_bend.service.YouTubeService;
import com.bobfriend.bobfriend_bend.util.YouTubeApiResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
@Service
public class YouTubeServiceImpl implements YouTubeService {

    @Value("${youtube.api.key}")
    private String API_KEY;

    @Value("${youtube.api.url}")
    private String API_URL;

    @Override
    public List<ItemsDto> getPopularVideos(int maxResults, Long id) {
        RestTemplate restTemplate = new RestTemplate();
        String url = API_URL + "?part=snippet&chart=mostPopular&regionCode=kr&maxResults=" + maxResults + "&videoCategoryId=" + id + "&key=" + API_KEY;

        ResponseEntity<YouTubeApiResponse> responseEntity = restTemplate.getForEntity(url, YouTubeApiResponse.class);
        YouTubeApiResponse apiResponse = responseEntity.getBody();

        if (apiResponse != null) {
            return apiResponse.getItems();
        }

        return Collections.emptyList();
    }
}
