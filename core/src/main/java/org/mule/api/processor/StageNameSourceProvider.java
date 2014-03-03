package org.mule.api.processor;

/**
 * @since 3.5.0
 */
public interface StageNameSourceProvider
{

    public StageNameSource getAsyncStageNameSource();

    public StageNameSource getAsyncStageNameSource(String asyncName);

}
