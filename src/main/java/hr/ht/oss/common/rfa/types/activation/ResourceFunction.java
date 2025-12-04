package hr.ht.oss.common.rfa.types.activation;

import java.io.Serial;
import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import hr.ht.oss.common.rfa.types.common.Characteristic;
import hr.ht.oss.common.rfa.types.common.GenericTMFObject;
import hr.ht.oss.common.rfa.types.common.RelatedParty;
import hr.ht.oss.common.rfa.types.common.ScheduleReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement(name = "resourceFunction")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResourceFunction extends GenericTMFObject {
	@Serial
    private static final long serialVersionUID = 5800250061635124806L;
	
	@JsonProperty(value = "id")
	private String id;
	@JsonProperty(value = "href")
	private String href;
	@NotNull
	@JsonProperty(value = "name")
	private String name;
	@JsonProperty(value = "description")
	private String description;
	@JsonProperty(value = "type")
	private String type;
	@JsonProperty(value = "version")
	private String version;
	@JsonProperty(value = "role")
	private String role;
	@Valid
	@JsonProperty(value = "locationReference")
	private LocationReference locationReference;
	@JsonProperty(value = "autoModification")
	private String autoModification;
	@JsonProperty(value = "priority")
	private Integer priority;
	@JsonProperty(value = "state")
	private String state;
	@JsonProperty(value = "subState")
	private String subState;
	@Valid
	@JsonProperty(value = "scheduleReferences")
	private List<ScheduleReference> scheduleReferences;
	@Valid
	@JsonProperty(value = "sapReferences")
	private List<SAPReference> sapReferences;
	@Valid
	@JsonProperty(value = "resourceFunctionSpecificationReference")
	private ResourceFunctionSpecificationReference resourceFunctionSpecificationReference;
	@Valid
	@JsonProperty(value = "characteristics")
	private List<Characteristic> characteristics;
	@Valid
	@JsonProperty(value = "features")
	private List<Feature> features;
	@Valid
	@JsonProperty(value = "featureGroups")
	private List<FeatureGroup> featureGroups;
	@Valid
	@JsonProperty(value = "supportingResourceFunctions")
	private List<ResourceFunction> supportingResourceFunctions;
	@Valid
	@JsonProperty(value = "connectivities")
	private List<Connectivity> connectivities;
	@Valid
	@JsonProperty(value = "relatedParties")
	private List<RelatedParty> relatedParties;
}
