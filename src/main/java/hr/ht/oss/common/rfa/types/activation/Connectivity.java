package hr.ht.oss.common.rfa.types.activation;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import hr.ht.oss.common.rfa.types.common.GenericTMFObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

@Data
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Connectivity extends GenericTMFObject {
	@Serial
    private static final long serialVersionUID = -7057243770998300197L;
	
	@Valid
	@NotNull
	@JsonProperty(value = "source")
	private ResourceFunctionReference source;
	@Valid
	@NotNull
	@JsonProperty(value = "target")
	private ResourceFunctionReference target;
	@NotNull
	@JsonProperty(value = "relationship")
	private String relationship;
}
