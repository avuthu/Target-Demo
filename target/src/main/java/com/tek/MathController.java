package com.tek;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

	@RequestMapping(path = "/add", method = RequestMethod.POST)
	  public AdditionResponse add(@RequestBody @Valid AdditionRequest request) {
	    int sum = request.getAugend() + request.getAddend();
	    return new AdditionResponse(sum);
	  }
	
}
