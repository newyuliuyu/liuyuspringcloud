package com.liuyu.feign;

import org.springframework.stereotype.Component;

/**
 * ClassName: SchedualServiceHiImpl <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-5-28 下午4:26 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
@Component
public class SchedualServiceHiImpl implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
