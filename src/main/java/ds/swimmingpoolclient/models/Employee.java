package ds.swimmingpoolclient.models;

import lombok.Data;

@Data
public class Employee {
    private String employee_id;
    private String name;
    private String surname;
    private double salary;
    private String post;
}
