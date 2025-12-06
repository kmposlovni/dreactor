package hr.ht.oss.common.rfa.types.resource;

import java.io.Serial;
import java.util.List;

import jakarta.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import hr.ht.oss.common.rfa.types.common.Characteristic;
import hr.ht.oss.common.rfa.types.common.GenericTMFObject;
import hr.ht.oss.common.rfa.types.common.RelatedParty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import hr.ht.oss.common.rfa.types.common.VersionReference;

@Data
@EqualsAndHashCode(callSuper = false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Resource extends GenericTMFObject {
	@Serial
    private static final long serialVersionUID = 1000267636323445579L;
	
	@JsonProperty(value = "id")
	private String id;
	@JsonProperty(value = "href")
	private String href;
	@JsonProperty(value = "name")
	private String name;
	@JsonProperty(value = "description")
	private String description;
	@JsonProperty(value = "version")
	private String version;
	@Valid
	@JsonProperty(value = "resourceSpecification")
	private ResourceSpecification resourceSpecification;
	@JsonProperty(value = "state")
	private String state;
	@JsonProperty(value = "operationalState")
	private String operationalState;
	@JsonProperty(value = "usageState")
	private String usageState;
	@JsonProperty(value = "serialNumber")
	private String serialNumber;
	@JsonProperty(value = "value")
	private String value;
	@Valid
	@JsonProperty(value = "categories")
	private List<VersionReference> categories;
	@Valid
	@JsonProperty(value = "characteristics")
	private List<Characteristic> characteristics;
	@Valid
	@JsonProperty(value = "resourceRelationships")
	private List<ResourceRelationship> resourceRelationships;
	@Valid
	@JsonProperty(value = "relatedParties")
	private List<RelatedParty> relatedParties;
}
