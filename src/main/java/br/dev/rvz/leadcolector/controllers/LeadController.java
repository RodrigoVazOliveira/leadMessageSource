package br.dev.rvz.leadcolector.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.dev.rvz.leadcolector.dtos.lead.SaidaCadastrarLeadDTO;
import br.dev.rvz.leadcolector.dtos.lead.CadastrarLeadDTO;
import br.dev.rvz.leadcolector.models.Lead;
import br.dev.rvz.leadcolector.services.LeadService;

@RestController
@RequestMapping("leads/")
public class LeadController {
	
	private final LeadService leadService;

	@Autowired
	public LeadController(LeadService leadService) {
		this.leadService = leadService;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public SaidaCadastrarLeadDTO cadastrar(@RequestBody @Valid CadastrarLeadDTO cadastrarLeadDto) {
		Lead lead  = leadService.gravarLead(cadastrarLeadDto.converterDtoParaModelo());
		return SaidaCadastrarLeadDTO.converterModeloParaDto(lead);
	}
}
