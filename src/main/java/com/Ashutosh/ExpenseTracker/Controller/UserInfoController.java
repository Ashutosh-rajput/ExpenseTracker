package com.Ashutosh.ExpenseTracker.Controller;

import com.Ashutosh.ExpenseTracker.DTO.UserInfoDTO;
import com.Ashutosh.ExpenseTracker.Service.ServiceImpl.UserInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserInfoController {
    @Autowired
    private UserInfoServiceImpl userInfoService;

    @PostMapping("/create-user")
    public UserInfoDTO createUser(@RequestBody UserInfoDTO userInfoDTO){
        return userInfoService.createUser(userInfoDTO);
    }

    @GetMapping("/get-user/{id}")
    public ResponseEntity<UserInfoDTO> getUserById(@PathVariable Long id){
        UserInfoDTO userInfoDTO=userInfoService.getuserbyid(id);
        return ResponseEntity.ok(userInfoDTO);
    }

    @GetMapping("/get-alluser")
    public List<UserInfoDTO> getalluser(){
        return userInfoService.getalluser();
    }

    @PutMapping("/update-user/{id}")
    public ResponseEntity<UserInfoDTO> updateuser(@RequestBody UserInfoDTO userInfoDTO,@PathVariable Long id){
        UserInfoDTO userInfoDTO1=userInfoService.updateuser(userInfoDTO, id);
        return ResponseEntity.ok(userInfoDTO1);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteuser(@PathVariable Long id){
        userInfoService.deleteuser(id);
        return ResponseEntity.ok("Deleted");

    }

}
