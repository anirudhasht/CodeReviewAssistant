package com.project.AIBasedCodeReviewAssistant.Service;


import com.project.AIBasedCodeReviewAssistant.Service.CodeReviewService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


    @SpringBootTest
    class CodeReviewServiceTests {

        @Autowired
        private CodeReviewService codeReviewService;

        @Test
        void testGenerateReviewComments_withValidCode() {
            String code = "public class HelloWorld { public static void main(String[] args) {} }";
            List<String> comments = codeReviewService.reviewCode(code,"java"); assertNotNull(comments);
            assertFalse(comments.isEmpty(), "Review comments should not be empty.");
        }

        @Test
        void testGenerateReviewComments_withEmptyInput() {
            String code = "";
            List<String> comments = codeReviewService.reviewCode(code,"null");

            assertTrue(comments.isEmpty(), "Empty input should return empty comments.");
        }
    }

