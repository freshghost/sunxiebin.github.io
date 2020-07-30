/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sun.spring.cloud.tomcat.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.sun.spring.cloud.tomcat.service.HelloWorldService;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Applications;
import com.netflix.appinfo.InstanceInfo;
import java.util.List;
@Controller
public class SampleController {

	@Autowired
	private HelloWorldService helloWorldService;
	@Autowired
	private EurekaClient discoveryClient;
	@RequestMapping("/")
	@ResponseBody
	public String helloWorld() {
		getHomePageUrl();
		return this.helloWorldService.getHelloMessage();
	}	
	public void getHomePageUrl(){
	//	InstanceInfo instance = discoveryClient.getNextServerFromEureka("eureka-provider", false);
		Applications applications=discoveryClient.getApplications();

		System.out.println("url:"+applications.size());
	}

}
