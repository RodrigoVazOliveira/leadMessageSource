package br.dev.rvz.leadcolector.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


import br.dev.rvz.leadcolector.models.Lead;

public interface LeadRepository extends CrudRepository<Lead, Integer> {
	Optional<Lead> findByEmail(String email);
}
