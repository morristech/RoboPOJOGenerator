package com.robohorse.robopojogenerator.generator.postprocessors;

import com.robohorse.robopojogenerator.generator.common.ClassItem;
import com.robohorse.robopojogenerator.generator.consts.AnnotationItem;
import com.robohorse.robopojogenerator.generator.consts.Imports;
import com.robohorse.robopojogenerator.generator.consts.annotations.PojoAnnotations;

/**
 * Created by vadim on 24.10.16.
 */
public abstract class JavaPostProcessor extends AbsPostProcessor {

    protected void applyAnnotations(AnnotationItem item, ClassItem classItem) {
        switch (item) {
            case GSON: {
                generateHelper.setAnnotations(classItem,
                        PojoAnnotations.GSON.CLASS_ANNOTATION,
                        PojoAnnotations.GSON.ANNOTATION,
                        Imports.GSON.IMPORTS);
                break;
            }
            case LOGAN_SQUARE: {
                generateHelper.setAnnotations(classItem,
                        PojoAnnotations.LOGAN_SQUARE.CLASS_ANNOTATION,
                        PojoAnnotations.LOGAN_SQUARE.ANNOTATION,
                        Imports.LOGAN_SQUARE.IMPORTS);
                break;
            }
            case JACKSON: {
                generateHelper.setAnnotations(classItem,
                        PojoAnnotations.JACKSON.CLASS_ANNOTATION,
                        PojoAnnotations.JACKSON.ANNOTATION,
                        Imports.JACKSON.IMPORTS);
                break;
            }
            case AUTO_VALUE_GSON: {
                generateHelper.setAnnotations(classItem,
                        PojoAnnotations.AUTO_VALUE_GSON.CLASS_ANNOTATION,
                        PojoAnnotations.AUTO_VALUE_GSON.ANNOTATION,
                        Imports.AUTO_VALUE_GSON.IMPORTS);
                break;
            }
        }
    }
}