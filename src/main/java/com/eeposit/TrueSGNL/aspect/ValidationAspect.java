package com.eeposit.TrueSGNL.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/*import com.eeposit.hub.dao.inf.UserDeviceDao;
import com.eeposit.hub.dto.HeaderDto;
import com.eeposit.hub.model.UserDeviceEntity;
import com.eeposit.hub.util.EPException;
import com.eeposit.hub.util.Md5Hash;*/

/**
 * Created with Eclipse.
 * User: Sudeep
 * Date: 2017-12-14
 * Time: 04:01 PM
 */
@Aspect
@Component
public class ValidationAspect {
	
	/*@Value("${static.accesstoken}")
	private String staticAccessToken;

    @Autowired
    UserDeviceDao userDeviceDao;*/ 

    @Before("execution(* com.eeposit.trueSGNL.service.impl.*.*(..))")
    public void validateAccessToken(JoinPoint joinPoint) throws Exception{
        if(joinPoint.getArgs().length>0 && joinPoint.getArgs()[0].getClass().getName().equals("com.eeposit.trueSGNL.dto.HeaderDto")){
           /* HeaderDto headerDto = (HeaderDto) joinPoint.getArgs()[0];

            if(headerDto.getAccessToken()!=null && !headerDto.getAccessToken().equals(staticAccessToken)) {
                UserDeviceEntity userDevice = userDeviceDao.findByAccessToken(Md5Hash.md5(headerDto.getAccessToken()));

                if(userDevice==null)
                    throw new EPException("SEC002");
                headerDto.setUserDevice(userDevice);
            }*/
        }
    }

}
