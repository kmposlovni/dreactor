package hr.ht.oss.common.rfa.types.common;

import jakarta.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serial;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class GenericCharacteristicSpecification extends GenericTMFObject {
	@Serial
    private static final long serialVersionUID = 8161879551204664344L;
	
	@JsonProperty(value = "configurable")
	private Boolean configurable;
	@JsonProperty(value = "extensible")
	private Boolean extensible;
	@JsonProperty(value = "isUnique")
	private Boolean isUnique;
	@JsonProperty(value = "maxCardinality")
	private Integer maxCardinality;
	@JsonProperty(value = "minCardinality")
	private Integer minCardinality;
	@NotNull
	@JsonProperty(value = "name")
	private String name;
	@JsonProperty(value = "regex")
	private String regex;
	@JsonProperty(value = "valueType")
	private String valueType;
}
