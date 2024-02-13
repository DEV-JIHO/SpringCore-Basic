package hello.core;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.core", //여기 위치에서부터 탐색 시작
        //이게 없으면 모든 자바 코드를 다 뒤진다.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)//AppConfig 클래스의 빈이 중복해서 등록되지 않게 하기위해서
public class AutoAppConfig {

}
