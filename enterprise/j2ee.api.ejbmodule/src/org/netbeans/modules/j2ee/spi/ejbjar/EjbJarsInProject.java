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

package org.netbeans.modules.j2ee.spi.ejbjar;

import org.netbeans.modules.j2ee.api.ejbjar.EjbJar;
import org.openide.filesystems.FileObject;

/**
 * Put an implementation of this interface into lookup of an ejb project.
 * This is a complementary interface to EjbJarProvider to allow clients find all
 * ejb modules within a project w/o specifying a concrete file.
 * @see EjbJar#getEjbJar
 * @author Pavel Buzek
 */
public interface EjbJarsInProject {

    /**
     * Get EjbJar for all ejb modules in a given project.
     *
     * @return an array of EjbJar for all modules in a project
     * @see EjbJarFactory
     */
    EjbJar[] getEjbJars();
    
}
