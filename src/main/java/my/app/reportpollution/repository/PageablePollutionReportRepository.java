package my.app.reportpollution.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import my.app.reportpollution.entity.PollutionReportEntity;

public interface PageablePollutionReportRepository extends PagingAndSortingRepository<PollutionReportEntity, Long> {

}
