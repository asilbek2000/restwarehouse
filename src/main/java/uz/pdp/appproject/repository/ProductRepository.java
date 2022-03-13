package uz.pdp.appproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appproject.entity.Product;
import uz.pdp.appproject.projection.CustomProduct;
import uz.pdp.appproject.projection.CustomUser;

@RepositoryRestResource(path = "product",collectionResourceRel = "list", excerptProjection =
        CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
