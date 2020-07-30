package org.sun.spring.cloud.tomcat.bean;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.*;
/*  this is class annotate mbeanServer
 *
 * */
@Component
@ManagedResource(objectName="bean:name=hello")
public class HelloMBean{
private String name;
@ManagedAttribute()
public void setName(String name){
   	this.name=name;
	System.out.println("name:"+name);
}
}
