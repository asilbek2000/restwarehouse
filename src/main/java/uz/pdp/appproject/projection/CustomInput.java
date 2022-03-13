package uz.pdp.appproject.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appproject.entity.*;

import java.sql.Timestamp;

@Projection(types = Input.class)

public interface CustomInput {
      Integer getId();
      Timestamp getDate();
      Supplier getSupplier();
      Warehouse getWarehouse();
      Currency getCurrency();
      String getFactureNumber();
      String getCode();
      Client getClient();

}
