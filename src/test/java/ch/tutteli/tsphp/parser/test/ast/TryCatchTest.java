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
package ch.tutteli.tsphp.parser.test.ast;

import ch.tutteli.tsphp.parser.test.utils.AAstTest;
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
public class TryCatchTest extends AAstTest
{

    public TryCatchTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException {
        compareAst();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {
                        "try{$a=1;}catch(\\Exception $e){}",
                        "(try "
                            + "(block (= $a 1)) "
                            + "(catch (exceptions ($e \\Exception)) block)"
                        + ")"
                    },
                    {
                        "try{$a=1;}catch(\\Exception $e){} catch(\\a\\MyException $e){$a=1;$b=2;}",
                        "(try "
                            + "(block (= $a 1)) "
                            + "(catch (exceptions ($e \\Exception)) block) "
                            + "(catch (exceptions ($e \\a\\MyException)) (block (= $a 1) (= $b 2)))"
                        + ")"
                    },
                    {
                        "try{$a=1;}catch(a $e){} catch(b $e){$a=1;$b=2;}catch(c $e){}",
                        "(try "
                            + "(block (= $a 1)) "
                            + "(catch (exceptions ($e a)) block) "
                            + "(catch (exceptions ($e b)) (block (= $a 1) (= $b 2))) "
                            + "(catch (exceptions ($e c)) block)"
                        + ")"
                    },
        });
    }
}
