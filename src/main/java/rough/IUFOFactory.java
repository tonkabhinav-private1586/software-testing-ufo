package rough;

import com.abhinavtonk.ufo.datamanaging.IDataManager;
import com.abhinavtonk.ufo.enums.FrameworkDataSource;
import com.abhinavtonk.ufo.enums.FrameworkLoggingTool;
import com.abhinavtonk.ufo.enums.FrameworkReportingTool;
import com.abhinavtonk.ufo.logging.ILogger;
import com.abhinavtonk.ufo.reporting.IReporter;

public interface IUFOFactory {

	void setFrameworkLogger(String frameworkLogger);
	FrameworkLoggingTool getFrameworkLogger();
	
	void setFrameworkReporter(String frameworkReporter);
	FrameworkReportingTool getFrameworkReporter();
	
	void setFrameworkDataSource(String frameworkDataSource);
	FrameworkDataSource getFrameworkDataSource();
	
	void setLogger(FrameworkLoggingTool frameworkLogger);
	ILogger getLogger();
	
	void setReporter(FrameworkReportingTool frameworkReporter);
	IReporter getReporter();
	
	void setDataManager(FrameworkDataSource frameworkDataSource, String dataManagerFilePath);
	IDataManager getDataManager();
	
	void setDataManagerFilePath(String dataManagerFilePath);
	String getDataManagerFilePath();
	
	
}
