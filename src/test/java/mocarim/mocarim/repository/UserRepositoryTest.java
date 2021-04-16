package mocarim.mocarim.repository;

import mocarim.mocarim.user.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository ;

    @AfterEach
    public void cleanup() { userRepository.deleteAll();}

    @Test
    public void 회원가입(){
        //given
        String id = "tmdwlsclrn@naver.com";
        String nickname = "닉네임";
        String address = "수원시 영통구";
        int age = 28;
        String gender = "남";
        String useYn = "Y";
        String creater = "SYSTEM";
        String modifier = "SYSTEM";

        User user1 = new User(id, nickname, address, age, gender, useYn, creater, modifier);

        userRepository.save(user1);

        //when
        User user2 = userRepository.findById("tmdwlsclrn@naver.com").get();

        //then
        assertThat(user2.getUserId()).isEqualTo(user1.getUserId());

    }

}
