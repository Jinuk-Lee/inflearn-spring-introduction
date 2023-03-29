package spring.springintroduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.springintroduction.repository.*;
import spring.springintroduction.service.MemberService;

import javax.persistence.EntityManager;

@Configuration
public class SpringConfig {

    private EntityManager em;

    public SpringConfig(EntityManager em) {
        this.em = em;

    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
//return new JdbcTemplateMemberRepository(dataSource);
        return new JpaMemberRepository(em);

    }

}
