package uz.pdp.appproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appproject.entity.Attachment;
import uz.pdp.appproject.projection.CustomAttachment;

@RepositoryRestResource(path = "attachment",collectionResourceRel = "list",
        excerptProjection =
                CustomAttachment.class)
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
