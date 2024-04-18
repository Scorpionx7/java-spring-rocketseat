package rezende.com.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rezende.com.passin.domain.checkin.CheckIn;

public interface CheckinRepository extends JpaRepository<CheckIn, Integer> {
}
