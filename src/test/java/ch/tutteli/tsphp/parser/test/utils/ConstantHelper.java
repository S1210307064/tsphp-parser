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
package ch.tutteli.tsphp.parser.test.utils;

import java.util.Arrays;
import java.util.Collection;

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

        return Arrays.asList(new Object[][]{
                    {
                        prefix + "const bool a=true;" + appendix,
                        prefixExpected + "(constants bool (a true))" + appendixExpected
                    },
                    {
                        prefix + "const bool a=true, b=false;" + appendix,
                        prefixExpected + "(constants bool (a true) (b false))" + appendixExpected
                    },
                    {
                        prefix + "const int a=1,b=2;" + appendix,
                        prefixExpected + "(constants int (a 1) (b 2))" + appendixExpected
                    },
                    {
                        prefix + "const float a=1.0,b=2.0,c=null;" + appendix,
                        prefixExpected + "(constants float (a 1.0) (b 2.0) (c null))" + appendixExpected
                    },
                    {
                        prefix + "const string a=1,b=\"2\",c=null,d='2';" + appendix,
                        prefixExpected + "(constants string (a 1) (b \"2\") (c null) (d '2'))" + appendixExpected
                    }
                });
    }
}
