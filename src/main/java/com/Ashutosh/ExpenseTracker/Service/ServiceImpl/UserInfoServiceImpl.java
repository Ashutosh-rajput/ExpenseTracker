package com.Ashutosh.ExpenseTracker.Service.ServiceImpl;

import com.Ashutosh.ExpenseTracker.DTO.UserInfoDTO;
import com.Ashutosh.ExpenseTracker.Entity.UserInfo;
import com.Ashutosh.ExpenseTracker.ExceptionHandler.ResourceNotFoundException;
import com.Ashutosh.ExpenseTracker.Mapper.UserInfoMapper;
import com.Ashutosh.ExpenseTracker.Repository.UserInfoRepo;
import com.Ashutosh.ExpenseTracker.Service.ServiceInterface.UserInfoServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoServiceInterface {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private UserInfoRepo userInfoRepo;

    @Override
    public UserInfoDTO createUser(UserInfoDTO userInfoDTO) {
        UserInfo userInfo=userInfoMapper.userInfoDTOtouserInfo(userInfoDTO);
        UserInfo savedUserInfo=userInfoRepo.save(userInfo);
        return userInfoMapper.userInfotouserInfoDTO(savedUserInfo);
    }

    @Override
    public UserInfoDTO getuserbyid(Long id) {
        UserInfo userInfo=userInfoRepo.findById(id).orElseThrow(()->
                new ResourceNotFoundException("User with that id doesnt exist"+ id));
        return userInfoMapper.userInfotouserInfoDTO(userInfo);
    }

    @Override
    public List<UserInfoDTO> getalluser() {
        List<UserInfo> users=userInfoRepo.findAll();
        return users.stream().map((user)->userInfoMapper.userInfotouserInfoDTO(user)).toList();

    }

    @Override
    public UserInfoDTO updateuser(UserInfoDTO userInfoDTO, Long id) {
        UserInfo user=userInfoRepo.findById(id).orElseThrow(
                ()->new ResourceNotFoundException("user not found")
        );
        user.setUsername(userInfoDTO.getUsername());
        user.setEmail(userInfoDTO.getEmail());
        user.setFullName(userInfoDTO.getFullName());
        user.setMobile(userInfoDTO.getMobile());
        UserInfo updateduser=userInfoRepo.save(user);
        return userInfoMapper.userInfotouserInfoDTO(updateduser);
    }

    @Override
    public UserInfoDTO deleteuser(Long id) {
        UserInfo user=userInfoRepo.findById(id).orElseThrow(
                ()->new ResourceNotFoundException("user not found")
        );
        userInfoRepo.delete(user);
        return userInfoMapper.userInfotouserInfoDTO(user);
    }
}
