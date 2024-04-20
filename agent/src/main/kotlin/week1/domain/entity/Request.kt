package week1.domain.entity

import com.aallam.openai.api.model.ModelId

data class OpenAIRequest(
    val model: ModelId,
    val question: String
)
