package com.project.AIBasedCodeReviewAssistant.Controller;

import com.project.AIBasedCodeReviewAssistant.Models.CodeResponse;
import com.project.AIBasedCodeReviewAssistant.Models.CodeSubmit;
import com.project.AIBasedCodeReviewAssistant.Service.CodeReviewService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;



@RestController
@RequestMapping("/api/review")
@Validated
public class CodeReviewController {
    private final CodeReviewService codeReviewService;

    public CodeReviewController(CodeReviewService codeReviewService) {
        this.codeReviewService = codeReviewService;
    }

    @PostMapping
    public ResponseEntity<CodeResponse> reviewCode(@Valid @RequestBody CodeSubmit submission) {
        List<String> comments = codeReviewService.reviewCode(submission.getCode(), submission.getLanguage());
        return ResponseEntity.ok(new CodeResponse(comments));
    }
}



