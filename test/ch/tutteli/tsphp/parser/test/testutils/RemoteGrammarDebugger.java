package ch.tutteli.tsphp.parser.test.testutils;

import ch.tutteli.tsphp.common.IParser;
import ch.tutteli.tsphp.common.ParserUnitDto;
import ch.tutteli.tsphp.parser.ParserFacade;

public class RemoteGrammarDebugger
{

    public static void main(String[] args) throws Exception {

        IParser parser = new ParserFacade();
        ParserUnitDto dto = parser.parse("namespace{int $d=1;} namespace a{int $a=1;} namespace b{$b=1;}");
        System.exit(0);

    }
}