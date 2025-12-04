package hr.ht.oss.common.rfa.types.common;

import java.io.Serial;
import java.io.Serializable;

import jakarta.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Characteristic implements Serializable {
	@Serial
    private static final long serialVersionUID = 2949779093676851406L;
	
	@NotNull
	@JsonProperty(value = "name")
	private String name;
	@JsonProperty(value = "value")
	private String value;
}
