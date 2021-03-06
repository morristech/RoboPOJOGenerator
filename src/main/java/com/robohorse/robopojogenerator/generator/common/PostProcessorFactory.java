package com.robohorse.robopojogenerator.generator.common;

import com.robohorse.robopojogenerator.generator.postprocessors.AbsPostProcessor;
import com.robohorse.robopojogenerator.injections.Injector;
import com.robohorse.robopojogenerator.models.GenerationModel;

import javax.inject.Inject;

/**
 * Created by vadim on 23.10.16.
 */
public class PostProcessorFactory {
    @Inject
    public PostProcessorFactory() {
    }

    public AbsPostProcessor createPostProcessor(GenerationModel generationModel) {
        if (generationModel.isUseKotlin()) {
            return Injector.getAppComponent().newKotlinDataClassPostProcessor();
        } else {
            switch (generationModel.getAnnotationItem()) {
                case AUTO_VALUE_GSON: {
                    return Injector.getAppComponent().newAutoValueClassPostProcessor();
                }
                default: {
                    return Injector.getAppComponent().newClassPostProcessor();
                }
            }
        }
    }
}
