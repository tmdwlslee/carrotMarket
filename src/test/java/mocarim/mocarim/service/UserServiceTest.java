package mocarim.mocarim.service;

import lombok.RequiredArgsConstructor;
import mocarim.mocarim.repository.UserRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void getHashCode(){
        System.out.println(userRepository.hashCode());
    }

}
