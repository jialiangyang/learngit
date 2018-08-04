package cn.tedu.qaa.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tedu.qaa.bean.Question;
import cn.tedu.qaa.bean.ResponseResult;
import cn.tedu.qaa.service.IQuestionService;

@Controller
@RequestMapping("/questions")
public class QuestionController {
	
	@Resource
	private IQuestionService questionService;

	@RequestMapping("/showQuestions.do")
	public String showQuestions(){
		return "questions";
	}
	
	@RequestMapping("/getNewestQuestions.do")
	@ResponseBody
	public ResponseResult<List<Question>> getNewestQuestions(){
		ResponseResult<List<Question>> rr = null;
		List<Question> list = questionService.getNewestQuestion();
		if(list.size()!=0){
			rr = new ResponseResult<>(1,"查询成功");
			rr.setData(list);
		}
		return rr;
	}
}
