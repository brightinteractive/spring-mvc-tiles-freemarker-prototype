package com.brightinteractive.tiles.spring;

/*
 * Copyright 2014 Bright Interactive, All Rights Reserved.
 */

import org.springframework.web.servlet.view.tiles3.SpringLocaleResolver;

import org.apache.tiles.extras.complete.CompleteAutoloadTilesContainerFactory;
import org.apache.tiles.locale.LocaleResolver;
import org.apache.tiles.request.ApplicationContext;

/**
 * @author Bright Interactive
 */
public class SpringCompleteAutoloadTilesContainerFactory extends CompleteAutoloadTilesContainerFactory
{
	@Override
	protected LocaleResolver createLocaleResolver(ApplicationContext applicationContext)
	{
		return new SpringLocaleResolver();
	}
}
