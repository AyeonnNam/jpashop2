package jpabook.jpashop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


public class MemberMemoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void testMember() throws Exception {

        //given
        Member member = new Member();

        //when
        Long saveMember = memberRepository.save(member);
        //then
        Assertions.assertThat(member).isEqualTo(saveMember);
    }
}
