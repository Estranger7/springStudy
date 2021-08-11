package com.estranger.www.two.selectImport;

import com.estranger.www.two.annotation.EnableJdbc;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.core.type.AnnotationMetadata;

import java.util.List;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/8/11 22:54
 */
public class JdbcConfigSelector implements ImportSelector {

    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        List<String> configClassNames = SpringFactoriesLoader.loadFactoryNames(EnableJdbc.class, this.getClass().getClassLoader());
        return configClassNames.toArray(new String[0]);
    }
}
