package com.abhinavtonk.ufo.logging;

public interface ILogger {
	
	void infoLog(String loggingMsg);
	void debugLog(String loggingMsg);
	void traceLog(String loggingMsg);
	void warnLog(String loggingMsg);

}
