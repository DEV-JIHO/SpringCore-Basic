package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {
    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();


    @Test
    @DisplayName("10% 할인이 적용되어야 한다.")
    void vip_o() {
        //given
        Member member = new Member(1L, "VIPmember", Grade.VIP);
        //when
        int price  = discountPolicy.discount(member, 3000);
        //then
        Assertions.assertThat(price).isEqualTo(300);

    }

    @Test
    @DisplayName("VIP가 아니면 할인이 적용되지 않아야 한다.")
    void vip_x() {
        //given
        Member member1 = new Member(2L, "BASICmember", Grade.BASIC);
        //when
        int discount = discountPolicy.discount(member1,10000);
        //then
        Assertions.assertThat(discount).isEqualTo(0);
    }

}