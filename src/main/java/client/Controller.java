package client;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URL;

@RestController
public class Controller {

    // TODO: adapt username
    private static final String USERNAME = "Toto";

    @RequestMapping("/name")
    public String name() {
        return USERNAME;
    }

    @RequestMapping("/challenges/0")
    public String challenge0(@RequestParam(value = "input") String input) {
        String url = "http://localhost:7000/challenges/0/info?user=" + USERNAME;
        ObjectMapper mapper = new ObjectMapper();
        try {
            Code[] codes = mapper.readValue(new URL(url), Code[].class);
            String output = "";
            // TODO: compute output
            return output;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "hmm...";
    }
}
