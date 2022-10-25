package shopping.domain;

import shopping.domain.*;
import shopping.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Integer id;
    private Integer productId;
    private Integer qty;
    private Integer costomerId;
}


