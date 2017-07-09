package com.bmpl.ims.common;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class SessionCheckListener
 *
 */
@WebListener
public class SessionCheckListener implements HttpSessionListener {
private static int counter;
    /**
     * Default constructor. 
     */
	public static int getCounter(){
		return counter;
	}

    public SessionCheckListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
    		++counter;
        //counter++;
        System.out.println("Session Created....."+counter);
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         counter--;
    }
	
}
