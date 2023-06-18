package my.app.reportpollution.repository;

import org.springframework.data.repository.CrudRepository;

import my.app.reportpollution.entity.PollutionReportEntity;

public interface PollutionReportRepository extends CrudRepository<PollutionReportEntity, Long> {

}
