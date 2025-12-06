package hr.ht.oss.common.rfa.types.resource;

import jakarta.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import hr.ht.oss.common.rfa.types.common.GenericRelationship;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

@Data
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResourceSpecificationRelationship extends GenericRelationship {
	@Serial
    private static final long serialVersionUID = 3988594917412426281L;
	
	@NotNull
	@JsonProperty(value = "resourceSpecification")
	private ResourceSpecification resourceSpecification;
}
