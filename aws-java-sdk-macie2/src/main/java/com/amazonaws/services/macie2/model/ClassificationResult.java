/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides detailed information about a sensitive data finding, including the types and number of occurrences of the
 * data that was found.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01T00:00:00Z/ClassificationResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClassificationResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of occurrences of the data that produced the finding, and the custom data identifiers that detected
     * the data.
     * </p>
     */
    private CustomDataIdentifiers customDataIdentifiers;
    /**
     * <p>
     * The type of content, expressed as a MIME type, that the finding applies to. For example, application/gzip, for a
     * GNU Gzip compressed archive file, or application/pdf, for an Adobe PDF file.
     * </p>
     */
    private String mimeType;
    /**
     * <p>
     * The category and number of occurrences of the sensitive data that produced the finding.
     * </p>
     */
    private java.util.List<SensitiveDataItem> sensitiveData;
    /**
     * <p>
     * The total size, in bytes, of the data that the finding applies to.
     * </p>
     */
    private Long sizeClassified;
    /**
     * <p>
     * The status of the finding.
     * </p>
     */
    private ClassificationResultStatus status;

    /**
     * <p>
     * The number of occurrences of the data that produced the finding, and the custom data identifiers that detected
     * the data.
     * </p>
     * 
     * @param customDataIdentifiers
     *        The number of occurrences of the data that produced the finding, and the custom data identifiers that
     *        detected the data.
     */

    public void setCustomDataIdentifiers(CustomDataIdentifiers customDataIdentifiers) {
        this.customDataIdentifiers = customDataIdentifiers;
    }

    /**
     * <p>
     * The number of occurrences of the data that produced the finding, and the custom data identifiers that detected
     * the data.
     * </p>
     * 
     * @return The number of occurrences of the data that produced the finding, and the custom data identifiers that
     *         detected the data.
     */

    public CustomDataIdentifiers getCustomDataIdentifiers() {
        return this.customDataIdentifiers;
    }

    /**
     * <p>
     * The number of occurrences of the data that produced the finding, and the custom data identifiers that detected
     * the data.
     * </p>
     * 
     * @param customDataIdentifiers
     *        The number of occurrences of the data that produced the finding, and the custom data identifiers that
     *        detected the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassificationResult withCustomDataIdentifiers(CustomDataIdentifiers customDataIdentifiers) {
        setCustomDataIdentifiers(customDataIdentifiers);
        return this;
    }

    /**
     * <p>
     * The type of content, expressed as a MIME type, that the finding applies to. For example, application/gzip, for a
     * GNU Gzip compressed archive file, or application/pdf, for an Adobe PDF file.
     * </p>
     * 
     * @param mimeType
     *        The type of content, expressed as a MIME type, that the finding applies to. For example, application/gzip,
     *        for a GNU Gzip compressed archive file, or application/pdf, for an Adobe PDF file.
     */

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    /**
     * <p>
     * The type of content, expressed as a MIME type, that the finding applies to. For example, application/gzip, for a
     * GNU Gzip compressed archive file, or application/pdf, for an Adobe PDF file.
     * </p>
     * 
     * @return The type of content, expressed as a MIME type, that the finding applies to. For example,
     *         application/gzip, for a GNU Gzip compressed archive file, or application/pdf, for an Adobe PDF file.
     */

    public String getMimeType() {
        return this.mimeType;
    }

    /**
     * <p>
     * The type of content, expressed as a MIME type, that the finding applies to. For example, application/gzip, for a
     * GNU Gzip compressed archive file, or application/pdf, for an Adobe PDF file.
     * </p>
     * 
     * @param mimeType
     *        The type of content, expressed as a MIME type, that the finding applies to. For example, application/gzip,
     *        for a GNU Gzip compressed archive file, or application/pdf, for an Adobe PDF file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassificationResult withMimeType(String mimeType) {
        setMimeType(mimeType);
        return this;
    }

    /**
     * <p>
     * The category and number of occurrences of the sensitive data that produced the finding.
     * </p>
     * 
     * @return The category and number of occurrences of the sensitive data that produced the finding.
     */

    public java.util.List<SensitiveDataItem> getSensitiveData() {
        return sensitiveData;
    }

    /**
     * <p>
     * The category and number of occurrences of the sensitive data that produced the finding.
     * </p>
     * 
     * @param sensitiveData
     *        The category and number of occurrences of the sensitive data that produced the finding.
     */

    public void setSensitiveData(java.util.Collection<SensitiveDataItem> sensitiveData) {
        if (sensitiveData == null) {
            this.sensitiveData = null;
            return;
        }

        this.sensitiveData = new java.util.ArrayList<SensitiveDataItem>(sensitiveData);
    }

    /**
     * <p>
     * The category and number of occurrences of the sensitive data that produced the finding.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSensitiveData(java.util.Collection)} or {@link #withSensitiveData(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sensitiveData
     *        The category and number of occurrences of the sensitive data that produced the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassificationResult withSensitiveData(SensitiveDataItem... sensitiveData) {
        if (this.sensitiveData == null) {
            setSensitiveData(new java.util.ArrayList<SensitiveDataItem>(sensitiveData.length));
        }
        for (SensitiveDataItem ele : sensitiveData) {
            this.sensitiveData.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The category and number of occurrences of the sensitive data that produced the finding.
     * </p>
     * 
     * @param sensitiveData
     *        The category and number of occurrences of the sensitive data that produced the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassificationResult withSensitiveData(java.util.Collection<SensitiveDataItem> sensitiveData) {
        setSensitiveData(sensitiveData);
        return this;
    }

    /**
     * <p>
     * The total size, in bytes, of the data that the finding applies to.
     * </p>
     * 
     * @param sizeClassified
     *        The total size, in bytes, of the data that the finding applies to.
     */

    public void setSizeClassified(Long sizeClassified) {
        this.sizeClassified = sizeClassified;
    }

    /**
     * <p>
     * The total size, in bytes, of the data that the finding applies to.
     * </p>
     * 
     * @return The total size, in bytes, of the data that the finding applies to.
     */

    public Long getSizeClassified() {
        return this.sizeClassified;
    }

    /**
     * <p>
     * The total size, in bytes, of the data that the finding applies to.
     * </p>
     * 
     * @param sizeClassified
     *        The total size, in bytes, of the data that the finding applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassificationResult withSizeClassified(Long sizeClassified) {
        setSizeClassified(sizeClassified);
        return this;
    }

    /**
     * <p>
     * The status of the finding.
     * </p>
     * 
     * @param status
     *        The status of the finding.
     */

    public void setStatus(ClassificationResultStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the finding.
     * </p>
     * 
     * @return The status of the finding.
     */

    public ClassificationResultStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the finding.
     * </p>
     * 
     * @param status
     *        The status of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassificationResult withStatus(ClassificationResultStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCustomDataIdentifiers() != null)
            sb.append("CustomDataIdentifiers: ").append(getCustomDataIdentifiers()).append(",");
        if (getMimeType() != null)
            sb.append("MimeType: ").append(getMimeType()).append(",");
        if (getSensitiveData() != null)
            sb.append("SensitiveData: ").append(getSensitiveData()).append(",");
        if (getSizeClassified() != null)
            sb.append("SizeClassified: ").append(getSizeClassified()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClassificationResult == false)
            return false;
        ClassificationResult other = (ClassificationResult) obj;
        if (other.getCustomDataIdentifiers() == null ^ this.getCustomDataIdentifiers() == null)
            return false;
        if (other.getCustomDataIdentifiers() != null && other.getCustomDataIdentifiers().equals(this.getCustomDataIdentifiers()) == false)
            return false;
        if (other.getMimeType() == null ^ this.getMimeType() == null)
            return false;
        if (other.getMimeType() != null && other.getMimeType().equals(this.getMimeType()) == false)
            return false;
        if (other.getSensitiveData() == null ^ this.getSensitiveData() == null)
            return false;
        if (other.getSensitiveData() != null && other.getSensitiveData().equals(this.getSensitiveData()) == false)
            return false;
        if (other.getSizeClassified() == null ^ this.getSizeClassified() == null)
            return false;
        if (other.getSizeClassified() != null && other.getSizeClassified().equals(this.getSizeClassified()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomDataIdentifiers() == null) ? 0 : getCustomDataIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getMimeType() == null) ? 0 : getMimeType().hashCode());
        hashCode = prime * hashCode + ((getSensitiveData() == null) ? 0 : getSensitiveData().hashCode());
        hashCode = prime * hashCode + ((getSizeClassified() == null) ? 0 : getSizeClassified().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ClassificationResult clone() {
        try {
            return (ClassificationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.ClassificationResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
