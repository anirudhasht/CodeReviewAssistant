package com.project.AIBasedCodeReviewAssistant.Service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;



import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
    @Service
    public class CodeReviewService {

        private final ChatClient chatclient;

        public CodeReviewService(ChatClient.Builder chatclientbuilder) {
            this.chatclient = chatclientbuilder.build();
        }
        public List<String> reviewCode(String code, String language){
            String prompt="Take a deep breath ,think deeply and then review the following code"+code+"which is in language"+language+"give comments and fixes to be done as if you are the most intelligent software engineer";
            String ans=chatclient.prompt()
                    .user(prompt)
                    .call()
                    .content();
            return Arrays.asList(ans.split("\\r?\\n"));
        }
    }


