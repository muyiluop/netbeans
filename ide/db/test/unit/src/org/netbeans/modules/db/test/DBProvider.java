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

package org.netbeans.modules.db.test;

import java.sql.Connection;

/**
 *
 * @author David Van Couvering
 */
public interface DBProvider {

    public void dropView(Connection conn, String schemaName, String viewname) throws Exception;

    void createSchema(Connection conn, String schemaName) throws Exception;

    void createTestTable(Connection conn, String schemaName, String tableName, String idName) throws Exception;

    void dropSchema(Connection conn, String schemaName) throws Exception;

    void dropTable(Connection conn, String schemaName, String tableName) throws Exception;

    void setSchema(Connection conn, String schemaName) throws Exception;

    boolean tableExists(Connection conn, String schemaName, String tableName) throws Exception;

    boolean schemaExists(Connection conn, String schemaName) throws Exception;

    boolean columnInIndex(Connection conn, String schemaName, String tableName, String colname, String indexName) throws Exception;

}
