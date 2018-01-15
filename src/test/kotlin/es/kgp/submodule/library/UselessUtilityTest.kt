package es.kgp.submodule.library

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UselessUtilityTest {

    @Test
    fun `doSomething should do something`() {
        assertEquals("Ey!!! I'm doing something...", UselessUtility().doSomething())
    }

}
