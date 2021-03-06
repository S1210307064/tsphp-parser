/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.ast;

import ch.tsphp.parser.test.integration.testutils.AAstTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ExpressionChainingTest extends AAstTest
{

    public ExpressionChainingTest(String testString, String expectedResult) {
        super(testString + ";", "(expr " + expectedResult + ")");
    }

    @Test
    public void test() throws Exception {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                {"$a or $b or $c", "(or (or $a $b) $c)"},
                {"$a or $b or $c or $d", "(or (or (or $a $b) $c) $d)"},
                {"$a xor $b xor $c", "(xor (xor $a $b) $c)"},
                {"$a xor $b xor $c xor $d", "(xor (xor (xor $a $b) $c) $d)"},
                {"$a and $b and $c", "(and (and $a $b) $c)"},
                {"$a and $b and $c and $d", "(and (and (and $a $b) $c) $d)"},

                {"$a = $b = $c", "(= $a (= $b $c))"},
                {"$a = $b = $c = $d", "(= $a (= $b (= $c $d)))"},
                {"$a += $b += $c", "(= $a (+ $a (= $b (+ $b $c))))"},
                {"$a -= $b -= $c", "(= $a (- $a (= $b (- $b $c))))"},
                {"$a *= $b *= $c", "(= $a (* $a (= $b (* $b $c))))"},
                {"$a /= $b /= $c", "(= $a (/ $a (= $b (/ $b $c))))"},
                {"$a &= $b &= $c", "(= $a (& $a (= $b (& $b $c))))"},
                {"$a ^= $b ^= $c", "(= $a (^ $a (= $b (^ $b $c))))"},
                {"$a %= $b %= $c", "(= $a (% $a (= $b (% $b $c))))"},
                {"$a .= $b .= $c", "(= $a (. $a (= $b (. $b $c))))"},
                {"$a |= $b |= $c", "(= $a (| $a (= $b (| $b $c))))"},
                {"$a <<= $b <<= $c", "(= $a (<< $a (= $b (<< $b $c))))"},
                {"$a >>= $b >>= $c", "(= $a (>> $a (= $b (>> $b $c))))"},
                {"$a =() $b =() $c", "(cAssign $a (cAssign $b $c))"},
                {"$a += $b += $c += $d", "(= $a (+ $a (= $b (+ $b (= $c (+ $c $d))))))"},
                {"$a -= $b -= $c -= $d", "(= $a (- $a (= $b (- $b (= $c (- $c $d))))))"},
                {"$a *= $b *= $c *= $d", "(= $a (* $a (= $b (* $b (= $c (* $c $d))))))"},
                {"$a /= $b /= $c /= $d", "(= $a (/ $a (= $b (/ $b (= $c (/ $c $d))))))"},
                {"$a &= $b &= $c &= $d", "(= $a (& $a (= $b (& $b (= $c (& $c $d))))))"},
                {"$a ^= $b ^= $c ^= $d", "(= $a (^ $a (= $b (^ $b (= $c (^ $c $d))))))"},
                {"$a %= $b %= $c %= $d", "(= $a (% $a (= $b (% $b (= $c (% $c $d))))))"},
                {"$a .= $b .= $c .= $d", "(= $a (. $a (= $b (. $b (= $c (. $c $d))))))"},
                {"$a |= $b |= $c |= $d", "(= $a (| $a (= $b (| $b (= $c (| $c $d))))))"},
                {"$a =() $b =() $c =() $d", "(cAssign $a (cAssign $b (cAssign $c $d)))"},
                //chaining up simple and compound assignments
                {
                        "$a = $b = $c += $d -= $e = $f *= $g",
                        "(= $a (= $b (= $c (+ $c (= $d (- $d (= $e (= $f (* $f $g)))))))))"
                },
                {
                        "$a *= $b =() $c += $d = $e -= $f ^= "
                                + "$g >>= $h <<= $i &= $j |= $k .= $l = "
                                + "$m &= $n %= $o -= $p = $q /= $r",
                        "(= $a (* $a (cAssign $b (= $c (+ $c (= $d (= $e (- $e (= $f (^ $f "
                                + "(= $g (>> $g (= $h (<< $h (= $i (& $i (= $j (| $j (= $k (. $k (= $l "
                                + "(= $m (& $m (= $n (% $n (= $o (- $o (= $p (= $q (/ $q $r"
                                + ")))))))))"
                                + ")))))))))))"
                                + "))))))))))"
                },

                //ternary is right associative - different than PHP
                {"true ? $a ? $b : $c : $d", "(? true (? $a $b $c) $d)"},
                {"true ? $a : $b ? $c : $d", "(? true $a (? $b $c $d))"},
                {"true ? $a ? $b ? $c : $d : $e : $f", "(? true (? $a (? $b $c $d) $e) $f)"},
                {"true ? $a ? $b : $c ? $d : $e : $f", "(? true (? $a $b (? $c $d $e)) $f)"},
                {"true ? $a : $b ? $c ? $d : $e : $f", "(? true $a (? $b (? $c $d $e) $f))"},
                {"true ? $a : $b ? $c : $d ? $e : $f", "(? true $a (? $b $c (? $d $e $f)))"},

                {"$a || $b || $c", "(|| (|| $a $b) $c)"},
                {"$a && $b && $c", "(&& (&& $a $b) $c)"},
                {"$a || $b || $c || $d", "(|| (|| (|| $a $b) $c) $d)"},
                {"$a && $b && $c && $d", "(&& (&& (&& $a $b) $c) $d)"},
                {"$a | $b | $c", "(| (| $a $b) $c)"},
                {"$a ^ $b ^ $c", "(^ (^ $a $b) $c)"},
                {"$a & $b & $c", "(& (& $a $b) $c)"},
                {"$a | $b | $c | $d", "(| (| (| $a $b) $c) $d)"},
                {"$a ^ $b ^ $c ^ $d", "(^ (^ (^ $a $b) $c) $d)"},
                {"$a & $b & $c & $d", "(& (& (& $a $b) $c) $d)"},

                {"1 << 2 << 3", "(<< (<< 1 2) 3)"},
                {"1 >> 2 >> 3", "(>> (>> 1 2) 3)"},
                {"1 << 2 << 3 << 4", "(<< (<< (<< 1 2) 3) 4)"},
                {"1 >> 2 >> 3 >> 4", "(>> (>> (>> 1 2) 3) 4)"},

                {"$a + $b + $c", "(+ (+ $a $b) $c)"},
                {"$a - $b - $c", "(- (- $a $b) $c)"},
                {"$a . $b . $c", "(. (. $a $b) $c)"},
                {"$a + $b + $c + $d", "(+ (+ (+ $a $b) $c) $d)"},
                {"$a - $b - $c - $d", "(- (- (- $a $b) $c) $d)"},
                {"$a . $b . $c . $d", "(. (. (. $a $b) $c) $d)"},

                {"$a * $b * $c", "(* (* $a $b) $c)"},
                {"$a / $b / $c", "(/ (/ $a $b) $c)"},
                {"$a % $b % $c", "(% (% $a $b) $c)"},
                {"$a * $b * $c * $d", "(* (* (* $a $b) $c) $d)"},
                {"$a / $b / $c / $d", "(/ (/ (/ $a $b) $c) $d)"},
                {"$a % $b % $c % $d", "(% (% (% $a $b) $c) $d)"},

                {"(Type) (MyClass) $a", "(casting (type tMod Type) (casting (type tMod MyClass) $a))"},
                {
                        "(int) (Type) (MyClass) $a",
                        "(casting (type tMod int) (casting (type tMod Type) (casting (type tMod MyClass) $a)))"
                },
                {"@@$a", "(@ (@ $a))"},
                {"~~$a", "(~ (~ $a))"},
                {"!!$a", "(! (! $a))"},
                {"@@@$a", "(@ (@ (@ $a)))"},
                {"~~~$a", "(~ (~ (~ $a)))"},
                {"!!!$a", "(! (! (! $a)))"},
                {"+ +$a", "(uPlus (uPlus $a))"},
                {"- -$a", "(uMinus (uMinus $a))"},
                {"+ + +$a", "(uPlus (uPlus (uPlus $a)))"},
                {"- - -$a", "(uMinus (uMinus (uMinus $a)))"},
                //chaining up different operators
                {"- ~ - ~ $a","(uMinus (~ (uMinus (~ $a))))"},
                {"(Type) @ ~ ! + -$a", "(casting (type tMod Type) (@ (~ (! (uPlus (uMinus $a))))))"},
                {
                        "+ ~ (int) ! - @ (Type) @ ~ ! + -$a",
                        "(uPlus (~ (casting (type tMod int) (! (uMinus (@ "
                                + "(casting (type tMod Type) (@ (~ (! (uPlus (uMinus $a))))))))))))"
                },

                {"clone clone $a", "(clone (clone $a))"},
                {"clone clone clone $a", "(clone (clone (clone $a)))"},


                {"$a->a->b", "(memAccess (memAccess $a a) b)"},
                {"$a->a->b->c", "(memAccess (memAccess (memAccess $a a) b) c)"},
                {"$a->a()->b()", "(mpCall (mCall $a a() args) b() args)"},
                {"$a->a()->b()->c()", "(mpCall (mpCall (mCall $a a() args) b() args) c() args)"},
                {"$a[0][1]", "(arrAccess (arrAccess $a 0) 1)"},
                {"$a[0][1][2]", "(arrAccess (arrAccess (arrAccess $a 0) 1) 2)"},
        });
    }
}

