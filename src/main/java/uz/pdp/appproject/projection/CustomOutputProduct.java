package uz.pdp.appproject.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appproject.entity.Output;
import uz.pdp.appproject.entity.OutputProduct;
import uz.pdp.appproject.entity.Product;
import uz.pdp.appproject.entity.Warehouse;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.sql.Date;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
     Integer getId();
     Product getProduct();
     Double getAmount();
     Double getPrice();
     Date getExpiredate();
     Output getOutput();
}
