package qr.market.backenf.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import qr.market.backenf.domain.User;
import qr.market.backenf.repository.UserRepository;
import qr.market.backenf.service.UserService;



import java.util.List;


@RestController
@RequestMapping("/api")
public class UserTestController {

    private final UserService userService;
    private final UserRepository userRepository;

    public UserTestController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

        @GetMapping("/testUser")
        public ResponseEntity<?> getAccount(){

            List<User> users=userService.findAll();


            return ResponseEntity.ok(users);
        }
        @PostMapping("/testPost")
    public ResponseEntity postTest(@RequestBody String test){
            User user=userRepository.findByUserName(test);
            if(user==null){
                System.out.println("topilmadi");

            }
            return ResponseEntity.ok(user);
        }

}
