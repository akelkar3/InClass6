package com.mad.homeworkgroup20.inclass6;

/**
 * Created by Aliandro on 2/19/2018.
 */

public class NewsItem {
String title,description,urlToImage, publishedAt;

    @Override
    public String toString() {
        return "NewsItem{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", urlToImage='" + urlToImage + '\'' +
                ", publishedAt='" + publishedAt + '\'' +
                '}';
    }
}
