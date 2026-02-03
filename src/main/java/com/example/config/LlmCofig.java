package com.example.config;

import com.google.adk.models.langchain4j.LangChain4j;
import dev.langchain4j.model.openai.OpenAiChatModel;

public class LlmCofig {
  
  public LangChain4j createModel() {
     return new LangChain4j(OpenAiChatModel.builder()
         .baseUrl("http://localhost:11434/v1")
         .modelName("llama3.2:1b")
         .temperature(0.3)
         .build());
  }
}
