package com.example.cicdexample

import org.junit.Assert.assertEquals
import org.junit.Test

class MathHelperTest {

    @Test
    fun `2 plus 2 should equal 4`() {
        val result = MathHelper.add(2, 2)
        assertEquals(4, result)
    }
}
