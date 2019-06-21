package cn.itsource.aigou.swagger;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

@Component
@Primary
public class DocumentationConfig implements SwaggerResourcesProvider {

    public List<SwaggerResource> get() {
        List resources = new ArrayList();
       //aigou网关前缀,employee网关路径   ；swagger的路径 ，以后增加了接口就在这配置就ok
        resources.add(swaggerResource("用户系统", "/aigou/login/v2/api-docs", "2.0"));
    /*    resources.add(swaggerResource("可爱系统", "/aigou/product/v2/api-docs", "2.0"));
        resources.add(swaggerResource("小心心系统", "/aigou/common/v2/api-docs", "2.0"));*/
        return resources;
    }

    SwaggerResource swaggerResource = new SwaggerResource();
    private SwaggerResource swaggerResource(String name, String location, String version) {
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}