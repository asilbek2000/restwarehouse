package uz.pdp.appproject.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appproject.entity.*;

@Projection(types = Product.class)

public interface CustomProduct {
    Integer getId();
     String getName();
     boolean isActive();

     Category getCategory();

     Attachment getPhoto();
      Measurment getMeasurment();
}
