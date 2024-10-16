package com.example
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MathTest {

    @Test
    fun add() {
        val math = Math()
        assertEquals(4, math.add(2, 2))
    }
}