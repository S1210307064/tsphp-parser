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
package ch.tutteli.tsphp.grammar.test.parser;

import ch.tutteli.tsphp.grammar.test.utils.AParserTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class ExpressionTest extends AParserTest
{

    public ExpressionTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();

        String[] expressions = getAllExpressions();
        for (String expression : expressions) {
            collection.add(new Object[]{"bool $a = " + expression + ";"});
            collection.add(new Object[]{"int $a = " + expression + ";"});
            collection.add(new Object[]{"float $a = " + expression + ";"});
            collection.add(new Object[]{"string $a = " + expression + ";"});
            collection.add(new Object[]{"array $a = " + expression + ";"});
            collection.add(new Object[]{"resource $a = " + expression + ";"});
            collection.add(new Object[]{"object $a = " + expression + ";"});
            collection.add(new Object[]{"Foo $a = " + expression + ";"});
        }

        return collection;
    }

    public static String[] getAllExpressions() {
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
                    //constant
                    "a",
                    "A::a"
                };
    }
}
