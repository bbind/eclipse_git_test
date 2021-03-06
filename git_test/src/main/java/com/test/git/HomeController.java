package com.test.git;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
				
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		System.out.println("아배고파 아졸료 돼지게따");
		System.out.println("언제 밥먹냐 힘들다ㅠ");
		System.out.println("여기는 핫픽스 난 응아마렵고 배고프고 돼질거같다");
		System.out.println("아니다 난 기운차다 화이팅!!!! 이따다끼 마스!!!");
		System.out.println("여긴 깃테스트 마스터 브랜치다. 난 수정한다 커밋할거다");
		System.out.println("얼른점심식난이왔으멵ㅎ겠따");
		System.out.println("풀로당겨볼랑께  함달ㄹ봅세다");
		
		return "home";
	}
	
}
