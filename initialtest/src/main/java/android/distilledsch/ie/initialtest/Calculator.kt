package android.distilledsch.ie.initialtest

/**
 * A calculator class.
 *
 * @author Ronan Doyle <ronan.doyle@distilled.ie>
 */
class Calculator {
    companion object {
        fun addTwoNumbers(first: Int, second: Int) : String {
            return first.plus(second).toString()
        }
    }
}