package com.estranger.www.importSelector;

import com.estranger.www.bean.Bar;
import com.estranger.www.processor.BarConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by：Estranger
 * Description：
 * Date：2021/6/2 22:49
 */
public class BarImportSelector implements ImportSelector{

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{Bar.class.getName(), BarConfiguration.class.getName()};
    }
}
