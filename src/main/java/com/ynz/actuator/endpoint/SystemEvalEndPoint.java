package com.ynz.actuator.endpoint;

import lombok.Data;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
@Endpoint(id="system-details")
public class SystemEvalEndPoint {

    @Data
    public class SystemDetails{
        private String systemTime;
    }

    @ReadOperation
    public SystemDetails getSystemDetails(){
        SystemDetails systemDetails = new SystemDetails();
        systemDetails.systemTime= LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
        return systemDetails;
    }

}
