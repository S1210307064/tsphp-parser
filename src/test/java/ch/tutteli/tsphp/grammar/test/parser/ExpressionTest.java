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
        super.parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();

        addToCollection(collection, getAssignmentExpressions());
        addToCollection(collection, getExpressionsWithoutAssignment());
        
        return collection;
    }

    private static void addToCollection(Collection<Object[]> collection, String[] expressions) {
        for (String expression : expressions) {
            collection.add(new Object[]{"bool $a = " + expression + ";"});
            collection.add(new Object[]{"boolean $a = " + expression + ";"});
            collection.add(new Object[]{"int $a = " + expression + ";"});
            collection.add(new Object[]{"float $a = " + expression + ";"});
            collection.add(new Object[]{"string $a = " + expression + ";"});
            collection.add(new Object[]{"array $a = " + expression + ";"});
            collection.add(new Object[]{"resource $a = " + expression + ";"});
        }
    }

    public static String[] getAssignmentExpressions() {
        return new String[]{"$b = 1",
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
                    "$a++",
                    "++$a",
                    "--$a",
                    "$a--",};
    }

    public static String[] getExpressionsWithoutAssignment() {
        return new String[]{
                    "true or false",
                    "true xor false",
                    "true and false",
                    "true ? 1:2",
                    "true || false",
                    "true && false",
                    "14 | 2",
                    "14 ^ 2",
                    "14 & 2",
                    "$b==$c",
                    "$b!=$c",
                    "$b===$c",
                    "$b!==$c",
                    "$b<>$c",
                    "$a < $b",
                    "$a <= $b",
                    "$a > $b",
                    "$a >= $b",
                    "1 << 4",
                    "16 >> 4",
                    "1+1",
                    "2-3",
                    "4*5",
                    "6/7",
                    "6%7",
                    "6+7-5*5/(2+1)",
                    "6 % 3 + 7-5*5/(2+1)",
                    "'hallo'.'welt'",
                    "!$a",
                    "~$a",
                    "(bool) $a",
                    "(boolean) $a",
                    "(int) $a",
                    "(float) $a",
                    "(string) $a",
                    "(array) $a",
                    "@$a",
                    "(1+1)",
                };
    }
}
