package hello.core;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan( //@Conponent 에너테이션을 찾아 다 스프링 빈으로 등록해줌
        basePackages = "hello.core.member",
        basePackageClasses = AutoAppConfig.class,
        excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION, classes=Configuration.class) // 컴포넌트 스캔으로 등록할 때, 예외로 등록 안할 것들
)


public class AutoAppConfig {

}
