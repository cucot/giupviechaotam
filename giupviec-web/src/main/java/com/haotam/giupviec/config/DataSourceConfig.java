package com.haotam.giupviec.config;

import com.haotam.giupviec.resourceholder.DatasourceHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PropertySourceFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

@Configuration
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource(value = {"classpath:jms.yml"}, factory = YamlPropertyLoaderFactory.class)})
public class DataSourceConfig {

    @Autowired
    Environment env;

    @Value("${haotam.db.url: defaultUrl}")
    private String url = "default";

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

    @Value("${name_array}")
    private String[] complexString;

    @Value("${ignore_new_line}")
    private String ignoreNewLine;

    @Value("${include_new_line}")
    private String includeNewLine;

    @Value("${another_boolean_true}")
    private boolean booleanTrue;

    @Value("${boolean_false}")
    private boolean booleanFalse;

    @Value("${haotam.fake.phone}")
    private String haotamFakePhone;

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
        System.out.println("Complex string: " + Arrays.asList(complexString));
        System.out.println("Ignore new line: " + ignoreNewLine);
        System.out.println("Include new line: " + includeNewLine);
        System.out.println("booleanTrue = " + booleanTrue);
        System.out.println("booleanFalse = " + booleanFalse);
        System.out.println("haotam fake phone: " + haotamFakePhone);
        return holder;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
