package com.qluser.service;

import com.qluser.service.dto.GetEmployeeByIdRequest;
import com.qluser.service.dto.GetEmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Service
public class CallSoapService extends WebServiceGatewaySupport {

    @Autowired
    private WebServiceTemplate template;

    public GetEmployeeResponse getLoanStatus(GetEmployeeByIdRequest request) {
        GetEmployeeResponse acknowledgement = (GetEmployeeResponse) template.marshalSendAndReceive(request);
        return acknowledgement;
    }
}
