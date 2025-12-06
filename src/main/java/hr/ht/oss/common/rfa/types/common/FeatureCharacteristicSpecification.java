package hr.ht.oss.common.rfa.types.common;

import java.io.Serial;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeatureCharacteristicSpecification extends GenericCharacteristicSpecification {
	@Serial
    private static final long serialVersionUID = 389730585516377279L;
	
	@JsonProperty(value = "featureSpecCharacteristicValues")
	private List<CharacteristicValueSpecification> featureSpecCharacteristicValues;
}
