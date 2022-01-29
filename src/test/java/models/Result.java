package models;

import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class Result {
    String title;
    String code;
    Counts counts;

}