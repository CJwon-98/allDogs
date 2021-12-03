package com.bon.allDogs.member.controller;
 
import java.util.List;
import java.util.Locale;
 
import javax.inject.Inject;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
import com.bon.allDogs.member.dto.MemberVO;
import com.bon.allDogs.member.service.MemberService;
 
/**
 * Handles requests for the application home page.
 */
@Controller
public class MemberController {
    
    private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
    
    @Inject
    private MemberService service;
    
    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/home2", method = RequestMethod.GET)
    public String home(Locale locale, Model model) throws Exception{
 
        logger.info("home2");
        
        List<MemberVO> user = service.selectMember();
        
        model.addAttribute("user", user);
 
        return "/home2";
    }
    
}