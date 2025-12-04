package hr.ht.oss.common.rfa.types.common;

import jakarta.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

@Data
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenericReference extends GenericTMFObject {
	@Serial
    private static final long serialVersionUID = 6800090510217147583L;
	
	@NotNull
	@JsonProperty(value = "id")
	private String id;
	@JsonProperty(value = "href")
	private String href;
}
