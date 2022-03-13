package uz.pdp.appproject.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appproject.entity.Category;
import uz.pdp.appproject.entity.Currency;

@Projection(types = Currency.class)

public interface CustomCurrency {
    Integer getId();
    String getName();
    boolean isActive();
}
