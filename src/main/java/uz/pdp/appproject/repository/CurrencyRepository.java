package uz.pdp.appproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appproject.entity.Currency;
import uz.pdp.appproject.projection.CustomCurrency;
import uz.pdp.appproject.projection.CustomWarehouse;

@RepositoryRestResource(path = "currency",collectionResourceRel = "list", excerptProjection =
        CustomCurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {
}
