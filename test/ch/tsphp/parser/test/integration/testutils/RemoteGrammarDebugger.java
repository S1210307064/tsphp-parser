/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

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