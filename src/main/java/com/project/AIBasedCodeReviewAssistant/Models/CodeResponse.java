package com.project.AIBasedCodeReviewAssistant.Models;



import java.util.List;

public class CodeResponse {
    private List<String> comment;

    public List<String> getComment() {
        return comment;
    }

    public void setComment(List<String> comment) {
        this.comment = comment;
    }

    public CodeResponse(List<String> comment) {
        this.comment = comment;
    }




}

