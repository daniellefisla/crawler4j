/*-
 * #%L
 * de.hs-heilbronn.mi:crawler4j-core
 * %%
 * Copyright (C) 2010 - 2021 crawler4j-fork (pre-fork: Yasser Ganjisaffar)
 * %%
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
 * #L%
 */
package edu.uci.ics.crawler4j.crawler.exceptions;

/**
 * Created by Avi Hayun on 12/8/2014.
 * Thrown when trying to fetch a page which is bigger than allowed size
 */
public class PageBiggerThanMaxSizeException extends Exception {
    long pageSize;

    public PageBiggerThanMaxSizeException(long pageSize) {
        super("Aborted fetching of this URL as it's size ( " + pageSize +
              " ) exceeds the maximum size");
        this.pageSize = pageSize;
    }

    public long getPageSize() {
        return pageSize;
    }
}