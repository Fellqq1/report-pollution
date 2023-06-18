package my.app.reportpollution.converter;

import org.springframework.core.convert.converter.Converter;

import my.app.reportpollution.entity.PollutionReportEntity;
import my.app.reportpollution.model.responce.ReportPollutionResponse;

public class PollutionReportEntityToReportPollutionResponseConverter implements Converter<PollutionReportEntity, ReportPollutionResponse>{

	@Override
	public ReportPollutionResponse convert(PollutionReportEntity source) {
		ReportPollutionResponse transactionResponse = new ReportPollutionResponse();
		transactionResponse.setGeoTag(source.getGeoTag());
		transactionResponse.setDate(source.getDate());
		transactionResponse.setReportLink(source.getReportLink());
		
		if(source.getId() != null) {
			transactionResponse.setId(source.getId());
		}
		return transactionResponse;
	}

}
