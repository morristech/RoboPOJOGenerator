package com.robohorse.robopojogenerator.models;

import com.robohorse.robopojogenerator.generator.consts.AnnotationItem;

/**
 * Created by vadim on 28.09.16.
 */
public class GenerationModel {
    private boolean rewriteClasses;
    private boolean useKotlin;
    private AnnotationItem annotationItem;
    private String rootClassName;
    private String content;
    private boolean useSetters;
    private boolean useGetters;

    public boolean isRewriteClasses() {
        return rewriteClasses;
    }

    public AnnotationItem getAnnotationItem() {
        return annotationItem;
    }

    public String getRootClassName() {
        return rootClassName;
    }

    public String getContent() {
        return content;
    }

    public boolean isUseSetters() {
        return useSetters;
    }

    public boolean isUseGetters() {
        return useGetters;
    }

    public boolean isUseKotlin() {
        return useKotlin;
    }

    public static class Builder {
        private GenerationModel instance;

        public Builder() {
            instance = new GenerationModel();
        }

        public Builder setRewriteClasses(boolean rewriteClasses) {
            instance.rewriteClasses = rewriteClasses;
            return this;
        }

        public Builder useKotlin(boolean useKotlin) {
            instance.useKotlin = useKotlin;
            return this;
        }

        public Builder setAnnotationItem(AnnotationItem annotationItem) {
            instance.annotationItem = annotationItem;
            return this;
        }

        public Builder setRootClassName(String rootClassName) {
            instance.rootClassName = rootClassName;
            return this;
        }

        public Builder setSettersAvailable(boolean available) {
            instance.useSetters = available;
            return this;
        }

        public Builder setGettersAvailable(boolean available) {
            instance.useGetters = available;
            return this;
        }

        public Builder setContent(String content) {
            instance.content = content;
            return this;
        }

        public GenerationModel build() {
            return instance;
        }
    }
}
