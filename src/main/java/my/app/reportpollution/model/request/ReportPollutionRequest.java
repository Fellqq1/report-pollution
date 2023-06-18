package my.app.reportpollution.model.request;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class ReportPollutionRequest {
	private Long id;
	
	private String geoTag;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate date;
	
	private String reportLink;

	public ReportPollutionRequest() {
		super();
	}

	public ReportPollutionRequest(Long id, String geoTag, LocalDate date, String reportLink) {
		super();
		this.id = id;
		this.geoTag = geoTag;
		this.date = date;
		this.reportLink = reportLink;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGeoTag() {
		return geoTag;
	}

	public void setGeoTag(String geoTag) {
		this.geoTag = geoTag;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getReportLink() {
		return reportLink;
	}

	public void setReportLink(String reportLink) {
		this.reportLink = reportLink;
	}
	
}
