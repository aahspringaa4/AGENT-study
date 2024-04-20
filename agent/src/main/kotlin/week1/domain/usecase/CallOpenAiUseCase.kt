package week1.domain.usecase

import com.aallam.openai.api.model.ModelId
import week1.domain.entity.OpenAIRequest
import week1.domain.repository.OpenAiRepository

class CallOpenAiUseCase(
    private val openAiRepository: OpenAiRepository
) {
    suspend fun executed(model: String, content: String): String {
        val response = openAiRepository.callOpenAi(
            request = OpenAIRequest(
                model = ModelId(model),
                question = content
            )
        )
        return response.answer
    }
}