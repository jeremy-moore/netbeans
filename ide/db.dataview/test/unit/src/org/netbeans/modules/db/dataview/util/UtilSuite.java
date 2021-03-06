/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.db.dataview.util;

import org.netbeans.junit.NbTest;
import org.netbeans.junit.NbTestCase;
import org.netbeans.junit.NbTestSuite;

/**
 *
 * @author jawed
 */
public class UtilSuite extends NbTestCase {
    
    public UtilSuite(String testName) {
        super(testName);
    }            

    public static NbTest suite() {
        NbTestSuite suite = new NbTestSuite("UtilSuite");
        //suite.addTest(org.netbeans.modules.db.dataview.util.DBReadWriteHelperTest.suite());
        suite.addTest(org.netbeans.modules.db.dataview.util.TimestampTypeTest.suite());
        suite.addTest(org.netbeans.modules.db.dataview.util.DateTypeTest.suite());
        suite.addTest(org.netbeans.modules.db.dataview.util.DataViewUtilsTest.suite());
        suite.addTest(org.netbeans.modules.db.dataview.util.BinaryToStringConverterTest.suite());
        suite.addTest(org.netbeans.modules.db.dataview.util.TimeTypeTest.suite());
        return suite;
    }

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

}
