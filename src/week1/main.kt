package ai.corca.agent_study.week1

import android.os.Build
import androidx.annotation.RequiresApi
import com.theokanning.openai.service.OpenAiService
import kotlinx.coroutines.runBlocking
import java.time.Duration


@RequiresApi(Build.VERSION_CODES.O)
fun main(): Unit = runBlocking {
    val token = System.getenv("OPENAI_TOKEN")
    val service = OpenAiService(token, Duration.ofSeconds(30))

    service
}