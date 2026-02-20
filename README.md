# Google ADK Java Learning Project

這是一個學習 Google Agent Development Kit (ADK) 的 Java 專案，主要實作官網範例來了解如何構建 AI 智慧代理。

## 專案目的

本專案旨在：
- 學習 Google ADK 的核心概念和 API 使用
- 實作官方範例以掌握代理開發技巧
- 探索不同類型的代理應用場景
- 整合本地 LLM（如 Ollama）進行開發

## 專案結構

```
src/main/java/com/example/
├── config/
│   └── LlmCofig.java               # LLM 配置類別，支援本地 Ollama
├── agent/
│   ├── HelloTimeAgent.java         # 基礎時間查詢代理
│   └── AgentCliRunner.java         # CLI 執行環境
├── llmAgent/
│   └── LlmAgentExample.java        # 基礎 LLM 代理範例
├── multitoolAgent/
│   └── MultiToolAgent.java         # 多工具整合代理
├── streamingAgent/
│   ├── ScienceTeacherAgent.java    # 科學教師代理（串流支援）
│   └── tools/
│       └── LiveAudioRun.java       # 音訊處理工具
├── workFlowAgent/
│   ├── SequentialAgentExample.java  # 順序執行工作流程
│   ├── ParallelResearchPipeline.java # 平行研究管線
│   └── LoopAgentExample.java        # 迴圈執行代理範例
├── customAgent/
│   └── StoryFlowAgentExample.java  # 自定義故事流程代理
├── customTools/
│   ├── CustomerSupportAgentApp.java  # 客服代理範例
│   ├── LongRunningFunctionExample.java # 長時運行函式範例
│   └── WeatherSentimentAgentApp.java  # 天氣情感分析代理
└── mcp/
    └── McpAgentCreator.java        # MCP 代理創建器
```

## 功能特色

### 1. 本地 LLM 整合
- 支援 Ollama 本地模型（llama3.2:1b）
- 可輕鬆切換雲端和本地模型
- 使用 LangChain4j 作為橋接層

### 2. 多種代理類型
- **HelloTimeAgent**: 基礎時間查詢代理
- **LlmAgentExample**: 基礎 LLM 代理示範
- **MultiToolAgent**: 具備多種工具能力的代理
- **ScienceTeacherAgent**: 科學教學專用代理，支援串流輸出
- **SequentialAgentExample**: 順序執行工作流程代理
- **ParallelResearchPipeline**: 平行任務處理管線
- **LoopAgentExample**: 迴圈執行模式代理
- **StoryFlowAgentExample**: 多階段故事生成流程代理
- **CustomerSupportAgentApp**: 客服支援代理範例
- **WeatherSentimentAgentApp**: 天氣情感分析代理
- **McpAgentCreator**: MCP 協議代理創建器

### 3. 開發工具整合
- 內建 Dev UI 介面用於除錯
- CLI 執行環境
- 完整的 Maven 建置設定

## 環境需求

- Java 17+
- Maven 3.6+
- Ollama（如需使用本地模型）

## 快速開始

### 1. 安裝依賴
```bash
mvn clean install
```

### 2. 啟動本地 Ollama（可選）
```bash
ollama serve
ollama pull llama3.2:1b
```

### 3. 執行代理
```bash
# 執行基礎代理
mvn exec:java -Dexec.mainClass="com.example.agent.AgentCliRunner"

# 或使用 Dev UI 進行除錯
mvn exec:java -Dexec.mainClass="com.example.multitoolAgent.MultiToolAgent"
```

## 學習重點

### Google ADK 核心概念
- **Agent**: 基本代理類別
- **LlmAgent**: 語言模型代理
- **Tool**: 代理可使用的工具
- **Session**: 對話會話管理
- **Runner**: 代理執行環境

### 實作範例
1. **基礎代理配置**: 設定代理名稱、描述和指令
2. **工具整合**: 加入時間查詢、天氣預報等工具
3. **模型配置**: 切換 Gemini 和本地 Ollama 模型
4. **串流處理**: 實作即時回應功能

## 參考資源

- [Google ADK 官方文件](https://github.com/google/adk)
- [LangChain4j 文件](https://docs.langchain4j.dev/)
- [Ollama 官網](https://ollama.ai/)

## 授權

本專案僅供學習使用。