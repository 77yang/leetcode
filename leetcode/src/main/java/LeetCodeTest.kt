import com.yang7.LongestPalindromicSubstring
import com.yang7.ReverseInteger
import com.yang7.ZigZagConversion
import org.junit.jupiter.api.Test

class LeetCodeTest {

    @Test
    fun longestPalindromicSubstring() {


        val s = LongestPalindromicSubstring()
        println(s.longestPalindrome("babad"))
        println(s.longestPalindrome("cbbd"))
    }

    @Test
    fun reverseInteger() {
        println(ReverseInteger().reverse(123))
        println(ReverseInteger().reverse(
                -1463847412))// -2147483641
    }

    @Test
    fun zigZagConversion() {
        println(ZigZagConversion.convert("test",1))

    }
}
