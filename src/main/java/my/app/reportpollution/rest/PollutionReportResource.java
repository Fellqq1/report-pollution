package my.app.reportpollution.rest;

import java.time.LocalDate;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import my.app.reportpollution.entity.PollutionReportEntity;
import my.app.reportpollution.model.request.ReportPollutionRequest;
import my.app.reportpollution.model.responce.ReportPollutionResponse;
import my.app.reportpollution.repository.PageablePollutionReportRepository;
import my.app.reportpollution.repository.PollutionReportRepository;

@CrossOrigin
@RestController
@RequestMapping(PollutionReportConstants.REPORT_V1)
public class PollutionReportResource {
	
	@Autowired
	PollutionReportRepository pollutionReportRepository;
	
	@Autowired
	PageablePollutionReportRepository pageablePollutionReportRepository;
	
	@Autowired
	ConversionService conversionService;
	
	@GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<ReportPollutionResponse> getPollutionReports(
			@RequestParam(value = "start")  
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) 
			LocalDate start,
			@RequestParam(value = "end") 
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) 
			LocalDate end,
			Pageable pageable) {
		Page<PollutionReportEntity> page = pageablePollutionReportRepository.findAll(pageable);
		
		return page.map(new Function<PollutionReportEntity, ReportPollutionResponse>() {
			 
			@Override
			public ReportPollutionResponse apply(PollutionReportEntity t) {
				return conversionService.convert(t, ReportPollutionResponse.class);
			}
		});
	}
	
	@PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ReportPollutionResponse> createPollutionReport(
			@RequestBody 
			ReportPollutionRequest pollutionReportRequest) {
		PollutionReportEntity pollutionReportEntity = conversionService.convert(pollutionReportRequest, PollutionReportEntity.class);
		pollutionReportRepository.save(pollutionReportEntity);
		ReportPollutionResponse pollutionReportResponce = conversionService.convert(pollutionReportEntity, ReportPollutionResponse.class);
		return new ResponseEntity<>(pollutionReportResponce, HttpStatus.CREATED);
	}

	@PutMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ReportPollutionResponse> updateTransaction(
			@RequestBody 
			ReportPollutionRequest transationRequest) {
		return new ResponseEntity<>(new ReportPollutionResponse(), HttpStatus.OK);
	}
}
	

