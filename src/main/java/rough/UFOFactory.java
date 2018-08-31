package rough;

import com.abhinavtonk.ufo.datamanaging.DatabaseReader;
import com.abhinavtonk.ufo.datamanaging.ExcelFileReader;
import com.abhinavtonk.ufo.datamanaging.IDataManager;
import com.abhinavtonk.ufo.datamanaging.PropertyFileReader;
import com.abhinavtonk.ufo.datamanaging.YamlFileReader;
import com.abhinavtonk.ufo.enums.FrameworkDataSource;
import com.abhinavtonk.ufo.enums.FrameworkLoggingTool;
import com.abhinavtonk.ufo.enums.FrameworkReportingTool;
import com.abhinavtonk.ufo.logging.ILogger;
import com.abhinavtonk.ufo.logging.Log4jLogger;
import com.abhinavtonk.ufo.reporting.HtmlReporter;
import com.abhinavtonk.ufo.reporting.IReporter;
import com.abhinavtonk.ufo.reporting.ReportNGReporter;
import com.abhinavtonk.ufo.reporting.TestNGReporter;

public class UFOFactory implements IUFOFactory{
	
	private FrameworkLoggingTool frameworkLogger;
	private FrameworkReportingTool frameworkReporter;
	private FrameworkDataSource frameworkDataSource;
	
	private ILogger logger;
	private IReporter reporter;
	private IDataManager dataManager;
	
	private String dataManagerFilePath;
	
	@Override
	public void setFrameworkLogger(String frameworkLogger) {
		if(frameworkLogger.equalsIgnoreCase("log4j")){
			this.frameworkLogger = FrameworkLoggingTool.LOG4J;
		}
		// TODO
		//else if()
		
	}
	
	@Override
	public FrameworkLoggingTool getFrameworkLogger() {
		return frameworkLogger;
	}
	
	@Override
	public void setFrameworkReporter(String frameworkReporter) {
		if(frameworkReporter.equalsIgnoreCase("reportng reporter"))
			this.frameworkReporter = FrameworkReportingTool.REPORT_NG_REPORTER;
		
		else if(frameworkReporter.equalsIgnoreCase("html reporter"))
			this.frameworkReporter = FrameworkReportingTool.HTML_REPORTER;
		
		else if(frameworkReporter.equalsIgnoreCase("testng reporter"))
			this.frameworkReporter = FrameworkReportingTool.TESTNG_REPORTER;
	}
	
	@Override
	public FrameworkReportingTool getFrameworkReporter() {
		return frameworkReporter;
	}
	
	@Override
	public void setFrameworkDataSource(String frameworkDataSource) {
		if(frameworkDataSource.equalsIgnoreCase("properties file")){
			this.frameworkDataSource = FrameworkDataSource.PROPERTIES_FILE;
		}
		else if(frameworkDataSource.equalsIgnoreCase("excel file")){
			this.frameworkDataSource = FrameworkDataSource.EXCEL_FILE;
		}
		else if(frameworkDataSource.equalsIgnoreCase("yamlm file")){
			this.frameworkDataSource = FrameworkDataSource.YAML_FILE;
		}
		else if(frameworkDataSource.equalsIgnoreCase("db")){
			this.frameworkDataSource = FrameworkDataSource.DATABASE;
		}
		
	}
	
	@Override
	public FrameworkDataSource getFrameworkDataSource() {
		return frameworkDataSource;
	}

	
	@Override
	public void setLogger(FrameworkLoggingTool frameworkLogger) {

		switch(frameworkLogger){
		case LOG4J:
			this.logger = new Log4jLogger();
			
			//TODO more cases
		}
		
	}

	@Override
	public ILogger getLogger() {
		return logger;
	}

	@Override
	public void setReporter(FrameworkReportingTool frameworkReporter) {
		switch(frameworkReporter){
		case REPORT_NG_REPORTER:
			this.reporter =  new ReportNGReporter();

		case HTML_REPORTER:
			this.reporter = new HtmlReporter();

		case TESTNG_REPORTER:
			this.reporter = new TestNGReporter();

		default:
			this.reporter =	 null;
		}
		
	}

	@Override
	public IReporter getReporter() {
		return reporter;
	}

	@Override
	public void setDataManager(FrameworkDataSource frameworkDataSource, String dataManagerFilePath) {
		switch(frameworkDataSource){
		case EXCEL_FILE:
			this.dataManager= new ExcelFileReader(dataManagerFilePath);

		case PROPERTIES_FILE:
			this.dataManager = new PropertyFileReader(dataManagerFilePath);

		case YAML_FILE:
			this.dataManager = new YamlFileReader(dataManagerFilePath);

		case DATABASE:
			this.dataManager = new DatabaseReader(dataManagerFilePath);
			
		default:
			this.dataManager = null;
		}
		
	}

	@Override
	public IDataManager getDataManager() {
		return dataManager;
	}

	@Override
	public void setDataManagerFilePath(String dataManagerFilePath) {
		this.dataManagerFilePath = dataManagerFilePath;		
	}

	@Override
	public String getDataManagerFilePath() {
		return dataManagerFilePath;
	}
}

