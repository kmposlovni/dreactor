package test.hr.dreactor;

import hr.ht.oss.common.rfa.types.activation.ResourceFunction;
import jakarta.validation.Valid;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Slf4j
@RestController
public class DreactorServices {
    @PostMapping(value = "/resourceFunctionActivationConfiguration/v1/resourceFunction", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Mono<@NonNull ResponseEntity<@NonNull ResourceFunction>> postResourceFunctionV1(@RequestHeader(value = "X-Request-Tracking-Id")String xRequestTrackingId, @RequestHeader(value = "X-Request-Id")String xRequestId, @RequestHeader(value = "X-Request-Session-Id")String xRequestSessionId, @RequestHeader(value = "X-Server-Authentication", required = false)String xServerAuthentication, @Valid @RequestBody()ResourceFunction resourceFunction) throws Exception {
        log.debug("New POST request for resource function {}...", resourceFunction.toString());
        var id = UUID.randomUUID().toString();
        if(resourceFunction.getResourceFunctionSpecificationReference() == null || resourceFunction.getResourceFunctionSpecificationReference().getId() == null)throw new IllegalArgumentException("Resource Function Specification Reference ID cannot be null");
        var specificationId = resourceFunction.getResourceFunctionSpecificationReference().getId();
        if(resourceFunction.getName().startsWith("sip:+"))throw new Exception("Not valid prefix (sip:+)");
        log.info("xRequestTrackingId: {}", xRequestTrackingId);
        log.info("xRequestId: {}", xRequestId);
        log.info("xRequestSessionId: {}", xRequestSessionId);
        log.info("xServerAuthentication: {}", xServerAuthentication);
        log.info("specificationId: {}", specificationId);
        resourceFunction.setId(id);
        return Mono.just(new ResponseEntity<>(resourceFunction, HttpStatus.OK));
    }
}
