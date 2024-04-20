package week1.domain.repository

import week1.domain.entity.OpenAIRequest
import week1.domain.entity.OpenAIResponse

interface OpenAiRepository {
    suspend fun callOpenAi(request: OpenAIRequest): OpenAIResponse
}