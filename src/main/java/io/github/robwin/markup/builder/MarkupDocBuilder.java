/*
 *
 *  Copyright 2015 Robert Winkler
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *
 */
package io.github.robwin.markup.builder;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/**
 * @author Robert Winkler
 */
public interface MarkupDocBuilder {
    MarkupDocBuilder documentTitle(String title);

    MarkupDocBuilder documentTitleWithAttributes(String title);

    MarkupDocBuilder sectionTitleLevel1(String title);

    MarkupDocBuilder sectionTitleLevel2(String title);

    MarkupDocBuilder sectionTitleLevel3(String title);

    MarkupDocBuilder textLine(String text);

    MarkupDocBuilder paragraph(String text);

    MarkupDocBuilder listing(String text);

    MarkupDocBuilder source(String text, String language);

    MarkupDocBuilder boldTextLine(String text);

    MarkupDocBuilder italicTextLine(String text);

    MarkupDocBuilder unorderedList(List<String> list);

    MarkupDocBuilder tableWithHeaderRow(List<String> rowsInPSV);

    MarkupDocBuilder crossReference(String text);

    MarkupDocBuilder newLine();

    /**
     * Returns a string representation of the document.
     */
    String toString();

    /**
     * Writes the content of the builder to a file and clears the builder.
     *
     * @param directory the directory where the generated file should be stored
     * @param fileName the name of the file
     * @param charset the the charset to use for encoding
     * @throws java.io.IOException if the file cannot be written
     */
    void writeToFile(String directory, String fileName, Charset charset) throws IOException;
}
