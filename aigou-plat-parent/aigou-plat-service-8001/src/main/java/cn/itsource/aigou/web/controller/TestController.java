package cn.itsource.aigou.web.controller;

import cn.itsource.aigou.domain.Stu;
import cn.itsource.aigou.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试提供者 接口
 */
@RestController
public class TestController {
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public AjaxResult Login(Stu stu){
        if("lxj".equals(stu.getUsername())&&"123".equals(stu.getPassword())){
            return AjaxResult.getResult().setMsg("登陆成功！");
        }else {
            return AjaxResult.getResult().setSeccess(false).setMsg("就是不要你进去！");
        }
    }


    /**
     * 测试postmain  工具 写的类
     * @param stu
     * @return
     */
    @RequestMapping(value = "/lget",method = RequestMethod.POST)
    public AjaxResult testPostmain(@RequestBody Stu stu){
        if("lxj".equals(stu.getUsername())&&"123".equals(stu.getPassword())){
            return AjaxResult.getResult().setMsg("登陆成功！");
        }else {
            return AjaxResult.getResult().setSeccess(false).setMsg("就是不要你进去！");
        }
    }
}
