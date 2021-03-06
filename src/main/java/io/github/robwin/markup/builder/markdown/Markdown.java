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
package io.github.robwin.markup.builder.markdown;

import io.github.robwin.markup.builder.Markup;

/**
 * @author Robert Winkler
 */
public enum Markdown implements Markup {
    HARDBREAKS(""),
    TABLE_COLUMN_DELIMITER("|"),
    TABLE_ROW("-"),
    LISTING("```"),
    DOCUMENT_TITLE("# "),
    SECTION_TITLE_LEVEL1("## "),
    SECTION_TITLE_LEVEL2("### "),
    SECTION_TITLE_LEVEL3("### "),
    BOLD("**"),
    ITALIC("*"),
    LIST_ENTRY("* ");

    private final String markup;

    /**
     * @param markup AsciiDoc markup
     */
    private Markdown(final String markup) {
        this.markup = markup;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return markup;
    }
}
