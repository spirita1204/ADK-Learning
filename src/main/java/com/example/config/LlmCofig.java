package com.example.config;

import com.google.adk.models.langchain4j.LangChain4j;
import dev.langchain4j.model.openai.OpenAiChatModel;

/**
 * Configuration class for setting up Language Model (LLM) using LangChain4j.
 * This class configures a local Ollama model to be used with the agent.
 */
public class LlmCofig {
  
  /**
   * Creates and returns a LangChain4j model instance configured for local Ollama.
   * 
   * @return LangChain4j model with OpenAI-compatible configuration
   */
  public LangChain4j createModel() {
     return new LangChain4j(OpenAiChatModel.builder()
         .baseUrl("http://localhost:11434/v1")  // Local Ollama server endpoint
         .modelName("llama3.2:1b")              // Specific model version
         .temperature(0.3)                     // Low temperature for more deterministic responses
         .build());
  }
}
