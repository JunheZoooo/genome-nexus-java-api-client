/*
 * Genome Nexus API
 * Genome Nexus Variant Annotation API
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.genome_nexus.client;

import org.genome_nexus.ApiCallback;
import org.genome_nexus.ApiClient;
import org.genome_nexus.ApiException;
import org.genome_nexus.ApiResponse;
import org.genome_nexus.Configuration;
import org.genome_nexus.Pair;
import org.genome_nexus.ProgressRequestBody;
import org.genome_nexus.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.genome_nexus.client.VariantAnnotationSummary;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnnotationSummaryControllerApi {
    private ApiClient apiClient;

    public AnnotationSummaryControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AnnotationSummaryControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for fetchVariantAnnotationPOST1
     * @param variants List of variants. For example [\&quot;X:g.66937331T&gt;A\&quot;,\&quot;17:g.41242962_41242963insGA\&quot;] (required)
     * @param isoformOverrideSource Isoform override source. For example uniprot (optional)
     * @param projection Indicates whether to return summary for all transcripts or only for canonical transcript (optional, default to ALL)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call fetchVariantAnnotationPOST1Call(List<String> variants, String isoformOverrideSource, String projection, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = variants;

        // create path and map variables
        String localVarPath = "/annotation/summary";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (isoformOverrideSource != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("isoformOverrideSource", isoformOverrideSource));
        if (projection != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("projection", projection));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call fetchVariantAnnotationPOST1ValidateBeforeCall(List<String> variants, String isoformOverrideSource, String projection, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'variants' is set
        if (variants == null) {
            throw new ApiException("Missing the required parameter 'variants' when calling fetchVariantAnnotationPOST1(Async)");
        }
        

        com.squareup.okhttp.Call call = fetchVariantAnnotationPOST1Call(variants, isoformOverrideSource, projection, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves VEP annotation summary for the provided list of variants
     * 
     * @param variants List of variants. For example [\&quot;X:g.66937331T&gt;A\&quot;,\&quot;17:g.41242962_41242963insGA\&quot;] (required)
     * @param isoformOverrideSource Isoform override source. For example uniprot (optional)
     * @param projection Indicates whether to return summary for all transcripts or only for canonical transcript (optional, default to ALL)
     * @return List&lt;VariantAnnotationSummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<VariantAnnotationSummary> fetchVariantAnnotationPOST1(List<String> variants, String isoformOverrideSource, String projection) throws ApiException {
        ApiResponse<List<VariantAnnotationSummary>> resp = fetchVariantAnnotationPOST1WithHttpInfo(variants, isoformOverrideSource, projection);
        return resp.getData();
    }

    /**
     * Retrieves VEP annotation summary for the provided list of variants
     * 
     * @param variants List of variants. For example [\&quot;X:g.66937331T&gt;A\&quot;,\&quot;17:g.41242962_41242963insGA\&quot;] (required)
     * @param isoformOverrideSource Isoform override source. For example uniprot (optional)
     * @param projection Indicates whether to return summary for all transcripts or only for canonical transcript (optional, default to ALL)
     * @return ApiResponse&lt;List&lt;VariantAnnotationSummary&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<VariantAnnotationSummary>> fetchVariantAnnotationPOST1WithHttpInfo(List<String> variants, String isoformOverrideSource, String projection) throws ApiException {
        com.squareup.okhttp.Call call = fetchVariantAnnotationPOST1ValidateBeforeCall(variants, isoformOverrideSource, projection, null, null);
        Type localVarReturnType = new TypeToken<List<VariantAnnotationSummary>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves VEP annotation summary for the provided list of variants (asynchronously)
     * 
     * @param variants List of variants. For example [\&quot;X:g.66937331T&gt;A\&quot;,\&quot;17:g.41242962_41242963insGA\&quot;] (required)
     * @param isoformOverrideSource Isoform override source. For example uniprot (optional)
     * @param projection Indicates whether to return summary for all transcripts or only for canonical transcript (optional, default to ALL)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call fetchVariantAnnotationPOST1Async(List<String> variants, String isoformOverrideSource, String projection, final ApiCallback<List<VariantAnnotationSummary>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = fetchVariantAnnotationPOST1ValidateBeforeCall(variants, isoformOverrideSource, projection, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<VariantAnnotationSummary>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for fetchVariantAnnotationSummaryGET
     * @param variant Variant. For example 17:g.41242962_41242963insGA (required)
     * @param isoformOverrideSource Isoform override source. For example uniprot (optional)
     * @param projection Indicates whether to return summary for all transcripts or only for canonical transcript (optional, default to ALL)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call fetchVariantAnnotationSummaryGETCall(String variant, String isoformOverrideSource, String projection, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/annotation/summary/{variant}"
            .replaceAll("\\{" + "variant" + "\\}", apiClient.escapeString(variant.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (isoformOverrideSource != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("isoformOverrideSource", isoformOverrideSource));
        if (projection != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("projection", projection));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call fetchVariantAnnotationSummaryGETValidateBeforeCall(String variant, String isoformOverrideSource, String projection, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'variant' is set
        if (variant == null) {
            throw new ApiException("Missing the required parameter 'variant' when calling fetchVariantAnnotationSummaryGET(Async)");
        }
        

        com.squareup.okhttp.Call call = fetchVariantAnnotationSummaryGETCall(variant, isoformOverrideSource, projection, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves VEP annotation summary for the provided variant
     * 
     * @param variant Variant. For example 17:g.41242962_41242963insGA (required)
     * @param isoformOverrideSource Isoform override source. For example uniprot (optional)
     * @param projection Indicates whether to return summary for all transcripts or only for canonical transcript (optional, default to ALL)
     * @return VariantAnnotationSummary
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VariantAnnotationSummary fetchVariantAnnotationSummaryGET(String variant, String isoformOverrideSource, String projection) throws ApiException {
        ApiResponse<VariantAnnotationSummary> resp = fetchVariantAnnotationSummaryGETWithHttpInfo(variant, isoformOverrideSource, projection);
        return resp.getData();
    }

    /**
     * Retrieves VEP annotation summary for the provided variant
     * 
     * @param variant Variant. For example 17:g.41242962_41242963insGA (required)
     * @param isoformOverrideSource Isoform override source. For example uniprot (optional)
     * @param projection Indicates whether to return summary for all transcripts or only for canonical transcript (optional, default to ALL)
     * @return ApiResponse&lt;VariantAnnotationSummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VariantAnnotationSummary> fetchVariantAnnotationSummaryGETWithHttpInfo(String variant, String isoformOverrideSource, String projection) throws ApiException {
        com.squareup.okhttp.Call call = fetchVariantAnnotationSummaryGETValidateBeforeCall(variant, isoformOverrideSource, projection, null, null);
        Type localVarReturnType = new TypeToken<VariantAnnotationSummary>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves VEP annotation summary for the provided variant (asynchronously)
     * 
     * @param variant Variant. For example 17:g.41242962_41242963insGA (required)
     * @param isoformOverrideSource Isoform override source. For example uniprot (optional)
     * @param projection Indicates whether to return summary for all transcripts or only for canonical transcript (optional, default to ALL)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call fetchVariantAnnotationSummaryGETAsync(String variant, String isoformOverrideSource, String projection, final ApiCallback<VariantAnnotationSummary> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = fetchVariantAnnotationSummaryGETValidateBeforeCall(variant, isoformOverrideSource, projection, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VariantAnnotationSummary>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
