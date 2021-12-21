package com.exa.UserForm.userform;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserFormRepository extends MongoRepository<User, Long>
{


}
