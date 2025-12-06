package hr.ht.oss.common.rfa.types.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serial;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CharacteristicValueSpecification extends GenericTMFObject {
	@Serial
    private static final long serialVersionUID = 5893826454279099422L;
	
	@JsonProperty(value = "isDefault")
	private Boolean isDefault;
	@JsonProperty(value = "rangeInterval")
	private String rangeInterval;
	@JsonProperty(value = "regex")
	private String regex;
	@JsonProperty(value = "unitOfMeasure")
	private String unitOfMeasure;
	@JsonProperty(value = "valueFrom")
	private Integer valueFrom;
	@JsonProperty(value = "valueTo")
	private Integer valueTo;
	@JsonProperty(value = "valueType")
	private String valueType;
	@JsonProperty(value = "value")
	private String value;
}
