package hr.ht.oss.common.rfa.types.resource;

import java.io.Serial;
import java.time.OffsetDateTime;
import java.util.List;

import jakarta.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import hr.ht.oss.common.rfa.types.common.FeatureSpecification;
import hr.ht.oss.common.rfa.types.common.GenericTMFObject;
import hr.ht.oss.common.rfa.types.common.RelatedParty;
import hr.ht.oss.common.rfa.types.common.ResourceCharacteristicSpecification;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResourceSpecification extends GenericTMFObject {
	@Serial
    private static final long serialVersionUID = -3745211288517145367L;
	
	@JsonProperty(value = "id")
	private String id;
	@JsonProperty(value = "name")
	private String name;
	@JsonProperty(value = "category")
	private String category;
	@JsonProperty(value = "description")
	private String description;
	@JsonProperty(value = "isBundle")
	private Boolean isBundle;
	@JsonProperty(value = "lastUpdate")
	private OffsetDateTime lastUpdate;
	@JsonProperty(value = "state")
	private String state;
	@JsonProperty(value = "version")
	private String version;
	@Valid
	@JsonProperty(value = "featureSpecifications")
	private List<FeatureSpecification> featureSpecifications;
	@Valid
	@JsonProperty(value = "relatedParties")
	private List<RelatedParty> relatedParties;
	@Valid
	@JsonProperty(value = "resourceSpecCharacteristics")
	private List<ResourceCharacteristicSpecification> resourceSpecCharacteristics;
	@Valid
	@JsonProperty(value = "resourceSpecRelationships")
	private List<ResourceSpecificationRelationship> resourceSpecRelationships;
}
