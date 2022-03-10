package com.trungkien.backend.audit;

import com.trungkien.backend.entity.User;
import com.trungkien.backend.repository.UserRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

public class SpringSecurityAuditorAware implements AuditorAware<User> {

    Logger logger = LoggerFactory.getLogger(SpringSecurityAuditorAware.class);
    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<User> getCurrentAuditor() {
        User auditor = null;
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null) {
            Object principal = authentication.getPrincipal();
            if (principal instanceof User) {
                auditor = (User) principal;
            }
        }

//        String username = SecurityContextHolder.getContext().getAuthentication().getName();
//        return userRepository.findByUsername(username);
        return Optional.ofNullable(auditor);
    }


}
