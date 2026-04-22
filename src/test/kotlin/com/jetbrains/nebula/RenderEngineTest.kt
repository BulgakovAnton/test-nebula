package com.jetbrains.nebula

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class RenderEngineTest {

    private val engine = RenderEngine()

    @Test
    fun `render returns wrapped content`() {
        val result = engine.render("hello")
        assertEquals("<rendered>hello</rendered>", result)
    }

    @Test
    fun `render returns empty string for blank input`() {
        val result = engine.render("")
        assertEquals("", result)
    }

    @Test
    fun `renderWithTemplate replaces content placeholder`() {
        val result = engine.renderWithTemplate("world", "<div>{content}</div>")
        assertEquals("<div>world</div>", result)
    }

    @Test
    fun `validate returns true for valid input`() {
        assertTrue(engine.validate("hello world"))
    }

    @Test
    fun `validate returns false for blank input`() {
        assertFalse(engine.validate(""))
        assertFalse(engine.validate("   "))
    }

    @Test
    fun `validate returns false for too long input`() {
        val longInput = "a".repeat(10001)
        assertFalse(engine.validate(longInput))
    }
}
