import com.kata.kataforfun.services.KataForFunService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KataForFunServiceTests {

    private val kataForFunService = KataForFunService()

    @Test
    fun testConvertNumber_NoMatch() {
        val inputNumber = 1
        val expected = "1"
        val result = kataForFunService.convertNumber(inputNumber)
        assertEquals(expected, result)
    }

    @Test
    fun testConvertNumber_Contains3AndDivisibleBy3() {
        val inputNumber = 3
        val expected = "KataKata"
        val result = kataForFunService.convertNumber(inputNumber)
        assertEquals(expected, result)
    }

    @Test
    fun testConvertNumber_Contains5AndDivisibleBy5() {
        val inputNumber = 5
        val expected = "ForFor"
        val result = kataForFunService.convertNumber(inputNumber)
        assertEquals(expected, result)
    }

    @Test
    fun testConvertNumber_Contains7() {
        val inputNumber = 7
        val expected = "Fun"
        val result = kataForFunService.convertNumber(inputNumber)
        assertEquals(expected, result)
    }

    @Test
    fun testConvertNumber_DivisibleBy3() {
        val inputNumber = 9
        val expected = "Kata"
        val result = kataForFunService.convertNumber(inputNumber)
        assertEquals(expected, result)
    }

    @Test
    fun testConvertNumber_DivisibleBy3AndContains5() {
        val inputNumber = 51
        val expected = "KataFor"
        val result = kataForFunService.convertNumber(inputNumber)
        assertEquals(expected, result)
    }

    @Test
    fun testConvertNumber_Contains5AndContains3() {
        val inputNumber = 53
        val expected = "ForKata"
        val result = kataForFunService.convertNumber(inputNumber)
        assertEquals(expected, result)
    }

    @Test
    fun testConvertNumber_DivisibleBy3AndContainsSeveral3() {
        val inputNumber = 33
        val expected = "KataKataKata"
        val result = kataForFunService.convertNumber(inputNumber)
        assertEquals(expected, result)
    }

    @Test
    fun testConvertNumber_DivisibleBy3AndContains7() {
        val inputNumber = 27
        val expected = "KataFun"
        val result = kataForFunService.convertNumber(inputNumber)
        assertEquals(expected, result)
    }

    @Test
    fun testConvertNumber_DivisibleBy3AndDivisibleBy5AndContains5() {
        val inputNumber = 15
        val expected = "KataForFor"
        val result = kataForFunService.convertNumber(inputNumber)
        assertEquals(expected, result)
    }

}
