package my.app.reportpollution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import my.app.reportpollution.repository.PollutionReportRepository;

public class H2Bootstrap implements CommandLineRunner {

	@Autowired
	PollutionReportRepository pollutionReportRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
	}

}
