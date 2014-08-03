/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.parser.test.integration.parser;

import ch.tsphp.parser.antlr.TSPHPParser;
import ch.tsphp.parser.test.integration.testutils.AParserParserExceptionTest;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ClassErrorTest extends AParserParserExceptionTest
{

    public ClassErrorTest(String testString, int character, int position) {
        super(testString, character, position, RecognitionException.class);

    }

    @Test
    public void test() throws Exception {
        parseExpectingException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    //abstract and final mixed
                    {"abstract final class A{function void a(int $a=null,$b){}}", TSPHPParser.Final, 9},
                    {"final abstract class A{function void a(int $a=null,$b){}}", TSPHPParser.Abstract, 6},
                    //classes have no access modifier - at least not yet.
                    {"private class A{function void a(int $a=null,$b){}}", TSPHPParser.Private, 0},
                    {"protected class A{function void a(int $a=null,$b){}}", TSPHPParser.Protected, 0},
                    {"public class A{function void a(int $a=null,$b){}}", TSPHPParser.Public, 0},
                    //classes do not support multiple inheritance
                    {"class a extends b,c{}", TSPHPParser.Comma,17}
                    
        });
        
    }
}
