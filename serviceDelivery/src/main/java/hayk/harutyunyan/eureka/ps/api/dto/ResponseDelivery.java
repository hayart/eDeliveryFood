package hayk.harutyunyan.eureka.ps.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDelivery {
    private int deliveryId;
    private String status;
}
