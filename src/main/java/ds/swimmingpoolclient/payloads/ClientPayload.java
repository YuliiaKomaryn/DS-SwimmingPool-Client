package ds.swimmingpoolclient.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClientPayload {
    private String name;
    private String surname;
    private Double temperature;
}
