package com.StriverA2Zsheet.String;

public class RemoveOutermostParentheses {

    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (count > 0) {
                    ans.append(s.charAt(i));
                }
                count++;
            } else if (s.charAt(i) == ')') {
                count--;
                if (count > 0) {
                    ans.append(s.charAt(i));
                }
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {

        String s = "(()())(())";
        RemoveOutermostParentheses sol = new RemoveOutermostParentheses();

        String ans = sol.removeOuterParentheses(s);

        System.out.println(ans);

    }
}


/**
 StringBuffer is synchronized (thread-safe) while StringBuilder is not (un-synchronized). Because of synchronization overhead, StringBuilder is faster for single-threaded use; use StringBuffer only when multiple threads share the same mutable character sequence.

 * Mutable: unlike String (which is immutable), a StringBuilder can change its contents without creating new objects.
 * Fast for concatenation: repeated appends (= many string concatenations) are much faster with StringBuilder because it reuses an internal char array.
 * Not synchronized: StringBuilder is not thread-safe. Use StringBuffer if you need synchronization across threads.
 * Common methods: append(...), insert(...), delete(...), reverse(), charAt(), setCharAt(...), length(), capacity(), toString().


 ! REVISION NOTES

 count = Current nesting depth

 For '('
 ---------
 if (count > 0)
 keep '('
 count++

 Reason:
 count == 0 → outermost '(' → remove it.


 For ')'
 ---------
 count--

 if (count > 0)
 keep ')'

 Reason:
 After decrement,
 count == 0 → outermost ')' → remove it.



 ! DRY RUN
 !
 Input: (()())(())

 Char   Count(before)   Action           Count(after)   Answer
 --------------------------------------------------------------
 (           0          Skip                 1
 (           1          Append               2          (
 )           2          Append               1          ()
 (           1          Append               2          ()(
 )           2          Append               1          ()()
 )           1          Skip                 0          ()()
 (           0          Skip                 1          ()()
 (           1          Append               2          ()()(
 )           2          Append               1          ()()()
 )           1          Skip                 0          ()()()


 One-line trick to remember:

 ( → Check first, then increment.
 ) → Decrement first, then check.


 */