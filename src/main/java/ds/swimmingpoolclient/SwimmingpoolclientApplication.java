package ds.swimmingpoolclient;

import ds.swimmingpoolclient.controllers.ClientTest;
import ds.swimmingpoolclient.controllers.EmployeeTest;
import ds.swimmingpoolclient.controllers.PassTest;
import ds.swimmingpoolclient.controllers.StuffRentTest;
import ds.swimmingpoolclient.models.Pass;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwimmingpoolclientApplication {

    public static void main(String[] args) {
        try{
            EmployeeTest employeeTest = new EmployeeTest();
            ClientTest clientTest = new ClientTest();
            StuffRentTest stuffRentTest = new StuffRentTest();

            employeeTest.testService();
            clientTest.testService();
            stuffRentTest.test();



        } catch (Exception e){
            System.out.println(e.toString());
        }

    }

}
