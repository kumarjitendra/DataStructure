import java.util.*

internal object RepeatingNumbers {
    fun repeatedNumber(A: IntArray): Vector<Int> {
        val len= A.size
        var Sum_N = len * (len + 1) / 2
        var Sum_NSq = len * (len + 1) *
                (2 * len + 1) / 6
        var missingNumber = 0
        var repeating = 0
        for (i in A.indices) {
            Sum_N -= A[i]
            Sum_NSq -= A[i] * A[i]
        }
        missingNumber = (Sum_N + Sum_NSq /
                Sum_N) / 2
        repeating = missingNumber - Sum_N
        val ans = Vector<Int>()
        ans.add(repeating)
       // ans.add(missingNumber)
        return ans
    }

    // Driver Code
    @JvmStatic
    fun main(args: Array<String>) {
        val v = intArrayOf(4, 3, 6, 2, 1, 6, 7)
        val res = repeatedNumber(v)
        for (x in res) {
            print("$x ")
        }
    }
}