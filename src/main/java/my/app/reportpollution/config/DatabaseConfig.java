package my.app.reportpollution.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaRepositories("com.spotless.city.repository")
@EnableTransactionManagement
public class DatabaseConfig {

}
