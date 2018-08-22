package com.abhinavtonk.ufo.factory;

import com.abhinavtonk.ufo.enums.FrameworkLogger;
import com.abhinavtonk.ufo.enums.FrameworkReporter;
import com.abhinavtonk.ufo.logging.ILogger;
import com.abhinavtonk.ufo.reporting.IReporter;

public interface IFrameworkFactory {

	ILogger getLogger(FrameworkLogger logger);
	IReporter getReporter(FrameworkReporter reporter);	
}
