package kr.hs.dgsw.webclass01;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {//UserService 상속
    List<User> userList;// 사용자 정보를 저장할 리스트 생성

    // userList 초기화
    public UserServiceImpl() {
        userList = new ArrayList<>();
        userList.add(new User("user1", "우효림", "user111@dgsw")); //첫번째 사용자
        userList.add(new User("user2", "우효", "user222@dgsw")); //두번째 사용자
        userList.add(new User("user3", "효림", "user333@dgsw")); // 세번째 사용자
    }


    //모든 사용자를 반환하는 함수
    @Override
    public List<User> list() {
        return userList;// 모든 사용자 정보 반환
    }

    //해당 id값을 가진 사용자를 반환하는 함수
    @Override
    public User view(String id) {
        User user = userList.stream().filter(found -> found.getId().equals(id)).findAny().orElse(null);// 해당 id값을 가지고 있는 사용자 조회
        return user;//조회된 사용자 반환
    }

    //새로운 사용자 추가하는 함수
    @Override
    public boolean add(User user) {
        User found = view(user.getId()); //리스트에 해당 id를 가진 사용자가 있는지 확인
        if (found == null) //해당 id를 가진 사용자가 없을 시
            return userList.add(user); //리스트에 새로운 사용자 추가
        return false; //있으면 false 반환
    }
    
    //해당 id값을 가진 사용자의 정보 변경하는 함수
    @Override
    public User update(User user) {
        User found = view(user.getId()); // 해당 id를 가진 사용자 확인
        if (found != null) { // 사용자가 있을 시
            found.setName(user.getName()); //그 사용자의 이름 변경
            found.setEmail(user.getEmail()); //그 사용자의 이메일 변경
        }
        return found; //변경된 사용자 반환
    }
    
    //해당 id값을 가진 사용자의 정보 삭제하는 함수
    @Override
    public boolean delete(String id) {
        User found = view(id); // 리스트에 해당 id를 가진 사용자 확인
        return userList.remove(found); // 사용자 정보 삭제
    }
}