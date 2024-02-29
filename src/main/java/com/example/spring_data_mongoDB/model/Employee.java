package com.example.spring_data_mongoDB.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "employee")
public class Employee {

    @Id
    private String id; // Используем String для id, так как MongoDB использует ObjectId
    private String name;
    private String surname;
    private String age;


}
