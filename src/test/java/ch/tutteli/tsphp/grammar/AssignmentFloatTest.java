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
package ch.tutteli.tsphp.grammar;

import ch.tutteli.tsphp.grammar.utils.ATest;
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
public class AssignmentFloatTest extends ATest
{

    public AssignmentFloatTest(String testString) {
        super(testString);
    }

    @Test
    public void test() throws RecognitionException {
        super.parseAndCheckForException();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    //testFloatAssignment
                    {"float $a = 1.0; "},
                    {"float $b = 1234567890.1234567809;"},
                    {"float $c = +2.123;"},
                    {"float $d = -5.87495;"},
                    //testFloatCommaAssignment
                    {"float $a = .123;"},
                    {"float $b = .1234567890;"},
                    {"float $c = -.12;"},
                    {"float $d = +.457;"},
                    //testFloatExpAssignment
                    {"float $a = 0e1;"},
                    {"float $a = 0E2;"},
                    {"float $a = 0.1e2;"},
                    {"float $a = 0.1E3;"},
                    {"float $a = .1e5; "},
                    {"float $a = .1E6; "},
                    {"float $b = 1234567890e123456789;"},
                    {"float $c = 1234567890e+123456789;"},
                    {"float $d = 1234567890e-123456789;"},
                    {"float $b = 1234567890E123456789;"},
                    {"float $c = 1234567890E+123456789;"},
                    {"float $d = 1234567890E-123456789;"},
                    {"float $b = 1234567890.0987654321e123456789;"},
                    {"float $c = 1234567890.0987654321e+123456789;"},
                    {"float $d = 1234567890.0987654321e-123456789;"},
                    {"float $b = 1234567890.0987654321E123456789;"},
                    {"float $c = 1234567890.0987654321E+123456789;"},
                    {"float $d = 1234567890.0987654321E-123456789;"},
                    {"float $b = .0741852963e123456789;"},
                    {"float $b = .0741852963e+123456789;"},
                    {"float $b = .0741852963e-123456789;"},
                    {"float $b = .0741852963E123456789;"},
                    {"float $b = .0741852963E+123456789;"},
                    {"float $b = .0741852963E-123456789;"}
                });

        //
    }
}
