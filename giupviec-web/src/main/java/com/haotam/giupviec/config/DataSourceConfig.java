package com.haotam.giupviec.config;

import com.haotam.giupviec.resourceholder.DatasourceHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")})
public class DataSourceConfig {

    @Autowired
    Environment env;

    @Value("${haotam.db.url}")
    private String url;

    @Value("${haotam.db.username}")
    private String username;

    @Value("${haotam.db.password}")
    private String password;

    @Value("${java_home}")
    private String javaHome;//since our key match system variable echo $JAVA_HOME, system value will be taken

    @Value("${jms.username}")
    private String jmsUsername;

    @Value("${haotam.address}")
    private String haotamAddress;

    @Bean
    public DatasourceHolder datasourceHolder() {
        DatasourceHolder holder = new DatasourceHolder();
        holder.setUrl(url);
        holder.setUsername(username);
        holder.setPassword(password);
        holder.setJavaHome(javaHome);
        holder.setSystemPath(env.getProperty("PATH"));
        holder.setJmsUsername(jmsUsername);
        holder.setHaotamAddress(haotamAddress);
        return holder;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
