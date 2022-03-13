package uz.pdp.appproject.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appproject.entity.InputProduct;
import uz.pdp.appproject.entity.Output;
import uz.pdp.appproject.entity.Product;

import java.sql.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
     Integer getId();
     Product getProduct();
     Double getAmount();
     Double getPrice();
     Date getExpiredate();
     Output getInput();
}
