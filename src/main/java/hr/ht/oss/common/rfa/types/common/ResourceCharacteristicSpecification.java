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
public class ResourceCharacteristicSpecification extends GenericCharacteristicSpecification {
	@Serial
    private static final long serialVersionUID = -4672565634478545369L;
	
	@JsonProperty(value = "resourceSpecCharacteristicValues")
	private List<CharacteristicValueSpecification> resourceSpecCharacteristicValues;
}
