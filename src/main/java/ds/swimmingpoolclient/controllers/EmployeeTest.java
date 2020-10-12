package ds.swimmingpoolclient.controllers;

import ds.swimmingpoolclient.models.Employee;
import ds.swimmingpoolclient.payloads.EmployeePayload;
import ds.swimmingpoolclient.requests.Request;
import ds.swimmingpoolclient.utils.FData;
import ds.swimmingpoolclient.utils.Logging;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;

import java.io.IOException;
import java.util.Random;

public class EmployeeTest {
    private final String endPoint = "http://192.168.56.1:8080/api/employees";

    private final Random rand = new Random();

    public void createEmployee(int employeesNumber) throws IOException {
        for (int i=0; i<employeesNumber; i++){
            Request post = Request.builder()
                    .type(new HttpPost(endPoint))
                    .body(new EmployeePayload(FData.getName(), FData.getSurname(), FData.getSalary(), FData.getPost()))
                    .response(Employee.class).build();
            Logging.printObject(post.send(), "Creating Employee");
        }
    }

    public Employee getRandomEmployee() throws IOException {
        Request get = Request.builder()
                .type(new HttpGet(endPoint))
                .body(null)
                .response(Employee[].class).build();
        Employee[] employees = (Employee[]) get.send();
        return employees[rand.nextInt(employees.length)];
    }

    public void testService() throws IOException{
        System.out.println("Employees service testing".toUpperCase());
        createEmployee(2);
    }
}

