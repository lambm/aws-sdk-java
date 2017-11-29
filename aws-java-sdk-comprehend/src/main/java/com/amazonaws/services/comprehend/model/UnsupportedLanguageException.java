/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.comprehend.model;

import javax.annotation.Generated;

/**
 * <p>
 * Amazon Comprehend can't process the language of the input text. For all APIs except
 * <code>DetectDominantLanguage</code>, Amazon Comprehend accepts only English or Spanish text. For the
 * <code>DetectDominantLanguage</code> API, Amazon Comprehend detects 100 languages. For a list of languages, see
 * <a>how-languages</a>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnsupportedLanguageException extends com.amazonaws.services.comprehend.model.AmazonComprehendException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new UnsupportedLanguageException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public UnsupportedLanguageException(String message) {
        super(message);
    }

}
