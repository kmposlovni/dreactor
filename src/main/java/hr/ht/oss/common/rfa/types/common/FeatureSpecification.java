package hr.ht.oss.common.rfa.types.common;

import java.io.Serial;
import java.util.List;

import jakarta.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeatureSpecification extends GenericTMFObject {
	@Serial
    private static final long serialVersionUID = 4387584415519163045L;
	
	@JsonProperty(value = "id")
	private String id;
	@JsonProperty(value = "isBundle")
	private Boolean isBundle;
	@JsonProperty(value = "isEnabled")
	private Boolean isEnabled;
	@JsonProperty(value = "name")
	private String name;
	@JsonProperty(value = "version")
	private String version;
	@Valid
	@JsonProperty(value = "constraints")
	private List<ConstraintReference> constraints;
	@Valid
	@JsonProperty(value = "featureSpecCharacteristics")
	private List<FeatureCharacteristicSpecification> featureSpecCharacteristics;
	@Valid
	@JsonProperty(value = "featureSpecRelationships")
	private List<FeatureSpecificationRelationship> featureSpecRelationships;
}
