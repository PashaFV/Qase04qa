package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseStatus {

    boolean status;
    String errorMessage;
    //ErrorFields errorFields;
    Result result;

}
