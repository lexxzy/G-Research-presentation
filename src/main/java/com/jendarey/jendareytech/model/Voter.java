package com.jendarey.jendareytech.model;



import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
public class Voter {







    private  String firstName;
    private String lastName;

    private String phoneNo;

    private String country;

    private String yearsOfExperience;
    private  String email;
    private  DevopsTools devopsTools;








}
