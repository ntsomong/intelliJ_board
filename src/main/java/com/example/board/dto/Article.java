package com.example.board.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    private int id;
    private String regDate;
    private String title;
    private String body;

    public String getBodyForPrint() {
        return body.replaceAll("\n", "<br>");
    }
}