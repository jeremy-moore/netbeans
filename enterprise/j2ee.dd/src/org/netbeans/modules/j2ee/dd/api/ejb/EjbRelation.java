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

package org.netbeans.modules.j2ee.dd.api.ejb;

//
// This interface has all of the bean info accessor methods.
//
import org.netbeans.modules.j2ee.dd.api.common.CommonDDBean;
import org.netbeans.modules.j2ee.dd.api.common.DescriptionInterface;

public interface EjbRelation extends CommonDDBean, DescriptionInterface {

    public static final String EJB_RELATION_NAME = "EjbRelationName";	// NOI18N
    public static final String EJBRELATIONNAMEID = "EjbRelationNameId";	// NOI18N
    public static final String EJB_RELATIONSHIP_ROLE = "EjbRelationshipRole";	// NOI18N
    public static final String EJB_RELATIONSHIP_ROLE2 = "EjbRelationshipRole2";	// NOI18N
        
    public void setEjbRelationName(String value);
    
    public String getEjbRelationName();
    
    public void setEjbRelationNameId(java.lang.String value);

    public java.lang.String getEjbRelationNameId();
    
    public void setEjbRelationshipRole(EjbRelationshipRole value);
    
    public EjbRelationshipRole getEjbRelationshipRole();
    
    public EjbRelationshipRole newEjbRelationshipRole();
    
    public void setEjbRelationshipRole2(EjbRelationshipRole value);
    
    public EjbRelationshipRole getEjbRelationshipRole2();
        
}

