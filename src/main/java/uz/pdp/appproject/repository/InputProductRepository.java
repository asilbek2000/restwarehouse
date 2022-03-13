package uz.pdp.appproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appproject.entity.InputProduct;
import uz.pdp.appproject.projection.CustomAttachment;
import uz.pdp.appproject.projection.CustomInputProduct;

@RepositoryRestResource(path = "inputProduct",collectionResourceRel = "list",
        excerptProjection =
                CustomInputProduct.class)
public interface InputProductRepository extends JpaRepository<InputProduct,Integer> {
}
