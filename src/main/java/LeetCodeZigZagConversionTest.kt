import com.yang7.*
import org.junit.jupiter.api.Test

class LeetCodeZigZagConversionTest {

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

        var message = ZigZagConversion().convert("PAYPALISHIRING", 4)
        println("$message  ${message == "PINALSIGYAHRPI"}")


        message = ZigZagConversion().convert("PAYPALISHIRING", 3)
        println("$message  ${message == "PAHNAPLSIIGYIR"}")


    }


    @Test
    fun  stringtoInteger(){
        println(StringtoInteger.myAtoi("   -42"))
        println(StringtoInteger.myAtoi(" "))
        println(StringtoInteger.myAtoi("+-2"))
        println(StringtoInteger.myAtoi("4193 with words"))
        println(StringtoInteger.myAtoi("words and 987"))
    }


    @Test
    fun palindromeNumber() {
        println(PalindromeNumber.isPalindrome(1))
        println(PalindromeNumber.isPalindrome(-1))
        println(PalindromeNumber.isPalindrome(+1))
        println(PalindromeNumber.isPalindrome(121))
        println(PalindromeNumber.isPalindrome(1212))
    }


    @Test
    fun regularExpressionMatching() {
        println(RegularExpressionMatching.isMatch("mississippi", "mis*is*p*."))
        println(RegularExpressionMatching.isMatch("aab", "c*a*b"))


    }




}
