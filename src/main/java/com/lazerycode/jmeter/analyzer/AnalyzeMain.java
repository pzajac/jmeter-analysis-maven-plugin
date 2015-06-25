/*
 * Copyright 2015 pzajac.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.lazerycode.jmeter.analyzer;

import java.io.File;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * Main class for processing jmeter results.
 */
public class AnalyzeMain {

    public static void main(String arg[]) throws MojoExecutionException, MojoFailureException {
        AnalyzeMojo mojo = new AnalyzeMojo();
        if (arg.length == 2) {

            mojo.setSource(arg[0]);
            mojo.setTargetDirectory(new File(arg[1]));
            mojo.execute();
        } else {
            System.out.println("Execute with tho parameters: <inputFile.jtl> <outputDir>");
        }
    }
}
