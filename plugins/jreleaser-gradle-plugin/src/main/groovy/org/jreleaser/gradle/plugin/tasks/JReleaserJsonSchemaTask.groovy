/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright 2020-2023 The JReleaser authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jreleaser.gradle.plugin.tasks

import groovy.transform.CompileStatic
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.jreleaser.engine.schema.JsonSchemaGenerator
import org.jreleaser.util.IoUtils

/**
 *
 * @author Andres Almiray
 * @since 1.4.0
 */
@CompileStatic
abstract class JReleaserJsonSchemaTask extends DefaultTask {
    @TaskAction
    void generateJsonSchema() {
        JsonSchemaGenerator.generate(IoUtils.newPrintWriter(System.out))
    }
}
