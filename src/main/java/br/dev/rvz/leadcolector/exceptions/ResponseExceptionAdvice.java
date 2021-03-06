package br.dev.rvz.leadcolector.exceptions;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class ResponseExceptionAdvice extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		ResponseGenerator rg = new ResponseGenerator(
					status.value(),
					status.getReasonPhrase(),
					"VALIDAÇÃO",
					obterMensagens(ex)
				);
		return ResponseEntity.status(status).body(rg);
	}
	
	
	public List<Mensagem> obterMensagens(MethodArgumentNotValidException ex) {
		List<Mensagem> mensagens = new ArrayList<Mensagem>();
		
		for (FieldError fieldError : ex.getFieldErrors()) {
			mensagens.add(
					new Mensagem(fieldError.getField(), fieldError.getDefaultMessage())
			);
		}
		
		return mensagens;
	}
}
