package com.example.logging;

import org.apache.logging.log4j.*;

class WTPart {
	String number="184928647ts35df";
	String state="INWORK";
	String iteration="B.2";
	public static boolean erpFlag=false;
	
	public String getNumber() {
		return number;
	}
	public String getLifeCycleState() {
		return state;
	}
	public String getIterationIdentifier() {
		return iteration;
	}
	
}

public class LogTest {
	
    private static final Logger log =LogManager.getLogger(LogTest.class);

    public static void main(String[] args) throws Exception {
    	WTPart obj= new WTPart();
    	log.fatal("Entering Logtest");
    	if(true) {
    		log.info("Validating Object:"+obj.getClass().getName()+
    				", validating WTPart: "+obj.getNumber()+
    				", State: "+obj.getLifeCycleState()+
    				", Iteration :"+obj.getIterationIdentifier());
    	}
        if(!WTPart.erpFlag) {
        	log.error("ERP Flag Missing for Part :"+obj.getNumber());
        	throw new Exception("ERP flag is mandatory before release");
        }
    }
}
