package br.dev.rvz.leadcolector.services;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.rvz.leadcolector.models.Lead;
import br.dev.rvz.leadcolector.repository.LeadRepository;

@Service
public class LeadService {
	
	private final LeadRepository leadRepository;

	@Autowired
	public LeadService(LeadRepository leadRepository) {
		this.leadRepository = leadRepository;
	}
	
	public Lead gravarLead(Lead lead) {
		lead.setDataHora(LocalDateTime.now());
		return leadRepository.save(lead);
	}
	
	public Lead procurarLeadPorEmail(String email) {
		Optional<Lead> optionalLead  = leadRepository.findByEmail(email);
		
		if (optionalLead.isEmpty()) {
			throw new RuntimeException("E-mail já foi utilizado!");
		}
		
		return optionalLead.get();
	}
}
