package za.ac.cput.tekkiestorecapstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.tekkiestorecapstone.domain.ShoeVariant;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoeVariantRepository extends JpaRepository<ShoeVariant, String> {

}
