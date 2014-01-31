package ch.tsphp.parser.test.integration.ast;

import ch.tsphp.parser.test.integration.testutils.AAstTest;

import java.util.Arrays;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

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
                        + "(cBlock (expr (= $a 1))) "
                        + "(catch (vars (type tMod \\Exception) $e) cBlock)"
                        + ")"
                    },
                    {
                        "try{$a=1;}catch(\\Exception $e){} catch(\\a\\MyException $e){$a=1;$b=2;}",
                        "(try "
                        + "(cBlock (expr (= $a 1))) "
                        + "(catch (vars (type tMod \\Exception) $e) cBlock) "
                        + "(catch (vars (type tMod \\a\\MyException) $e) (cBlock (expr (= $a 1)) (expr (= $b 2))))"
                        + ")"
                    },
                    {
                        "try{$a=1;}catch(a $e){} catch(b $e){$a=1;$b=2;}catch(c $e){}",
                        "(try "
                        + "(cBlock (expr (= $a 1))) "
                        + "(catch (vars (type tMod a) $e) cBlock) "
                        + "(catch (vars (type tMod b) $e) (cBlock (expr (= $a 1)) (expr (= $b 2)))) "
                        + "(catch (vars (type tMod c) $e) cBlock)"
                        + ")"
                    }
                });
    }
}
