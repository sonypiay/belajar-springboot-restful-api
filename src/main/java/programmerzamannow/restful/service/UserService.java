package programmerzamannow.restful.service;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import programmerzamannow.restful.entity.User;
import programmerzamannow.restful.exceptions.ApiException;
import programmerzamannow.restful.model.RegisterUserRequest;
import programmerzamannow.restful.repository.UserRepository;
import programmerzamannow.restful.security.BCrypt;

import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Validator validator;

    public void register(RegisterUserRequest request) {
        Set<ConstraintViolation<RegisterUserRequest>> constraintViolations = validator.validate(request);

        if( constraintViolations.size() != 0 ) {
            throw new ConstraintViolationException(constraintViolations);
        }

        if(userRepository.existsById(request.getUsername())) {
            throw new ApiException("Username already registered");
        }
//
//        User user = new User();
//        user.setUsername(request.getUsername());
//        user.setPassword(BCrypt.hashpw(request.getPassword()));
    }
}
