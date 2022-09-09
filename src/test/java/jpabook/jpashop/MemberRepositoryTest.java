//package jpabook.jpashop;
//
//import jpabook.jpashop.domain.Member;
//import jpabook.jpashop.repository.MemberRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.Rollback;
//import org.springframework.transaction.annotation.Transactional;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@SpringBootTest
//@Transactional
//@Rollback(value = false)
//class MemberRepositoryTest {
//
//    @Autowired
//    private MemberRepository memberRepository;
//
//    @Test
//    void 멤버저장() throws Exception {
//        // given
//        Member member = new Member();
//        member.setUsername("이정목");
//
//        // when
//        Long saveMemberId = memberRepository.save(member);
//        Member findMember = memberRepository.find(saveMemberId);
//
//        // then
//        assertThat(member).isEqualTo(findMember);
//        assertThat(member.getUsername()).isEqualTo(findMember.getUsername());
//
//    }
//
//}