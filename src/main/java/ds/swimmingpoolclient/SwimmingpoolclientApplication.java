package ds.swimmingpoolclient;

import ds.swimmingpoolclient.controllers.ClientTest;
import ds.swimmingpoolclient.controllers.EmployeeTest;
import ds.swimmingpoolclient.models.SwimmingStuff;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwimmingpoolclientApplication {

    public static void main(String[] args) {
        try{
            EmployeeTest employeeTest = new EmployeeTest();
            ClientTest clientTest = new ClientTest();
            SwimmingStuff swimmingStuffTest = new SwimmingStuff();

            employeeTest.testService();
            clientTest.testService();



        } catch (Exception e){
            System.out.println(e.toString());
        }

    }

}
