package zura.tikaradze.dynamodb.demo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class AWSConfig {
    @Value("${aws.service_endpoint}")
    private String SERVICE_ENDPOINT;
    @Value("${aws.region}")
    private String REGION;
    @Value("${aws.access_key}")
    private String ACCESS_KEY;
    @Value("${aws.secret_key}")
    private String SECRET_KEY;
}
