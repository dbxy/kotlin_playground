package recursion

/*
Determine whether or not a string is a palindrome
 */
fun recursivePalindrome(s: String): Boolean {
    if (s.length % 2 != 0) throw(IllegalArgumentException("Odd sized strings can never be a palindrome."))
    if (s.isNotEmpty()) {
        return if (s[0] == s[s.length - 1]) {
            recursivePalindrome(s.slice(1 until s.length - 1))
        } else {
            false
        }
    }
    return true
}

/*
Calculate the power of n to p
 */
fun recursivePowerOf(n: Int, p: Int): Int {
    if (p <= 1) return n
    return n * recursivePowerOf(n, p - 1);
}

/*
Apply fn to each member of arr
 */
fun recursiveMap(arr: List<Int>, fn: (item: Int) -> Int ): List<Int> {
    if (arr.isEmpty()) return arr;
    return listOf(fn(arr[0])).plus(recursiveMap(arr.slice(1 until arr.size), fn))
}