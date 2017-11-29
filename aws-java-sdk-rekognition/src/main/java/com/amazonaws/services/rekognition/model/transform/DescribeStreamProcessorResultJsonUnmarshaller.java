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
package com.amazonaws.services.rekognition.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeStreamProcessorResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStreamProcessorResultJsonUnmarshaller implements Unmarshaller<DescribeStreamProcessorResult, JsonUnmarshallerContext> {

    public DescribeStreamProcessorResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeStreamProcessorResult describeStreamProcessorResult = new DescribeStreamProcessorResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeStreamProcessorResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    describeStreamProcessorResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StreamProcessorArn", targetDepth)) {
                    context.nextToken();
                    describeStreamProcessorResult.setStreamProcessorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeStreamProcessorResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    context.nextToken();
                    describeStreamProcessorResult.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTimestamp", targetDepth)) {
                    context.nextToken();
                    describeStreamProcessorResult.setCreationTimestamp(context.getUnmarshaller(java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdateTimestamp", targetDepth)) {
                    context.nextToken();
                    describeStreamProcessorResult.setLastUpdateTimestamp(context.getUnmarshaller(java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("Input", targetDepth)) {
                    context.nextToken();
                    describeStreamProcessorResult.setInput(StreamProcessorInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Output", targetDepth)) {
                    context.nextToken();
                    describeStreamProcessorResult.setOutput(StreamProcessorOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    describeStreamProcessorResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Settings", targetDepth)) {
                    context.nextToken();
                    describeStreamProcessorResult.setSettings(StreamProcessorSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeStreamProcessorResult;
    }

    private static DescribeStreamProcessorResultJsonUnmarshaller instance;

    public static DescribeStreamProcessorResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeStreamProcessorResultJsonUnmarshaller();
        return instance;
    }
}
