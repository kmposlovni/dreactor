package hr.ht.oss.common.rfa.types.common;

import java.io.Serial;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotNull;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement(name = "error")
@XmlAccessorType(XmlAccessType.FIELD)
public class HALError implements Serializable {
	@Serial
    private static final long serialVersionUID = 1759826392503105814L;
	
	@NotNull
	@JsonProperty(value = "id")
	private String id;
	@NotNull
	@JsonProperty(value = "code")
	private String code;
	@NotNull
	@JsonProperty(value = "timestamp")
	private String timestamp;
	@NotNull
	@JsonProperty(value = "message")
	private String message;
	@JsonProperty(value = "retryable")
	private Boolean retryable;
	@JsonProperty(value = "severity")
	private String severity;
	@JsonProperty(value = "details")
	private String details;
}
