package hr.ht.oss.common.rfa.types.common;

import jakarta.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

@Data
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeatureSpecificationRelationship extends GenericRelationship {
	@Serial
    private static final long serialVersionUID = -578753585310722117L;
	
	@NotNull
	@JsonProperty(value = "featureSpecification")
	private FeatureSpecification featureSpecification;
}
