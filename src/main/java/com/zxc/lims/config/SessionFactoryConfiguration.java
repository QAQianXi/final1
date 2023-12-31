package com.zxc.lims.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * Description
 * Author: zxc
 * Date: 2023/2/27 11:31
 **/
@Configuration
public class SessionFactoryConfiguration {
  // mybatis-config.xml配置文件的路径

  // mybatis mapper文件所在路径
  @Value("${mybatis.mapper-locations}")
  private String mapperPath;
  // 实体类所在的package
  @Value("${mybatis.type-aliases-package}")
  private String entityPackage;

  @Autowired
  @Qualifier("dataSource")
  private DataSource dataSource;

  @Bean(name = "sqlSessionFactory")
  public SqlSessionFactoryBean createSqlSessionFactoryBean()throws IOException {
    SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
    PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
    String packageSearchPath = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + mapperPath;
    sqlSessionFactoryBean.setMapperLocations(resolver.getResources(packageSearchPath));
    sqlSessionFactoryBean.setDataSource(dataSource);
    sqlSessionFactoryBean.setTypeAliasesPackage(entityPackage);
    return sqlSessionFactoryBean;
  }
}
