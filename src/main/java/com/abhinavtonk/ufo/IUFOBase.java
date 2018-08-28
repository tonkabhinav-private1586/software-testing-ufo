package com.abhinavtonk.ufo;

import com.abhinavtonk.ufo.datamanaging.IDataManager;
import com.abhinavtonk.ufo.logging.ILogger;
import com.abhinavtonk.ufo.reporting.IReporter;

public interface IUFOBase extends IDataManager, ILogger, IReporter{

}
