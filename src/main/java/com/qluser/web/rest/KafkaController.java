package com.qluser.web.rest;

import com.qluser.service.CallSoapService;
import com.qluser.service.Producers;
import com.qluser.service.dto.GetEmployeeByIdRequest;
import com.qluser.service.dto.GetEmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class KafkaController {

    @Autowired
    Producers producers;

    @Autowired
    private CallSoapService callSoapService;

    @PostMapping("/test")
    public GetEmployeeResponse getById(@RequestBody GetEmployeeByIdRequest dto) {
        return callSoapService.getLoanStatus(dto);
    }

    @GetMapping("/producersMsg")
    public void getmessageFromClient(@RequestParam("message") String message) {
        producers.sendMsgToTopic(message);
    }
}
