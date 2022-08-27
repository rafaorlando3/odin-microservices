package br.com.odin.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.odin.exception.UnsuportedMathOperationException;
import br.com.odin.math.SimpleMath;
import br.com.odin.request.converters.NumberConverter;

@RestController
public class MathController {
	
	private SimpleMath simpleMath = new SimpleMath();
	
	@RequestMapping(value="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please, set a numeric value!");
		}
		
		return simpleMath.sum(NumberConverter.convertDouble(numberOne), NumberConverter.convertDouble(numberTwo));
	}
	
	@RequestMapping(value="/subtraction/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please, set a numeric value!");
		}
		
		return simpleMath.subtraction(NumberConverter.convertDouble(numberOne), NumberConverter.convertDouble(numberTwo));
	}
	
	@RequestMapping(value="/multiplication/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please, set a numeric value!");
		}
		
		return simpleMath.multiplication(NumberConverter.convertDouble(numberOne), NumberConverter.convertDouble(numberTwo));
	}
	
	@RequestMapping(value="/division/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please, set a numeric value!");
		}
		
		return simpleMath.division(NumberConverter.convertDouble(numberOne), NumberConverter.convertDouble(numberTwo));
	}
	
	@RequestMapping(value="/average/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double average(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please, set a numeric value!");
		}
		
		return simpleMath.average(NumberConverter.convertDouble(numberOne), NumberConverter.convertDouble(numberTwo));
	}
	
	@RequestMapping(value="/squareRoot/{number}", method=RequestMethod.GET)
	public Double squareRoot(@PathVariable("number") String number) throws Exception {
		if (!NumberConverter.isNumeric(number)) {
			throw new UnsuportedMathOperationException("Please, set a numeric value!");
		}
		
		return simpleMath.squareRoot(NumberConverter.convertDouble(number));
	}

}
