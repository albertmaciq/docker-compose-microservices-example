package moduleb.domain.service;

import moduleb.domain.model.ModuleBModel;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface ModuleBRepository extends CrudRepository<ModuleBModel, Long> {

  String SQL_MESSAGE = "SELECT MESSAGE FROM MESSAGE";

  @Query(SQL_MESSAGE)
  String getSqlMessage();
}
