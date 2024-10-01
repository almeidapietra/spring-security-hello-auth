package example.hello_security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HSController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "<h1 style='color: pink'> Hello, Security rodou :)!</h1>";
    }
}
