/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.IoK8sApiAuthenticationV1TokenReview
import io.swagger.client.model.IoK8sApimachineryPkgApisMetaV1APIResourceList
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object Authentication_v1Api {

  /**
   * create a TokenReview
   * 
   * Expected answers:
   *   code 200 : IoK8sApiAuthenticationV1TokenReview (OK)
   *   code 201 : IoK8sApiAuthenticationV1TokenReview (Created)
   *   code 202 : IoK8sApiAuthenticationV1TokenReview (Accepted)
   *   code 401 :  (Unauthorized)
   * 
   * Available security schemes:
   *   BearerToken (apiKey)
   * 
   * @param body 
   * @param pretty If &#39;true&#39;, then the output is pretty printed.
   */
  def createAuthenticationV1TokenReview(body: IoK8sApiAuthenticationV1TokenReview, pretty: Option[String] = None)(implicit apiKey: ApiKeyValue): ApiRequest[IoK8sApiAuthenticationV1TokenReview] =
    ApiRequest[IoK8sApiAuthenticationV1TokenReview](ApiMethods.POST, "https://localhost", "/apis/authentication.k8s.io/v1/tokenreviews", "*/*")
      .withApiKey(apiKey, "authorization", HEADER)
      .withBody(body)
      .withQueryParam("pretty", pretty)
      .withSuccessResponse[IoK8sApiAuthenticationV1TokenReview](200)
      .withErrorResponse[IoK8sApiAuthenticationV1TokenReview](201)
      .withErrorResponse[IoK8sApiAuthenticationV1TokenReview](202)
      .withErrorResponse[Unit](401)
        /**
   * get available resources
   * 
   * Expected answers:
   *   code 200 : IoK8sApimachineryPkgApisMetaV1APIResourceList (OK)
   *   code 401 :  (Unauthorized)
   * 
   * Available security schemes:
   *   BearerToken (apiKey)
   */
  def getAuthenticationV1APIResources()(implicit apiKey: ApiKeyValue): ApiRequest[IoK8sApimachineryPkgApisMetaV1APIResourceList] =
    ApiRequest[IoK8sApimachineryPkgApisMetaV1APIResourceList](ApiMethods.GET, "https://localhost", "/apis/authentication.k8s.io/v1/", "application/json")
      .withApiKey(apiKey, "authorization", HEADER)
      .withSuccessResponse[IoK8sApimachineryPkgApisMetaV1APIResourceList](200)
      .withErrorResponse[Unit](401)
      

}

