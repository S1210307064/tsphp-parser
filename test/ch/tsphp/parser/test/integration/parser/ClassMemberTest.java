/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser;

import ch.tsphp.parser.test.integration.testutils.AParserTest;
import ch.tsphp.parser.test.integration.testutils.TypeHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ClassMemberTest extends AParserTest
{

    public ClassMemberTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        collection.addAll(Arrays.asList(new Object[][]{
                    {"class a{ private int $a=1;}"},
                    {"class a{ protected int $a=1;}"},
                    {"class a{ public int $a=1;}"},
                    {"class a{ static private int $a=1;}"},
                    {"class a{ static protected int $a=1;}"},
                    {"class a{ static public int $a=1;}"},
                    //comma declaration
                    {"class a{ private int $a=1,$b=2;}"},
                    {"class a{ protected int $a=1,$b=2;}"},
                    {"class a{ public int $a=1,$b=2;}"},
                    {"class a{ static private int $a=1,$b=2;}"},
                    {"class a{ static protected int $a=1,$b=2;}"},
                    {"class a{ static public int $a=1,$b=2;}"},
                    //comma declaration without assignment
                    {"class a{ private int $a=1,$b=2,$c;}"},
                    {"class a{ protected int $a=1,$b=2,$c;}"},
                    {"class a{ public int $a=1,$b=2,$c;}"},
                    {"class a{ static private int $a=1,$b=2,$c;}"},
                    {"class a{ static protected int $a=1,$b=2,$c;}"},
                    {"class a{ static public int $a=1,$b=2,$c;}"}
                }));

        List<String> types = TypeHelper.getAllTypes();
        for (String type : types) {
            collection.add(new Object[]{"class a{ private " + type + " $a=1;}"});
        }

        return collection;

    }
}
