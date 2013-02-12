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
package ch.tutteli.tsphp.parser.test.testutils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
public class ConstantHelper
{

    private ConstantHelper() {
    }

    public static Collection<Object[]> testStrings(String prefix, String appendix,
            String prefixExpected, String appendixExpected) {
        List<Object[]> collection = new ArrayList<>();

        String[] types = TypeHelper.getClassInterfaceTypes();
        for (String type : types) {
            collection.add(new Object[]{
                        prefix + "const int b=" + type + "::a" + ", c=" + type + "::d;" +  appendix,
                        prefixExpected
                        + "(consts int (b (sMemAccess " + type + " a)) (c (sMemAccess " + type + " d)))"
                        + appendixExpected
                    });
        }

        types = TypeHelper.getScalarTypes();
        for (String type : types) {
            collection.add(new Object[]{
                        prefix + "const " + type + " a=true;" + appendix,
                        prefixExpected + "(consts " + type + " (a true))" + appendixExpected
                    });
            collection.add(new Object[]{
                        prefix + "const " + type + " a=true, b=false;" + appendix,
                        prefixExpected + "(consts " + type + " (a true) (b false))" + appendixExpected
                    });
            collection.add(new Object[]{
                        prefix + "const " + type + " a=1,b=2;" + appendix,
                        prefixExpected + "(consts " + type + " (a 1) (b 2))" + appendixExpected
                    });
            collection.add(new Object[]{
                        prefix + "const " + type + " a=1.0,b=2.0,c=null;" + appendix,
                        prefixExpected + "(consts " + type + " (a 1.0) (b 2.0) (c null))" + appendixExpected
                    });
            collection.add(new Object[]{
                        prefix + "const " + type + " a=1,b=\"2\",c=null,d='2';" + appendix,
                        prefixExpected + "(consts " + type + " (a 1) (b \"2\") (c null) (d '2'))" + appendixExpected
                    });
        }
        return collection;

    }
}
