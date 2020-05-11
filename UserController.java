package kr.hs.dgsw.webclass01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user") //모든 사용자의 정보를 가져옴
    @ResponseBody
    public List<User> list(){
        return userService.list(); 
    }
    @GetMapping("/user/{id}") //해당 아이디를 가진 사용자의 정보를 가져옴
    @ResponseBody
    public User view(@PathVariable String id){
        return userService.view(id);
    }
    @PostMapping("/user") //사용자의 정보를 추가
    @ResponseBody
    public boolean add(@RequestBody User user){
        return userService.add(user);
    }
    @PutMapping("/user") //사용자의 정보를 변경
    @ResponseBody
    public User update(@RequestBody User user){
        return userService.update(user);
    }
    @DeleteMapping("/user/{id}") //해당 아이디를 가진 사용자의 정보를 삭제
    @ResponseBody
    public boolean delete(@PathVariable String id){
        return userService.delete(id);
    }
}