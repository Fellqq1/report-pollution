package my.app.reportpollution.model.responce;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import my.app.reportpollution.model.Links;

public class ReportPollutionResponse {
	private Long id;
	
	private String geoTag;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate date;
	
	private String reportLink;
	
	private Links links;

	public ReportPollutionResponse() {
		super();
	}

	public ReportPollutionResponse(Long id, String geoTag, LocalDate date, String reportLink, Links links) {
		super();
		this.id = id;
		this.geoTag = geoTag;
		this.date = date;
		this.reportLink = reportLink;
		this.links = links;
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

	public Links getLinks() {
		return links;
	}

	public void setLinks(Links links) {
		this.links = links;
	}
	
}
