package ds.swimmingpoolclient.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SwimmingStuffPayload {
    private String type;
    private int price;
}
