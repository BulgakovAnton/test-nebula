package com.jetbrains.nebula

/**
 * Имитация движка рендеринга (nebula)
 */
class RenderEngine {

    fun render(input: String): String {
        if (input.isBlank()) return ""
        return "<rendered>$input</rendered>"
    }

    fun renderWithTemplate(input: String, template: String): String {
        if (input.isBlank()) return ""
        return template.replace("{content}", input)
    }

    fun validate(input: String): Boolean {
        return input.isNotBlank() && input.length <= 10000
    }
}
