package uz.pdp.appproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appproject.entity.Category;
import uz.pdp.appproject.projection.CustomCategory;
import uz.pdp.appproject.projection.CustomWarehouse;

@RepositoryRestResource(path = "category",collectionResourceRel = "list", excerptProjection =
        CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
