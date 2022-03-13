package uz.pdp.appproject.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appproject.entity.Category;
import uz.pdp.appproject.entity.Warehouse;

@Projection(types = Category.class)

public interface CustomCategory {
    Integer getId();
    String getName();
    boolean isActive();
}
