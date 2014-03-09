/*
 Licensed to the Apache Software Foundation (ASF) under one or more
 contributor license agreements.  See the NOTICE file distributed with
 this work for additional information regarding copyright ownership.
 The ASF licenses this file to You under the Apache License, Version 2.0
 (the "License"); you may not use this file except in compliance with
 the License.  You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package org.decore.security;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @author thierry.messer
 *
 * This class is a utility class which provides some encoding / escaping functionality.
 */
public class EncoderUtil {

    /**
     * This method wraps the {@link java.net.URLEncoder} and uses UTF-8 as charset.
     * @param input the String to be url-encoded.
     * @return the url-encoded string derived from <code>input</code>.
     */
    public static String encodeURL(String input) {
        try {
            return URLEncoder.encode(input, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            // Actually UTF-8 should be available on all platforms ..
            return null;
        }
    }
}