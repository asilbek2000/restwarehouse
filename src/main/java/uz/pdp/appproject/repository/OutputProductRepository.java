package uz.pdp.appproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appproject.entity.OutputProduct;
import uz.pdp.appproject.projection.CustomOutputProduct;
import uz.pdp.appproject.projection.CustomUser;

@RepositoryRestResource(path = "users",collectionResourceRel = "list", excerptProjection =
        CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {
}
