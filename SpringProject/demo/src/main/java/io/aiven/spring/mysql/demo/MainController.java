package io.aiven.spring.mysql.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping(path="/demo")
public class MainController {

        @Autowired
        private userRepo userRepo;

        @PostMapping(path = "/add")
        public @ResponseBody user addNewUser( @RequestParam String name,
                       @RequestParam String email ){
            user singaluser = new user();
            singaluser.setName(name);
            singaluser.setEmail(email);
            userRepo.save(singaluser);
            return singaluser;
        }

        @GetMapping(path = "/all")
        public @ResponseBody Iterable<user> getAllUser(){
            return userRepo.findAll();
        }

}
