package shopping.domain;

import shopping.domain.Shipped;
import shopping.DeliveryApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Shipping_table")
@Data

public class Shipping  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Integer id;
    
    
    
    
    
    private Integer orderId;

    @PostPersist
    public void onPostPersist(){


        Shipped shipped = new Shipped(this);
        shipped.publishAfterCommit();

    }

    public static ShippingRepository repository(){
        ShippingRepository shippingRepository = DeliveryApplication.applicationContext.getBean(ShippingRepository.class);
        return shippingRepository;
    }




    public static void startDelivery(OrderPlaced orderPlaced){

        /** Example 1:  new item 
        Shipping shipping = new Shipping();
        repository().save(shipping);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(shipping->{
            
            shipping // do something
            repository().save(shipping);


         });
        */

        
    }


}
