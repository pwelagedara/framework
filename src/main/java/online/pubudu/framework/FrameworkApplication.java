package online.pubudu.framework;

import online.pubudu.framework.config.ServiceAwareTypeFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(
	useDefaultFilters = false,
	includeFilters = @ComponentScan.Filter(type = FilterType.CUSTOM, classes = ServiceAwareTypeFilter.class)
)
public class FrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrameworkApplication.class, args);
	}

}

