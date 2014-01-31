package ch.tsphp.parser.test.integration.testutils;

import ch.tsphp.common.IParser;
import ch.tsphp.common.ParserUnitDto;
import ch.tsphp.parser.ParserFacade;

public class RemoteGrammarDebugger
{

    public static void main(String[] args) throws Exception {

        IParser parser = new ParserFacade();
        ParserUnitDto dto = parser.parse("namespace{int $d=1;} namespace a{int $a=1;} namespace b{$b=1;}");
        System.exit(0);

    }
}