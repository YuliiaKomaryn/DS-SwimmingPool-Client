package ds.swimmingpoolclient.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PassPayload {
    String type;
    int price;

}

