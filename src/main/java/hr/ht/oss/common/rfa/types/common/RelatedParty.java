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
public class RelatedParty extends GenericTMFObject {
	@Serial
    private static final long serialVersionUID = 4890019025241476741L;
	
	@JsonProperty(value = "id")
	private String id;
	@NotNull
	@JsonProperty(value = "href")
	private String href;
	@NotNull
	@JsonProperty(value = "role")
	private String role;
}
