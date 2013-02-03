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
package ch.tutteli.tsphp.parser.test.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
public class ExpressionHelper
{

    public static String[][] getAstAssignmentExpression() {
        return new String[][]{
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
                    {"$a =() $b", "(cAssign $a $b)"},
                    {
                        "$a = $b += $c -= $d *= $e /= $f &= $g |= $h ^= $i %= $j .= $k <<= $l >>= $m =() $n",
                        "(= $a (+= $b (-= $c (*= $d (/= $e (&= $f "
                            + "(|= $g (^= $h (%= $i (.= $j (<<= $k (>>= $l (cAssign $m $n)))))))"
                        + "))))))"
                    }
                };
    }
    public static List<String[]> getAstExpressions() {
        List<String[]> collection = new ArrayList<>();
        collection.addAll(Arrays.asList(getAstAssignmentExpression()));
        collection.addAll(Arrays.asList(getAstExpressionsWihtoutAssignment()));
        return collection;
    }
    public static String[][] getAstExpressionsWihtoutAssignment() {
        return new String[][]{
                    {"$a or $b", "(or $a $b)"},
                    {"$a or $b or $c", "(or (or $a $b) $c)"},
                    {"$a xor $b", "(xor $a $b)"},
                    {"$a xor $b xor $c", "(xor (xor $a $b) $c)"},
                    {"$a and $b", "(and $a $b)"},
                    {"$a and $b and $c", "(and (and $a $b) $c)"},
                    {"$a and $b or $c xor $d", "(or (and $a $b) (xor $c $d))"},
                    {"$a or $b and $c xor $d", "(or $a (xor (and $b $c) $d))"},
                    {"$a or $b and $c xor $d", "(or $a (xor (and $b $c) $d))"},
                    {"true ? $a : $b", "(? true $a $b)"},
                    {"true ? $a ? $b : $c : $d", "(? true (? $a $b $c) $d)"},
                    {"true ? $a : $b ? $c : $d", "(? true $a (? $b $c $d))"},
                    {"$a = true ? $c += $d : $e -= $f", "(= $a (? true (+= $c $d) (-= $e $f)))"},
                    {"$a *= true ? $c /= $d ? $e &= $f : $g |= $h : $i ^= $j", "(*= $a (? true (/= $c (? $d (&= $e $f) (|= $g $h))) (^= $i $j)))"},
                    {"$a %= true ? $c .= $d ? $e <<= $f : $g >>= $h : $i = $j", "(%= $a (? true (.= $c (? $d (<<= $e $f) (>>= $g $h))) (= $i $j)))"},
                    {"$a || $b", "(|| $a $b)"},
                    {"$a || $b || $c", "(|| (|| $a $b) $c)"},
                    {"$a && $b", "(&& $a $b)"},
                    {"$a && $b && $c", "(&& (&& $a $b) $c)"},
                    {"$a && $b || $c", "(|| (&& $a $b) $c)"},
                    {"$a || $b && $c", "(|| $a (&& $b $c))"},
                    {"$a || $b && $c ? $d : $e", "(? (|| $a (&& $b $c)) $d $e)"},
                    {"$a | $b", "(| $a $b)"},
                    {"$a | $b | $c", "(| (| $a $b) $c)"},
                    {"$a ^ $b", "(^ $a $b)"},
                    {"$a ^ $b ^ $c", "(^ (^ $a $b) $c)"},
                    {"$a & $b", "(& $a $b)"},
                    {"$a & $b & $c", "(& (& $a $b) $c)"},
                    {"$a & $b | $c ^ $d", "(| (& $a $b) (^ $c $d))"},
                    {"$a | $b & $c ^ $d", "(| $a (^ (& $b $c) $d))"},
                    {"$a | $b & $c ^ $d", "(| $a (^ (& $b $c) $d))"},
                    {"$a == $b", "(== $a $b)"},
                    {"$a === $b", "(=== $a $b)"},
                    {"$a != $b", "(!= $a $b)"},
                    {"$a !== $b", "(!== $a $b)"},
                    {"$a <> $b", "(<> $a $b)"},
                    {"$a < $b", "(< $a $b)"},
                    {"$a <= $b", "(<= $a $b)"},
                    {"$a > $b", "(> $a $b)"},
                    {"$a >= $b", "(>= $a $b)"},
                    {"$a == $b | $c < $d & $e ? $f != $g : $h === $i", "(? (| (== $a $b) (& (< $c $d) $e)) (!= $f $g) (=== $h $i))"},
                    {"1 << 2", "(<< 1 2)"},
                    {"1 >> 2", "(>> 1 2)"},
                    {"1 >> 2 << 3 >> 5", "(>> (<< (>> 1 2) 3) 5)"},
                    {"1 + 2", "(+ 1 2)"},
                    {"1 - 2", "(- 1 2)"},
                    {"$a . $b", "(. $a $b)"},
                    {"1 + 2", "(+ 1 2)"},
                    {"1 - 2", "(- 1 2)"},
                    {"$a . $b", "(. $a $b)"},
                    {"$a << $b >> $c + $d * $e - $f", "(>> (<< $a $b) (- (+ $c (* $d $e)) $f))"},
                    {"!$a", "(! $a)"},
                    {"!!$a", "(! (! $a))"},
                    {"!!! $a", "(! (! (! $a)))"},
                    {"$a instanceof MyClass", "(instanceof $a MyClass)"},
                    {"$a instanceof $b", "(instanceof $a $b)"},
                    {"(Type) $a", "(casting Type $a)"},
                    {"~$a", "(~ $a)"},
                    {"@$a", "(@ $a)"},
                    {"(Type) (MyClass) $a", "(casting Type (casting MyClass $a))"},
                    {"~~$a", "(~ (~ $a))"},
                    {"@@$a", "(@ (@ $a))"},
                    {"@(Type) ~$a", "(@ (casting Type (~ $a)))"},
                    {"clone $a", "(clone $a)"},
                    {"+$a", "$a"},
                    {"+1", "1"},
                    {"-$a", "(uMinus $a)"},
                    {"-2", "(uMinus 2)"},
                    {"+$a + $b", "(+ $a $b)"},
                    {"-$a - $b", "(- (uMinus $a) $b)"},
                    {"clone $a", "(clone $a)"},
                    {"clone $a->a", "(clone (memAccess $a a))"},
                    {"new Type", "(new Type args)"},
                    {"foo()", "(fCall foo args)"},
                    {"\\foo(1,1+2,3)", "(fCall \\foo (args 1 (+ 1 2) 3))"},
                    {"$a->foo()", "(mCall $a foo args)"},
                    {"$a->foo(true || false,123*9)", "(mCall $a foo (args (|| true false) (* 123 9)))"},
                    {"exit", "exit"},
                    {"exit(1)", "(exit 1)"},
                    {"($a)", "$a"},
                    {"$a++", "(postIncr $a)"},
                    {"$a--", "(postDecr $a)"},
                    {"++$a", "(preIncr $a)"},
                    {"--$a", "(preDecr $a)"},
                    {"$a", "$a"},
                    {"$a->a", "(memAccess $a a)"},
                    {"self::$a", "(sMemAccess self $a)"},
                    {"self::a", "(sMemAccess self a)"},
                    {"Foo::a", "(sMemAccess Foo a)"},
                    {"true", "true"},
                    {"false", "false"},
                    {"1", "1"},
                    {"2.123", "2.123"},
                    {"'a'", "'a'"},
                    {"\"asdf\"", "\"asdf\""},
                    {"[1,2,a=>3]", "(array 1 2 (=> a 3))"},
                    {"null", "null"},
                    {"(int) clone $a + $b", "(+ (casting int (clone $a)) $b)"},
                    {"(-$a + $b) * $c", "(* (+ (uMinus $a) $b) $c)"},
                    {"!($a instanceof Type) || $a < $b+$c == ~(1 | 3 & 12)", "(|| (! (instanceof $a Type)) (== (< $a (+ $b $c)) (~ (| 1 (& 3 12)))))"}
                };
    }

    public static String[] getParserExpressions() {
        return new String[]{
                    "true or false",
                    "true xor false",
                    "true and false",
                    "true or false xor true and false",
                    "true ? 1:2",
                    "true ? $a<$b ? 1:2:2",
                    "true ? $a<$b ? 1:2:2+3-4",
                    "true || false",
                    "true && false",
                    "true || false && true ? true:false",
                    "14 | 2",
                    "14 ^ 2",
                    "14 & 2",
                    "9 | 9 ^ 12 & 3",
                    "$b = 1",
                    "$b += 1",
                    "$b -= 1",
                    "$b *= 1",
                    "$b /= 1",
                    "$b %= 1",
                    "$b .= 1",
                    "$b &= 1",
                    "$b |= 1",
                    "$b ^= 1",
                    "$b <<= 1",
                    "$b >>= 1",
                    "$b >>= 1",
                    "$b==$c",
                    "$b!=$c",
                    "$b===$c",
                    "$b!==$c",
                    "$b<>$c",
                    "$a == $b && $c != $c || $c === $d && $a !== $e || $a <> $f",
                    "$a < $b",
                    "$a <= $b",
                    "$a > $b",
                    "$a >= $b",
                    "$a < 4 && 2 <= 7 || 1 > 10 && 2 >= $d",
                    "1 << 4",
                    "16 >> 4",
                    "$a << 2 >> 5",
                    "1+1",
                    "2-3",
                    "4*5",
                    "6/7",
                    "6%7",
                    "6+7-5*5/(2+1)",
                    "6 % 3 + 7-5*5/(2+1)",
                    "'hallo'.'welt'",
                    "'hallo'.'welt'.\"blabla bla\".$a",
                    "!$a",
                    "!!$a",
                    "$a instanceof Foo",
                    "$a instanceof $a",
                    "~$a",
                    "~~$a",
                    "(bool) $a",
                    "(int) $a",
                    "(float) $a",
                    "(string) $a",
                    "(array) $a",
                    "(Foo) $a",
                    "(int) ((bool) $a && $b) + 1",
                    "@$a",
                    "+1",
                    "-1",
                    "new a",
                    "new a()",
                    "clone $a",
                    "clone $a->a",
                    "clone $a[0]",
                    "$a",
                    "$a->a",
                    "$a[0]",
                    "$this",
                    "$this->a",
                    "$this[0]",
                    "foo()->a",
                    "$a[0]->a",
                    "$a->foo()->a",
                    "+foo()",
                    "-foo()",
                    "+$a->foo()",
                    "-$a->foo()",
                    "(1+1)",
                    "$a++",
                    "++$a",
                    "--$a",
                    "$a--",
                    "foo()",
                    "$a->foo()",
                    "$a->a->foo()",
                    "$a[0]->foo()",
                    "$a[0][1]->foo()",
                    "self::foo()",
                    "self::$a->foo()",
                    "parent::foo()",
                    "parent::$a->foo()",
                    "a",
                    "A::a"
                };
    }
}
