package mocarim.mocarim.service;

import lombok.RequiredArgsConstructor;
import mocarim.mocarim.repository.UserRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

}
