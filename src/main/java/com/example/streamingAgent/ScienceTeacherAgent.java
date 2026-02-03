package com.example.streamingAgent;

import com.example.config.LlmCofig;
import com.google.adk.agents.BaseAgent;
import com.google.adk.agents.LlmAgent;

/** Science teacher agent. */
public class ScienceTeacherAgent {

  public static final BaseAgent ROOT_AGENT = initAgent();

  public static BaseAgent initAgent() {
    LlmCofig llmConfig = new LlmCofig();
    return LlmAgent.builder()
        .name("science-app")
        .description("Science teacher agent")
        // live api
        .model("gemini-2.5-flash-native-audio-preview-12-2025") 
        .instruction("""
            You are a helpful science teacher that explains
            science concepts to kids and teenagers.
            """)
        .build();
  }
}