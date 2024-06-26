package week1.domain.util

import kotlinx.serialization.json.*

fun JsonObject.parseJsonToMap() : Map<String, String> {
    return this.mapValues { entry ->
        when (val element = entry.value) {
            is JsonPrimitive -> element.content
            is JsonArray -> {
                if (element.isNotEmpty()) {
                    element.filterIsInstance<JsonPrimitive>().joinToString(separator = ", ") { it.content }
                } else {
                    throw IllegalArgumentException("Expected a JsonPrimitive in array for ${entry.key}")
                }
            }
            else -> throw IllegalArgumentException("Expected a JsonPrimitive for ${entry.key}")
        }
    }
}