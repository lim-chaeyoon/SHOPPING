package shopping.infra;

import shopping.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="productLists", path="productLists")
public interface ProductListRepository extends PagingAndSortingRepository<ProductList, Long> {

    

    
}
