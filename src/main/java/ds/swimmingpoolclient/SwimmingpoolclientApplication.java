package ds.swimmingpoolclient;

import ds.swimmingpoolclient.controllers.ClientTest;
import ds.swimmingpoolclient.controllers.EmployeeTest;
import ds.swimmingpoolclient.controllers.PassTest;
import ds.swimmingpoolclient.controllers.StuffRent;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwimmingpoolclientApplication {

    public static void main(String[] args) {
        try{
            EmployeeTest employeeTest = new EmployeeTest();
            ClientTest clientTest = new ClientTest();
            StuffRent stuffRent = new StuffRent();

            employeeTest.testService();
            clientTest.testService();
            stuffRent.test();




        } catch (Exception e){
            System.out.println(e.toString());
        }

    }

}
