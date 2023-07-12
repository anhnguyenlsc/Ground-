package com.ground.services;

import com.ground.data.repositories.UserRepository;
import com.ground.usage.cases.port.web.user.SignIn;
import com.ground.usage.cases.port.web.user.SignUp;
import com.ground.usage.cases.port.web.user.profile.EditProfile;
import com.ground.usage.values.base.Out;
import com.ground.usage.values.in.EditableProfileIN;
import com.ground.usage.values.in.SignInUserIN;
import com.ground.usage.values.in.SignUpUserIN;
import com.ground.usage.values.out.UserOUT;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserService implements EditProfile {

  private final ReactiveMongoTemplate mongoOps;
  private final UserRepository userRep;


  @Override
  public Mono<Out<UserOUT>> viewProfile() {
    return null;
  }

  @Override
  public Mono<Out<UserOUT>> viewProfile(String id) {
    return null;
  }

  @Override
  public Mono<Out<UserOUT>> editProfile(EditableProfileIN editableProfile) {
    return null;
  }
}
