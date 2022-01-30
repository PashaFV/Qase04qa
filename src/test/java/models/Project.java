package models;

import lombok.Builder;
import lombok.Data;
import org.testng.annotations.Test;

@Data
@Builder
public class Project {

    String title;
    String code;
    String description;
    String access;
    String group;


}
