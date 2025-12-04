package hr.ht.oss.common.rfa.types.common;

import java.io.Serial;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VersionReference implements Serializable {
	@Serial
    private static final long serialVersionUID = -2383059576295900307L;
	
	@NotNull
	@JsonProperty(value = "id")
	private String id;
	@JsonProperty(value = "href")
	private String href;
	@NotNull
	@JsonProperty(value = "name")
	private String name;
	@JsonProperty(value = "version")
	private String version;
}
