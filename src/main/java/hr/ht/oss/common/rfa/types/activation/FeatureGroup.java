package hr.ht.oss.common.rfa.types.activation;

import java.io.Serial;
import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import hr.ht.oss.common.rfa.types.common.Characteristic;
import hr.ht.oss.common.rfa.types.common.GenericTMFObject;
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
public class FeatureGroup extends GenericTMFObject {
	@Serial
    private static final long serialVersionUID = -9211692819398499280L;
	
	@NotNull
	@JsonProperty(value = "name")
	private String name;
	@Valid
	@JsonProperty(value = "characteristics")
	private List<Characteristic> characteristics;
	@Valid
	@JsonProperty(value = "features")
	private List<Feature> features;
}
