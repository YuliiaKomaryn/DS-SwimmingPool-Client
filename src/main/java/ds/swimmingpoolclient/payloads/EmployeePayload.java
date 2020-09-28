package ds.swimmingpoolclient.payloads;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeePayload {
    private String name;
    private String surname;
    private double salary;
    private String post;
}

