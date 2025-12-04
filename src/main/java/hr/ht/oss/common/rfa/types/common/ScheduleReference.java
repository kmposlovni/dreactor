package hr.ht.oss.common.rfa.types.common;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

@Data
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScheduleReference extends GenericReference {
	@Serial
    private static final long serialVersionUID = 2860767990613727737L;
}
