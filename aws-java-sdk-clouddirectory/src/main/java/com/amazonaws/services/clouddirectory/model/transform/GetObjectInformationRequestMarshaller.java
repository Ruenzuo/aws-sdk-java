/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.clouddirectory.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.clouddirectory.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetObjectInformationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetObjectInformationRequestMarshaller {

    private static final MarshallingInfo<String> DIRECTORYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("x-amz-data-partition").build();
    private static final MarshallingInfo<StructuredPojo> OBJECTREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ObjectReference").build();
    private static final MarshallingInfo<String> CONSISTENCYLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("x-amz-consistency-level").build();

    private static final GetObjectInformationRequestMarshaller instance = new GetObjectInformationRequestMarshaller();

    public static GetObjectInformationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetObjectInformationRequest getObjectInformationRequest, ProtocolMarshaller protocolMarshaller) {

        if (getObjectInformationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getObjectInformationRequest.getDirectoryArn(), DIRECTORYARN_BINDING);
            protocolMarshaller.marshall(getObjectInformationRequest.getObjectReference(), OBJECTREFERENCE_BINDING);
            protocolMarshaller.marshall(getObjectInformationRequest.getConsistencyLevel(), CONSISTENCYLEVEL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
