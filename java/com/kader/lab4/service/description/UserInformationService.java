package com.kader.lab4.service.description;

import com.kader.lab4.entity.User;
import com.kader.lab4.entity.UserInformation;
import com.kader.lab4.exeptions.ServiceException;

import java.util.List;
import java.util.Optional;

public interface UserInformationService {

    Optional<UserInformation> retrieveUserInformationById(int userInformationId) throws ServiceException;


    List<UserInformation> getUserInformationFromUsers(List<User> users) throws ServiceException;
}
