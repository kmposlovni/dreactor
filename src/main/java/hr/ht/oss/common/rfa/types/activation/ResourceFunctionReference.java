package hr.ht.oss.common.rfa.types.activation;

import com.fasterxml.jackson.annotation.JsonInclude;

import hr.ht.oss.common.rfa.types.common.GenericReference;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

@Data
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResourceFunctionReference extends GenericReference {
	@Serial
    private static final long serialVersionUID = -3650682709817205948L;
}
