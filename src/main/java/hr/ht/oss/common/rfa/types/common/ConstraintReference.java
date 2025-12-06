package hr.ht.oss.common.rfa.types.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serial;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConstraintReference extends GenericReference {
	@Serial
    private static final long serialVersionUID = -6575747743455756606L;
	
	@JsonProperty(value = "version")
	private String version;
}
