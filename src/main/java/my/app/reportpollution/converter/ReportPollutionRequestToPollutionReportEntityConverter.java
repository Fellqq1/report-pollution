package my.app.reportpollution.converter;

import org.springframework.core.convert.converter.Converter;

import my.app.reportpollution.entity.PollutionReportEntity;
import my.app.reportpollution.model.request.ReportPollutionRequest;


public class ReportPollutionRequestToPollutionReportEntityConverter implements Converter<ReportPollutionRequest, PollutionReportEntity> {

	@Override
	public PollutionReportEntity convert(ReportPollutionRequest source) {
		PollutionReportEntity reservationEntity = new PollutionReportEntity();
		reservationEntity.setGeoTag(source.getGeoTag());
		reservationEntity.setDate(source.getDate());
		reservationEntity.setReportLink(source.getReportLink()); 
		
		if(source.getId() != null) {
			reservationEntity.setId(source.getId());
		}
		 
		return reservationEntity;
	}
	
}
