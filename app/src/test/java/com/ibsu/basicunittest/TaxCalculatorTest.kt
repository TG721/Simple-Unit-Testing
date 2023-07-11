package com.ibsu.basicunittest

import org.junit.Assert.*
import org.junit.Test

internal class TaxCalculatorTest {
    private val classUnderTest = TaxCalculator()

    @Test
    fun `validate tax calculation`(){
        val result = classUnderTest.calculateTax(1200.0)
        assertEquals(120.0, result, 0.001)
    }
}