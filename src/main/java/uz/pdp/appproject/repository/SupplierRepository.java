package uz.pdp.appproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appproject.entity.Supplier;
import uz.pdp.appproject.projection.CustomSupplier;
import uz.pdp.appproject.projection.CustomUser;

@RepositoryRestResource(path = "supplier",collectionResourceRel = "list", excerptProjection =
        CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
}
