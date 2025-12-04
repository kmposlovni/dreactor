package hr.ht.oss.common.rfa.types.common;

import java.io.Serial;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class GenericTMFObject implements Serializable {
	@Serial
    private static final long serialVersionUID = 7453250493715300611L;
	
	@JsonProperty(value = "entityBaseType")
	private String entityBaseType;
	@JsonProperty(value = "entitySchemaLocation")
	private String entitySchemaLocation;
	@JsonProperty(value = "entityType")
	private String entityType;
}
