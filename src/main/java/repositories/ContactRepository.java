package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{

}
