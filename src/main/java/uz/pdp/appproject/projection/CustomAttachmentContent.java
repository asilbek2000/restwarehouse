package uz.pdp.appproject.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appproject.entity.Attachment;
import uz.pdp.appproject.entity.AttachmentContent;

import javax.persistence.OneToOne;

@Projection(types = AttachmentContent.class)

public interface CustomAttachmentContent {
    Integer getId();

     byte[] getBytes();

     Attachment getAttachment();

}
