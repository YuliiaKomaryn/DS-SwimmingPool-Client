package ds.swimmingpoolclient.models;

import ds.swimmingpoolclient.payloads.PassPayload;
import ds.swimmingpoolclient.utils.FData;
import lombok.Data;
import lombok.ToString;


@Data
@ToString
public class Pass {
    private String pass_id;
    String type;
    int price;

}
