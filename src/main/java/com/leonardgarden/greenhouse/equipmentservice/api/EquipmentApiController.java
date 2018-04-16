package com.leonardgarden.greenhouse.equipmentservice.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.leonardgarden.greenhouse.equipmentservice.service.IEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-15T16:33:30.590-05:00")

@Controller
public class EquipmentApiController implements EquipmentApi {

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    public EquipmentApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @Override
    public Optional<ObjectMapper> getObjectMapper() {
        return Optional.ofNullable(objectMapper);
    }

    @Override
    public Optional<HttpServletRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Void> equipmentEquipmentIdPost(@PathVariable Long equipmentId, String action, String value) {
        System.out.println(""+0+equipmentId+"");
        System.out.println("Action requested on id "+equipmentId+": "+action+" value given: "+value);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
