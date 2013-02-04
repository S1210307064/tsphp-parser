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
package ch.tutteli.tsphp.parser.utils;

import ch.tutteli.tsphp.common.TSPHPAst;
import org.antlr.runtime.CommonToken;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
public class AstHelper
{

    private AstHelper() {
    }

    /**
     * Copied from http://stackoverflow.com/questions/6781019/antlr-duplicate-a-tree
     */
    public static TSPHPAst copyAst(TSPHPAst original) {
        TSPHPAst copy = new TSPHPAst(original.getToken());
        copyAstRecursive(copy, original);
        return copy;
    }

    /**
     * Copied from http://stackoverflow.com/questions/6781019/antlr-duplicate-a-tree
     */
    private static void copyAstRecursive(TSPHPAst copy, TSPHPAst original) {
        if (original.getChildren() != null) {
            for (Object o : original.getChildren()) {

                TSPHPAst originalChild = (TSPHPAst) o;

                // get the token from the original child node
                CommonToken oTok = (CommonToken) originalChild.getToken();

                // create a new token with the same type & text as 'oTok' 
                CommonToken cTok = new CommonToken(oTok.getType(), oTok.getText());

                // copy all attributes from 'oTok' to 'cTok'  
                cTok.setLine(oTok.getLine());
                cTok.setCharPositionInLine(oTok.getCharPositionInLine());
                cTok.setChannel(oTok.getChannel());
                cTok.setStartIndex(oTok.getStartIndex());
                cTok.setStopIndex(oTok.getStopIndex());
                cTok.setTokenIndex(oTok.getTokenIndex());

                // create a new tree node with the 'cTok' as token
                TSPHPAst copyChild = new TSPHPAst(cTok);
                copyChild.scope = originalChild.scope;
                copyChild.symbol = originalChild.symbol;
                

                // set the parent node of the child node
                copyChild.setParent(copy);

                // add the child to the parent node
                copy.addChild(copyChild);

                // make a recursive call to copy deeper
                copyAstRecursive(copyChild, originalChild);
            }
        }
    }
}
