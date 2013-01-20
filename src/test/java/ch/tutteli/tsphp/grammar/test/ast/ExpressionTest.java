/*
 * Copyright 2012 Robert Stoll <rstoll@tutteli.ch>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package ch.tutteli.tsphp.grammar.test.ast;

import ch.tutteli.tsphp.grammar.test.utils.AAstTest;
import java.util.Arrays;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class ExpressionTest extends AAstTest
{

    public ExpressionTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Override
    protected void run() throws RecognitionException {
        result = parser.expressionForTest();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        String[][] expressions = getExpressions();
        for (String[] expression : expressions) {
            expression[0] = expression[0] + ";";
        }
        return Arrays.asList((Object[][]) expressions);
    }

    public static String[][] getExpressions() {
        return new String[][]{
                    {"$a or $b", "(or $a $b)"},
                    {"$a or $b or $c", "(or (or $a $b) $c)"},
                    //
                    {"$a xor $b", "(xor $a $b)"},
                    {"$a xor $b xor $c", "(xor (xor $a $b) $c)"},
                    //
                    {"$a and $b", "(and $a $b)"},
                    {"$a and $b and $c", "(and (and $a $b) $c)"},
                    //
                    {"$a and $b or $c xor $d", "(or (and $a $b) (xor $c $d))"},
                    {"$a or $b and $c xor $d", "(or $a (xor (and $b $c) $d))"},
                    {"$a or $b and $c xor $d", "(or $a (xor (and $b $c) $d))"},
                    //
                    {"$a = $b", "(= $a $b)"},
                    {"$a += $b", "(+= $a $b)"},
                    {"$a -= $b", "(-= $a $b)"},
                    {"$a *= $b", "(*= $a $b)"},
                    {"$a /= $b", "(/= $a $b)"},
                    {"$a &= $b", "(&= $a $b)"},
                    {"$a |= $b", "(|= $a $b)"},
                    {"$a ^= $b", "(^= $a $b)"},
                    {"$a %= $b", "(%= $a $b)"},
                    {"$a .= $b", "(.= $a $b)"},
                    {"$a <<= $b", "(<<= $a $b)"},
                    {"$a >>= $b", "(>>= $a $b)"},
                    //
                    {"true ? $a : $b", "(? true $a $b)"},
                    {"true ? $a ? $b : $c : $d", "(? true (? $a $b $c) $d)"},
                    {"true ? $a : $b ? $c : $d", "(? true $a (? $b $c $d))"},
                    //
                    {"$a = true ? $c += $d : $e -= $f", "(= $a (? true (+= $c $d) (-= $e $f)))"},
                    {"$a *= true ? $c /= $d ? $e &= $f : $g |= $h : $i ^= $j", "(*= $a (? true (/= $c (? $d (&= $e $f) (|= $g $h))) (^= $i $j)))"},
                    {"$a %= true ? $c .= $d ? $e <<= $f : $g >>= $h : $i = $j", "(%= $a (? true (.= $c (? $d (<<= $e $f) (>>= $g $h))) (= $i $j)))"},
                    //
                    {"$a || $b", "(|| $a $b)"},
                    {"$a || $b || $c", "(|| (|| $a $b) $c)"},
                    //
                    {"$a && $b", "(&& $a $b)"},
                    {"$a && $b && $c", "(&& (&& $a $b) $c)"},
                    //
                    {"$a && $b || $c", "(|| (&& $a $b) $c)"},
                    {"$a || $b && $c", "(|| $a (&& $b $c))"},
                    {"$a || $b && $c ? $d : $e", "(? (|| $a (&& $b $c)) $d $e)"},
                    //
                    {"$a | $b", "(| $a $b)"},
                    {"$a | $b | $c", "(| (| $a $b) $c)"},
                    //
                    {"$a ^ $b", "(^ $a $b)"},
                    {"$a ^ $b ^ $c", "(^ (^ $a $b) $c)"},
                    //
                    {"$a & $b", "(& $a $b)"},
                    {"$a & $b & $c", "(& (& $a $b) $c)"},
                    //
                    {"$a & $b | $c ^ $d", "(| (& $a $b) (^ $c $d))"},
                    {"$a | $b & $c ^ $d", "(| $a (^ (& $b $c) $d))"},
                    {"$a | $b & $c ^ $d", "(| $a (^ (& $b $c) $d))"},
                    //
                    {"$a == $b", "(== $a $b)"},
                    {"$a === $b", "(=== $a $b)"},
                    {"$a != $b", "(!= $a $b)"},
                    {"$a !== $b", "(!== $a $b)"},
                    {"$a <> $b", "(<> $a $b)"},
                    //
                    {"$a < $b", "(< $a $b)"},
                    {"$a <= $b", "(<= $a $b)"},
                    {"$a > $b", "(> $a $b)"},
                    {"$a >= $b", "(>= $a $b)"},
                    //
                    {"$a == $b | $c < $d & $e ? $f != $g : $h === $i", "(? (| (== $a $b) (& (< $c $d) $e)) (!= $f $g) (=== $h $i))"},
                    //
                    {"1 << 2", "(<< 1 2)"},
                    {"1 >> 2", "(>> 1 2)"},
                    {"1 >> 2 << 3 >> 5", "(>> (<< (>> 1 2) 3) 5)"},
                    //
                    {"1 + 2", "(+ 1 2)"},
                    {"1 - 2", "(- 1 2)"},
                    {"$a . $b", "(. $a $b)"},
                    //
                    {"1 + 2", "(+ 1 2)"},
                    {"1 - 2", "(- 1 2)"},
                    {"$a . $b", "(. $a $b)"},
                    //
                    {"$a << $b >> $c + $d * $e - $f", "(>> (<< $a $b) (- (+ $c (* $d $e)) $f))"},
                    //
                    {"!$a", "(! $a)"},
                    {"!!$a", "(! (! $a))"},
                    {"!!! $a", "(! (! (! $a)))"},
                    //
                    {"$a instanceof MyClass", "(instanceof $a (class/interface type MyClass))"},
                    {"$a instanceof $b", "(instanceof $a $b)"},
                    //
                    {"(Type) $a", "(cast (class/interface type Type) $a)"},
                    {"~$a", "(~ $a)"},
                    {"@$a", "(@ $a)"},
                    {"(Type) (MyClass) $a", "(cast (class/interface type Type) (cast (class/interface type MyClass) $a))"},
                    {"~~$a", "(~ (~ $a))"},
                    {"@@$a", "(@ (@ $a))"},
                    {"@(Type) ~$a", "(@ (cast (class/interface type Type) (~ $a)))"},
                    //
                    {"clone $a", "(clone $a)"},
                    //
                    {"+$a", "(unary plus $a)"},
                    {"+1", "(unary plus 1)"},
                    {"-$a", "(unary minus $a)"},
                    {"-2", "(unary minus 2)"},
                    //
                    {"+$a + $b", "(+ (unary plus $a) $b)"},
                    {"-$a - $b", "(- (unary minus $a) $b)"},
                    //
                    {"clone $a","(clone $a)"},
                    {"clone $a->a","(clone (member access $a a))"},
                    {"new Type","(new (class/interface type Type) EXPRESSION_LIST)"},
                    //
                    {"foo()","(function call (class/interface type foo) EXPRESSION_LIST)"},
                    {"\\foo(1,1+2,3)","(function call (class/interface type \\ foo) (EXPRESSION_LIST 1 (+ 1 2) 3))"},
                    {"$a->foo()","(method call $a foo EXPRESSION_LIST)"},
                    {"$a->foo(true || false,123*9)","(method call $a foo (EXPRESSION_LIST (|| true false) (* 123 9)))"},
                    //
                    {"($a)", "$a"},
                    {"$a++","(post increment/decrement ++ $a)"},
                    {"$a--","(post increment/decrement -- $a)"},
                    {"++$a","(pre increment/decrement ++ $a)"},
                    {"--$a","(pre increment/decrement -- $a)"},
                    {"$a","$a"},
                    {"$a->a","(member access $a a)"},
                    
                    //
                    {"(int) clone $a + $b", "(+ (cast int (clone $a)) $b)"},
                    {"(-$a + $b) * $c", "(* (+ (unary minus $a) $b) $c)"},
                    {"!($a instanceof Type) || $a < $b+$c == ~(1 | 3 & 12)", "(|| (! (instanceof $a (class/interface type Type))) (== (< $a (+ $b $c)) (~ (| 1 (& 3 12)))))"}
                };
    }
}
