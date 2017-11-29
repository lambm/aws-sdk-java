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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetResourceDefinitionVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourceDefinitionVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** Resource definition Id. */
    private String resourceDefinitionId;
    /** Resource definition version Id. */
    private String resourceDefinitionVersionId;

    /**
     * Resource definition Id.
     * 
     * @param resourceDefinitionId
     *        Resource definition Id.
     */

    public void setResourceDefinitionId(String resourceDefinitionId) {
        this.resourceDefinitionId = resourceDefinitionId;
    }

    /**
     * Resource definition Id.
     * 
     * @return Resource definition Id.
     */

    public String getResourceDefinitionId() {
        return this.resourceDefinitionId;
    }

    /**
     * Resource definition Id.
     * 
     * @param resourceDefinitionId
     *        Resource definition Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceDefinitionVersionRequest withResourceDefinitionId(String resourceDefinitionId) {
        setResourceDefinitionId(resourceDefinitionId);
        return this;
    }

    /**
     * Resource definition version Id.
     * 
     * @param resourceDefinitionVersionId
     *        Resource definition version Id.
     */

    public void setResourceDefinitionVersionId(String resourceDefinitionVersionId) {
        this.resourceDefinitionVersionId = resourceDefinitionVersionId;
    }

    /**
     * Resource definition version Id.
     * 
     * @return Resource definition version Id.
     */

    public String getResourceDefinitionVersionId() {
        return this.resourceDefinitionVersionId;
    }

    /**
     * Resource definition version Id.
     * 
     * @param resourceDefinitionVersionId
     *        Resource definition version Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceDefinitionVersionRequest withResourceDefinitionVersionId(String resourceDefinitionVersionId) {
        setResourceDefinitionVersionId(resourceDefinitionVersionId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResourceDefinitionId() != null)
            sb.append("ResourceDefinitionId: ").append(getResourceDefinitionId()).append(",");
        if (getResourceDefinitionVersionId() != null)
            sb.append("ResourceDefinitionVersionId: ").append(getResourceDefinitionVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourceDefinitionVersionRequest == false)
            return false;
        GetResourceDefinitionVersionRequest other = (GetResourceDefinitionVersionRequest) obj;
        if (other.getResourceDefinitionId() == null ^ this.getResourceDefinitionId() == null)
            return false;
        if (other.getResourceDefinitionId() != null && other.getResourceDefinitionId().equals(this.getResourceDefinitionId()) == false)
            return false;
        if (other.getResourceDefinitionVersionId() == null ^ this.getResourceDefinitionVersionId() == null)
            return false;
        if (other.getResourceDefinitionVersionId() != null && other.getResourceDefinitionVersionId().equals(this.getResourceDefinitionVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceDefinitionId() == null) ? 0 : getResourceDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getResourceDefinitionVersionId() == null) ? 0 : getResourceDefinitionVersionId().hashCode());
        return hashCode;
    }

    @Override
    public GetResourceDefinitionVersionRequest clone() {
        return (GetResourceDefinitionVersionRequest) super.clone();
    }

}
