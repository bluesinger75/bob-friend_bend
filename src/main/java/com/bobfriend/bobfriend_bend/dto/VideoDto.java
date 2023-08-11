package com.bobfriend.bobfriend_bend.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class VideoDto {
    //필수 매개변수
    /**
     * part 매개변수는 API 응답이 포함하는 video 리소스 속성 하나 이상의 쉼표로 구분된 목록을 지정합니다.
     * 매개변수가 하위 속성을 포함하는 속성을 식별하는 경우 하위 속성이 응답에 포함됩니다.
     * 예를 들어 video 리소스에서 snippet 속성에는 channelId, title, description, tags, categoryId 속성이 포함되어 있습니다.
     * 따라서 part=snippet를 설정하면 API 응답에 이러한 모든 속성이 포함됩니다.
     * 다음 목록에는 매개변수 값에 포함할 수 있는 part 이름이 포함되어 있습니다.
     * contentDetails
     * fileDetails
     * id
     * liveStreamingDetails
     * localizations
     * player
     * processingDetails
     * recordingDetails
     * snippet -> 모든 속성 사용
     * statistics
     * status
     * suggestions
     * topicDetails
     */
    private String part;

    //필터(다음 매개변수 중 하나를 정확하게 지정)
    /**
     * 검색하려는 차트를 식별합니다.
     * mostPopular – 지정된 콘텐츠 지역 및 동영상 카테고리에 대해 가장 인기 있는 동영상을 반환합니다.
     */
    private String chart;
    /**
     * 검색되는 리소스에 대한 YouTube 동영상 ID의 쉼표로 구분된 목록을 지정합니다. video 리소스에서 id 속성은 동영상의 ID를 지정합니다.
     */
    private String id;

    //선택적 매개변수
    /**
     * player.embedHtml 속성에 반환된 삽입된 플레이어의 최대 높이를 지정합니다.
     * 이 매개변수를 사용하여 기본 크기 대신 삽입 코드에서 애플리케이션 레이아웃에 적합한 높이를 사용하도록 지정할 수 있습니다.
     * maxWidth 매개변수도 제공되는 경우 플레이어는 최대 너비를 위반하지 않도록 maxHeight보다 짧을 수 있습니다. 사용 가능한 값: 72~8192
     */
    private int maxHeight;
    /**
     * player.embedHtml 속성에 반환된 삽입된 플레이어의 최대 너비를 지정합니다.
     * 이 매개변수를 사용하여 기본 크기 대신 삽입 코드가 애플리케이션 레이아웃에 적합한 너비를 사용하도록 지정할 수 있습니다.
     * maxHeight 매개변수도 제공되는 경우 최대 높이를 위반하지 않도록 플레이어의 크기가 maxWidth보다 좁아질 수 있습니다. 사용 가능한 값: 72~8192
     */
    private int maxWidth;
    /**
     * 결과 집합에 반환해야 하는 최대 항목 수를 지정합니다.
     * 참고: 이 매개변수는 myRating 매개변수와 함께 사용하도록 지원되지만 id 매개변수와 함께 사용하도록 지원되지는 않습니다. 사용 가능한 값: 1~50 기본값은 5입니다.
     */
    private int maxResults;
    /**
     * 결과 집합에서 반환해야 하는 특정 페이지를 식별합니다.
     * API 응답에서 nextPageToken 및 prevPageToken 속성은 검색할 수 있는 다른 페이지를 식별합니다.
     * 참고: 이 매개변수는 myRating 매개변수와 함께 사용하도록 지원되지만 id 매개변수와 함께 사용하도록 지원되지는 않습니다.
     */
    private String pageToken;
    /**
     * 차트를 검색해야 하는 동영상 카테고리를 식별합니다.
     * 이 매개변수는 chart 매개변수와만 함께 사용할 수 있습니다. 기본적으로 차트는 특정 카테고리로 제한되지 않습니다. 기본값은 0입니다.
     */
    private String videoCategoryId;
    private String title;

    public String setId() {
        return this.getId();
    }


}
