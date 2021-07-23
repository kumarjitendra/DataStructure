object Palindrom {
    // Function to check palindrome
    fun checkPalindrome(str: String): Boolean {

        // Calculating string length
        val len = str.length

        // Traversing through the string
        // upto half its length
        for (i in 0 until len / 2) {

            // Comparing i th character
            // from starting and len-i
            // th character from end
            /*if (str[i] !=
                str[len - i - 1]
            )
                return false*/
            if (str[i] != str[len - i - 1])
                return false
        }

        // If the above loop doesn't return then
        // it is palindrome
        return true
    }

    // Driver Code
    @JvmStatic
    fun main(args: Array<String>) {

        // Taking number as string
        val st = "1122"
        if (checkPalindrome(st))
            print("Yes") else print("No")

    }
}