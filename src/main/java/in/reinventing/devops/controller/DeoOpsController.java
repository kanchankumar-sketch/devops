package in.reinventing.devops.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devops")
public class DeoOpsController {
    public String test(){
        return "Working test controller.";
    }
}
