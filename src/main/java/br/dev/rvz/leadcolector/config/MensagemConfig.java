package br.dev.rvz.leadcolector.config;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Component;

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
}
