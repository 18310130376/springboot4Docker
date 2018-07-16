package com.docker;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication 
@RestController
public class DockerApplication {
    
//   @Autowired
//   private JdbcTemplate jdbcTemplate;
    
    @RequestMapping("/getUserInfo")
    public String getUserInfo(HttpServletRequest qequest) {
    	
    	String id = qequest.getParameter("id");
    	if(StringUtils.isEmpty(id)) {
    		return "id must not be null";
    	}
		return "hello";
    	
//    	List<Map<String, Object>> queryForList = jdbcTemplate.queryForList("select * from docker_user where id="+id);
//    	if(queryForList == null || queryForList.size() == 0) {
//    		return "result is null";
//    	}
//		return (String) queryForList.get(0).get("username");
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerApplication.class);
    }
}
