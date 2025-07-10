package com.project.AIBasedCodeReviewAssistant.Models;

import jakarta.validation.constraints.NotBlank;


import jakarta.validation.constraints.NotBlank;

    public class CodeSubmit {
        @NotBlank
        private String code;
        @NotBlank
        private String language;

        public void setCode(String code) {
            this.code = code;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getCode() {
            return code;
        }

        public String getLanguage() {
            return language;
        }



    }


