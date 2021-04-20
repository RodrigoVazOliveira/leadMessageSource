package br.dev.rvz.leadcolector.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Component;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Component
public class MensagemConfig {
	
	@Bean
	public MessageSource fonteDeMensagens() {
		ReloadableResourceBundleMessageSource bundleMessageSource
		= new ReloadableResourceBundleMessageSource();
		bundleMessageSource.setBasename("classpath:mensagens");
		bundleMessageSource.setDefaultEncoding("UTF-8");
		return bundleMessageSource;
	}
	
	@Bean
	public LocalValidatorFactoryBean obterValidacao() {
		LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
		localValidatorFactoryBean.setValidationMessageSource(fonteDeMensagens());
		return localValidatorFactoryBean;
	}
}
