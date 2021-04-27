package com.haotam.giupviec.config;

import com.haotam.giupviec.resourceholder.DatasourceHolder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class DataSourceConfig {

    @Value("${haotam.db.url}")
    private String url;

    @Value("${haotam.db.username}")
    private String username;

    @Value("${haotam.db.password}")
    private String password;

    @Bean
    public DatasourceHolder datasourceHolder() {
        DatasourceHolder holder = new DatasourceHolder();
        holder.setUrl(url);
        holder.setUsername(username);
        holder.setPassword(password);
        return holder;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
