package hr.ht.oss.common.rfa.types.common;

import java.io.Serial;
import java.io.Serializable;

import jakarta.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class GenericRelationship implements Serializable {
	public enum TypeOfReference {
		reference,
		value
	}
	public enum Type {
		isChildOf,
		isParentFor,
		isContaining,
		isTerminatedTo,
		isAssociatedTo,
		isInSDERadius,
		isCableConnectedTo,
		isMDFLocation
	}
	
	@Serial
    private static final long serialVersionUID = -160227695665512255L;
	
	@JsonProperty(value = "id")
	private String id;
	@NotNull
	@JsonProperty(value = "type")
	private Type type;
	@JsonProperty(value = "role")
	private String role;
	@JsonProperty(value = "typeOfReference")
	private TypeOfReference typeOfReference;
}
