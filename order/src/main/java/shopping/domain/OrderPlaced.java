package shopping.domain;

import shopping.domain.*;
import shopping.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Integer id;
    private Integer productId;
    private Integer qty;
    private Integer costomerId;

    public OrderPlaced(Order aggregate){
        super(aggregate);
    }
    public OrderPlaced(){
        super();
    }
}
