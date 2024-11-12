package h2test.hi;

import h2test.hi.entity.Member;
import h2test.hi.repository.MemberRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class initDb {
    private final MemberRepository memberRepository;
    @PostConstruct
    private void init(){
        Member member = Member.createMember("관리자");
        memberRepository.save(member);
    }
}